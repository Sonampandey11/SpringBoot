package com.example.demo.service;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.CustomerRepository;
import com.example.demo.exception.CustomerException;
import com.example.demo.model.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public Customer addCustomer(Customer customer) throws CustomerException 
	{
		try {
			return customerRepository.save(customer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new CustomerException("Please enter valid details");
		}
	
	}


	public Customer viewCustomerDetail(Integer customerId) throws CustomerException
	{
		System.out.println(customerId);
		
		try {
			
				return customerRepository.findById(customerId).get();	
			
		} catch (Exception e) {
			throw new CustomerException("CustomerId doesn't exist");
			
		}
	}


	public void deleteCustomer(Integer customerId) throws CustomerException
	{
      Customer customer=new Customer();
      
		try {
			if(customer.getCustomerId().equals(customerId))
			{
				customerRepository.deleteById(customerId);
			}
			
		} catch (Exception e) {
			throw new CustomerException("Please enter valid customerId ");
		}
	}


	public Customer updateCustomer(Integer customerId) throws CustomerException {
		Customer customer= new Customer();
		customer.setCustomerId(31);
		customer.setCustomerName("sonam");
		System.out.println(customer);
		return customerRepository.save(customer);
	}
}