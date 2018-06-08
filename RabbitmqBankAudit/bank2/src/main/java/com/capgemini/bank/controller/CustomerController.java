package com.capgemini.bank.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.bank.exception.CustomerException;
import com.capgemini.bank.model.Bank;
import com.capgemini.bank.model.Customer;
import com.capgemini.bank.service.BankServiceImpl;
import com.capgemini.bank.service.CustomerService;
import com.capgemini.bank.wrapper.CustomerWrapper;



@RestController
@RequestMapping("/bankdetail")
public class CustomerController {
	private static final Logger log = Logger.getLogger(CustomerController.class.getName());
	@Autowired
	CustomerService customerService;
	@Autowired
	BankServiceImpl service;

	@PostMapping(value="/createCustom")
	public Customer createCustomer(final @RequestBody CustomerWrapper customer)
	{
		Customer cust = customerService.createCustomer(customer);
		return cust;
	}


	@GetMapping(value="/fetchdetail")
	public ResponseEntity<?> getCustomerDetails() throws CustomerException
	{
		List<Customer> customer;

		customer=customerService.getCustomerDetails();
		return new ResponseEntity<List<Customer>>(customer,HttpStatus.OK);

	}

	@GetMapping(value="/view/{customerId}")
	public ResponseEntity<?> getCustomerDetailsById(@PathVariable("customerId") final Integer customerId ) throws CustomerException
	{
		System.out.println("request object >>" + customerId);

		Customer cust=customerService.getCustomerDetailsById(customerId);
		System.out.println("Response >> " + cust);
		return new ResponseEntity<Customer>(cust,HttpStatus.OK);

	}

	@GetMapping(value="/update/{customerId}/{name}")
	public ResponseEntity<Customer> updateCustomer(final @PathVariable ("customerId") Integer customerId
			,final @PathVariable ("name") String name)throws CustomerException, CloneNotSupportedException
	{
		final Optional<Customer> obj=customerService.updateCustomer(customerId, name);
		final Customer cust=obj.get();

		return new ResponseEntity<Customer>(cust,HttpStatus.OK);

	}

}
