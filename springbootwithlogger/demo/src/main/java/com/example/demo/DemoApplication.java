package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@SpringBootApplication
public class DemoApplication implements ApplicationRunner{
	
	@Autowired
	private CustomerService customerService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Customer customer=new Customer();
		
		customer.setCustomerId(33);
		customer.setCustomerName("avni");
		customer.setCustomerAddress("Mumbai");
		customer.setPaymentMode("cach");
		customer.setRetailerId(20);
		System.out.println(customer);
        customerService.addCustomer(customer);
		
	}
	
	
}
