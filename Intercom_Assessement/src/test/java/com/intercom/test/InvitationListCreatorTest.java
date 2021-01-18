package com.intercom.test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import org.junit.jupiter.api.Test;
import org.junit.Test;

import com.intercom.controller.InvitationListCreator;
import com.intercom.model.CustomerObject;
import com.intercom.utils.Constants;

public class InvitationListCreatorTest {
	public InvitationListCreator invitationObject = new InvitationListCreator();
	@Test
	public void genetrateInvitationListTest() throws Exception {
	    String[] args = null;
		InvitationListCreator.main(args);
		assertEquals("https://s3.amazonaws.com/intercom-take-home-test/customers.txt", Constants.INPUT_FILE_PATH);
	}
	@Test
	public void CalculateGreatCircleTest() {
		List<CustomerObject> customer_object_list = new ArrayList<CustomerObject>();
		List<CustomerObject> invitation_List = new ArrayList<CustomerObject>();
		
		customer_object_list.add(new CustomerObject(2, "Christina", 53.2451022f, -6.238335f));
		customer_object_list.add(new CustomerObject(8, "Nora", 55.033f, -8.112f));
		customer_object_list.add(new CustomerObject(4, "Olive", 53f, -7f));
		customer_object_list.add(new CustomerObject(6, "Lisa", 51.92893f, -10.27699f));
		customer_object_list.add(new CustomerObject(6, "Charlie", 51.92893f, -10.27699f));
		
		double Dub_off_Lat = 53.339428;
		double Dub_off_Long = -6.257664;
		double kilometerRange = 100d;
		
		Collections.sort(customer_object_list);
		
		// Time Complexity O(n)
		for(CustomerObject customer_Object : customer_object_list){
			if(invitationObject.CalculateGreatCircle(customer_Object,Dub_off_Lat,Dub_off_Long,kilometerRange)){
				invitation_List.add(customer_Object);
			}
		}
		System.out.println(invitation_List.size());
		System.out.println(invitation_List.toString());
		assertEquals(2, invitation_List.size());
		assertEquals(2, invitation_List.get(0).getUser_id());
		assertEquals("Olive", invitation_List.get(1).getName());
	}
	@Test
	public void isValidCoordinatesTest() {
		
		List<CustomerObject> customer_object_list = new ArrayList<CustomerObject>();
		customer_object_list.add(new CustomerObject(2, "Christina", 53.2451022f, -6.238335f));
		customer_object_list.add(new CustomerObject(8, "Nora", -95.3f  , -8.112f));
		customer_object_list.add(new CustomerObject(4, "Olive", 53f, -270f));
		Boolean[] isvalid = new Boolean[customer_object_list.size()];
		for(int i = 0; i<customer_object_list.size(); i++) {
			isvalid[i] = invitationObject.isValidCoordinates(customer_object_list.get(i).getLatitude() ,customer_object_list.get(i).getLongitude());
		}
		assertEquals(true, isvalid[0]);
		assertEquals(false, isvalid[1]);
		assertEquals(false, isvalid[1]);
	}
	
	@Test
	public void getConstantsTest() {
		assertEquals(Constants.DUBLIN_OFFICE_LATITUDE,Constants.DUBLIN_OFFICE_LATITUDE);
	}
}
