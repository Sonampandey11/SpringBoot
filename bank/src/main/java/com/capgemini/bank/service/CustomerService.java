package com.capgemini.bank.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bank.dao.CustomerRepository;
import com.capgemini.bank.exception.CustomerException;
import com.capgemini.bank.model.Customer;

@Service
public class CustomerService implements ICustomerService {
	@Autowired
	CustomerRepository customerRepository;
	public Customer createCustomer(Customer customer) throws CustomerException
	{
		return customerRepository.save(customer);
		
	}
	
	public List<Customer> getCustomerDetails()
	{
		return customerRepository.findAll();
		
		
	}

	
}
