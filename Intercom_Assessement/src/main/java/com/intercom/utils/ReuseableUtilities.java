package com.intercom.utils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.intercom.model.CustomerObject;

public class ReuseableUtilities {
	
	 /**
     * Used JACKSON to convert JSON to Object. 
     * JACKSON is well suited and performs better for large input. Intercom houses around 450+ employees,
     * and is expanding rapidly. JACSON is used considering the Scalability in near future.
     * BufferedReader is used keeping Memory efficiency in consideration.
     */	
	public List<CustomerObject> readCustomerData(String file_address) throws IOException{
		List<CustomerObject> customer_Object_List = new ArrayList<CustomerObject>();
		URL url = new URL(file_address);
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream())); 
		String json_stinng; 
		ObjectMapper objectMapper = new ObjectMapper();
		while ((json_stinng = br.readLine()) != null){ 
			CustomerObject ronaldo =  (CustomerObject) objectMapper.readValue(json_stinng, CustomerObject.class);
			customer_Object_List.add(ronaldo); 
		} 
		 return customer_Object_List;
	 }
	 /**
     * Using BufferedWriter for scalability. 
     * When number of write operations are more, it uses internal buffer 
     * to reduce real IO operations and saves time
     */	
	 public Boolean writeData(Path output_path, String[] output_array) throws IOException{
		
		 
		 FileWriter fr = null;
	     BufferedWriter br = null;
		 File f = new File(output_path.toString());
	     try{
	    	 if (f.delete()) {
					Files.createFile(output_path);
			}
	         fr = new FileWriter(output_path.toString());
	         br = new BufferedWriter(fr);
	         for(String customer_data : output_array){
	        	 br.write(customer_data+" "+System.getProperty("line.separator"));
			 }
	         
	     } catch (IOException e) {
	         e.printStackTrace();
	     }finally{
	         try {
	             br.close();
	             fr.close();
	         } catch (IOException e) {
	             e.printStackTrace();
	         }
	     }		 
		 //System.out.println(":"+ distance);
		 return true;
	  }
}
