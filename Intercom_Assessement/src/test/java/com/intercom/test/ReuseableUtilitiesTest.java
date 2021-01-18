package com.intercom.test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

//import org.junit.jupiter.api.Test;
import org.junit.Test;

import com.intercom.model.CustomerObject;
import com.intercom.utils.Constants;
import com.intercom.utils.ReuseableUtilities;
public class ReuseableUtilitiesTest {

	@Test
	public void readCustomerDataTest() throws IOException {
		List<CustomerObject> customer_object_list = new ArrayList<CustomerObject>();
		//Path currentRelativePath = Paths.get("");
		//Path input_file = Paths.get(currentRelativePath.toAbsolutePath().toString()+Constants.INPUT_FILE_PATH_TEST);
		//String input_file_path = input_file.toString();
		ReuseableUtilities readData = new ReuseableUtilities();
		customer_object_list = readData.readCustomerData(Constants.INPUT_FILE_PATH);
		assertEquals(32,customer_object_list.size());
	}
	
	@Test
	public void writeCustomerDataTest() throws IOException {
		//Path currentRelativePath = Paths.get("");
		//Path input_file = Paths.get(currentRelativePath.toAbsolutePath().toString()+Constants.OUTPUT_FILE_PATH_TEST);
		//String output_file_path = input_file.toString();
		ReuseableUtilities writeData = new ReuseableUtilities();
		
		List<CustomerObject> customer_object_list = new ArrayList<CustomerObject>();
		customer_object_list.add(new CustomerObject(2, "Christina", 53.2451022f, -6.238335f));
		customer_object_list.add(new CustomerObject(8, "Nora", -95.3f  , -8.112f));
		String[] output_array = new String[customer_object_list.size()]; 
		for(int i = 0; i< customer_object_list.size();i++){
			output_array[i] = customer_object_list.get(i).toString();
		}
		Path output_path = Paths.get("Output_Invitation_List_Test.txt");
		writeData.writeData(output_path,output_array);
		
		Path p = Paths.get(output_path.toString());
		boolean exists = Files.exists(p);
		assertEquals(true, exists);

	}
}
