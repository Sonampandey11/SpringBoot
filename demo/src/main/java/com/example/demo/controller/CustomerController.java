package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.model.Supplier;
import com.example.demo.service.CustomerService;
import com.example.demo.service.SupplierService;

@RestController
@RequestMapping(value="/customerdetail/main")
public class CustomerController {
	@Autowired
	public CustomerService service;
	
	@Autowired
	public SupplierService supservice;
	
	
	//adding customer details
	@PostMapping(value="/customerdetail")
	public Customer addCustomer(Customer customer)
	{
		return service.addCustomer(customer);
		
	}
	
	//view customerdetails by id
	@GetMapping(value="/view/{customerId}")
	public Optional<Customer> viewCustomerDetail(@PathVariable("customerId") Integer customerId )
	{
	return service.viewCustomerDetail(customerId);
	}
	
	
	
	//delete customer details by id
	@DeleteMapping(value="/delete/{customerId}")
	public void deleteCustomer(@PathVariable("customerId") Integer customerId)
	{
	service.deleteCustomer(customerId);
	}
	
	
	@PutMapping(value="/update/{customerId}")
	public Customer updateCustomer(@PathVariable("customerId") Integer customerId)
	{
		System.out.println(customerId);
		return service.updateCustomer(customerId);
	}
	
	@PostMapping(value="/supplier")
	public Supplier addSupplier(Supplier supplier)
	{
		return supservice.addSupplier(supplier);
	}
	
	@GetMapping(value="/views/{supplierId}")
	public Optional<Supplier> viewSupplier(@PathVariable("supplierId") Integer supplierId)
	{
		return supservice.viewSupplier(supplierId);
		
	}
	
	@PutMapping(value="/updateS/{supplierId}")
	public Supplier updateSupplier(@PathVariable("supplierId") Integer supplierId)
	{
		return supservice.updateSupplier(supplierId);
	}
}
