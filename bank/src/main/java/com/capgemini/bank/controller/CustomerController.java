package com.capgemini.bank.controller;

import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bank.exception.CustomerException;
import com.capgemini.bank.model.Customer;
import com.capgemini.bank.service.CustomerService;



@RestController
@RequestMapping("/bankdetail")
public class CustomerController {
	private static final Logger log = Logger.getLogger(CustomerController.class.getName());
	@Autowired
	CustomerService customerService;

	@PostMapping(value="/createCustom")
	public Customer createCustomer(@RequestBody Customer customer)
	{
		try {
			return customerService.createCustomer(customer);
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			log.info("please enter approriate detai");
		}
		return customer;

	}

	
	@GetMapping(value="/fetchdetail")
	public ResponseEntity<?> getCustomerDetails()
	{
		List<Customer> customer;
		customer=customerService.getCustomerDetails();
		return new ResponseEntity<List<Customer>>(customer,HttpStatus.OK);
		
		
		
	}


}
