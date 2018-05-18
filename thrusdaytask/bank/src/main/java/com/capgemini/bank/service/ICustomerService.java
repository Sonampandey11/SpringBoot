package com.capgemini.bank.service;

import java.util.List;
import java.util.Set;

import com.capgemini.bank.exception.CustomerException;
import com.capgemini.bank.model.Customer;

public interface ICustomerService {

	public Customer  createCustomer(Customer customer) throws CustomerException;
	public List<Customer> getCustomerDetails();
}
