package com.intercom.test;
import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;
import org.junit.Test;

import com.intercom.model.CustomerObject;

public class CustomerPOJOTest {

	@Test
	public void customerObjecttest() {
		CustomerObject customer_test = new CustomerObject();
		customer_test.setUser_id(1);
		customer_test.setName("Intercome");
		customer_test.setLatitude(48f);
		customer_test.setLongitude(9.3f);
		CustomerObject customer_constructor_test = new CustomerObject(13,"Brayan", 54f, 5f);
		assertEquals("Brayan", customer_constructor_test.getName());
		assertEquals(48.0f, customer_test.getLatitude());
	}

}
