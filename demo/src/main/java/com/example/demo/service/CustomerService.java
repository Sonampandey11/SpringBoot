package com.example.demo.service;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.CustomerRepository;
import com.example.demo.model.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public Customer addCustomer(Customer customer)
	{
		return customerRepository.save(customer);
	}


	public Optional<Customer> viewCustomerDetail(Integer customerId)
	{
		System.out.println(customerId);
		return customerRepository.findById(customerId);
	}


	public void deleteCustomer(Integer customerId) {

		customerRepository.deleteById(customerId);
	}


	public Customer updateCustomer(Integer customerId) {
		Customer customer= new Customer();
		customer.setCustomerId(31);
		customer.setCustomerName("sonam");
		System.out.println(customer);
		return customerRepository.save(customer);
	}
}