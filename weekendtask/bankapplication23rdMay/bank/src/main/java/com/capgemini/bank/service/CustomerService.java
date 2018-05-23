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
		try {
			return customerRepository.save(customer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new CustomerException("customer details is not valid");
		}
		
	}
	
	public List<Customer> getCustomerDetails()
	{
		return customerRepository.findAll();
		
		
	}

	public Customer getCustomerDetailsById(Integer customerId) {
		// TODO Auto-generated method stub
		return customerRepository.findById(customerId).get();
	}

	
}
