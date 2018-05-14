package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.exception.CustomerException;
import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

public class CustomerTest {

@Autowired
CustomerService customer;

@Autowired
Customer cust;
@Test
public void testViewCustomer()

{ 
	try {
		assertEquals(33, customer.viewCustomerDetail(cust.getCustomerId()));
	} catch (CustomerException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
}
