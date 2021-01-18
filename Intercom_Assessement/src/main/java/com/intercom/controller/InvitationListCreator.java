package com.intercom.controller;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.intercom.model.CustomerObject;
import com.intercom.utils.ReuseableUtilities;

import com.intercom.utils.Constants;

import java.lang.Math.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InvitationListCreator {
	static List<CustomerObject> customer_object_list = new ArrayList<CustomerObject>();
	static ReuseableUtilities re_util; 
	public static void main(String args [])throws IOException{

			InvitationListCreator list_object = new InvitationListCreator();
			re_util = new ReuseableUtilities();
			customer_object_list = re_util.readCustomerData(Constants.INPUT_FILE_PATH); // Read file from Online Link
			String [] invitation_list = list_object.genetrateInvitationList();
			Path output_path = Paths.get("Output_Invitation_List.txt");
			re_util.writeData(output_path,invitation_list); //Write file

			System.out.println("List of customers in range: ");
			System.out.println(Arrays.toString(invitation_list));
	}
	
	public String[] genetrateInvitationList(){
		List<CustomerObject> invitation_List = new ArrayList<CustomerObject>();
		
		double dublin_office_Lat = Constants.DUBLIN_OFFICE_LATITUDE;
		double dublin_office_Long = Constants.DUBLIN_OFFICE_LONGITUDE;
		double kilometerRange = Constants.DEFAULT_RANGE_IN_KM;
		
		Collections.sort(customer_object_list);
		// Time Complexity O(n)
		for(CustomerObject customer_Object : customer_object_list){
			if(CalculateGreatCircle(customer_Object,dublin_office_Lat,dublin_office_Long,kilometerRange)){
				invitation_List.add(customer_Object);
			}
		}
		int output_size = invitation_List.size();
		String[] output_array = new String[output_size]; 
		for(int i = 0; i< output_size;i++){
			output_array[i] = invitation_List.get(i).toString();
		}
		return output_array;
	}
	
	public boolean CalculateGreatCircle(CustomerObject customer_Object, double client_latitude, double client_longitude, double kilometerRange){
		double employee_latitude = Math.toRadians(customer_Object.getLatitude());
		double employee_longitude = Math.toRadians(customer_Object.getLongitude());
		client_latitude = Math.toRadians(client_latitude);
		client_longitude = Math.toRadians(client_longitude);
		if(isValidCoordinates(employee_latitude,employee_latitude)){
			double distance = 6371 * (Math.acos(Math.sin(client_latitude) 
					* Math.sin(employee_latitude) + Math.cos(client_latitude) 
					* Math.cos(employee_latitude) * Math.cos(client_longitude - employee_longitude)));
			if(distance < kilometerRange){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	public boolean isValidCoordinates(double latitude,double longitude){
		if(latitude >= -90 && latitude <= 90 && longitude >= -180 && longitude <= 180){
			return true;
		}else {
			System.out.println("Invalid Geographic Coordinates");
			System.out.println("Universally Accepted Standards");
			System.out.println("Latitude Between <-90,90> and Longitude Between <-180,180>");
			System.out.println("Given Input:-");
			System.out.println("Latitude:- "+ latitude +" Longitude"+longitude+"\n\n");
			return false;
		}
		
	}
	
}
