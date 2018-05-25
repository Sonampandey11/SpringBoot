package com.capgemini.bank.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import com.capgemini.bank.exception.CustomerException;
import com.capgemini.bank.model.Customer;
import com.capgemini.bank.wrapper.CustomerWrapper;


public interface ICustomerService {

	public Customer  createCustomer(CustomerWrapper customer);
	public List<Customer> getCustomerDetails();
	public Optional<Customer> updateCustomer(Integer customerId,String name) throws CloneNotSupportedException;
}
