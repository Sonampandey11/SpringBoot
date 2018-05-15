package com.example.demo.controller;
import java.util.Optional;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.exception.CustomerException;
import com.example.demo.model.Customer;
import com.example.demo.model.Supplier;
import com.example.demo.service.CustomerService;
import com.example.demo.service.SupplierService;

@RestController
@RequestMapping(value="/customerdetail/main")
public class CustomerController  {

	private static final Logger log = Logger.getLogger(CustomerController.class.getName());
	@Autowired
	public CustomerService service;

	@Autowired
	public SupplierService supservice;


	//adding customer details
	@PostMapping(value="/customerdetail")
	public Customer addCustomer(@RequestBody final Customer customer)
	{
		try {
         System.out.println("in controller");
			return service.addCustomer(customer);
		} catch (CustomerException e) {

			log.info("Please enter cotrect detail");
		}
		return customer;

	}

	//view customerdetails by id
	@GetMapping(value="/view/{customerId}")
	public ResponseEntity<?> viewCustomerDetail(@PathVariable("customerId") final Integer customerId ) throws CustomerException
	{
		try {
			System.out.println("request object >>" + customerId);

			Customer cust=service.viewCustomerDetail(customerId);
			System.out.println("Response >> " + cust);
			return new ResponseEntity<Customer>(cust,HttpStatus.OK);

		} catch (CustomerException e) {
			return new ResponseEntity<String>(
					"Please Enter valid customerId",HttpStatus.OK);
			//throw new  CustomerException("Please Enter valid customerId");

		}


	}



	//delete customer details by id
	@DeleteMapping(value="/delete/{customerId}")
	public void deleteCustomer(@PathVariable("customerId") final Integer customerId)
	{
		try {
			System.out.println("in controller");
			service.deleteCustomer(customerId);
		} catch (CustomerException e) {

			log.info("Please enter valid customerid");
		}
	}


	@PutMapping(value="/update/{customerId}")
	public Customer updateCustomer(@PathVariable("customerId") final Integer customerId)
	{
		System.out.println(customerId);
		try {
			
			return service.updateCustomer(customerId);
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@PostMapping(value="/supplier")
	public Supplier addSupplier(final Supplier supplier)
	{
		return supservice.addSupplier(supplier);
	}

	@GetMapping(value="/views/{supplierId}")
	public Optional<Supplier> viewSupplier(@PathVariable("supplierId") final Integer supplierId)
	{
		return supservice.viewSupplier(supplierId);

	}

	@PutMapping(value="/updateS/{supplierId}")
	public Supplier updateSupplier(@PathVariable("supplierId") final Integer supplierId)
	{
		return supservice.updateSupplier(supplierId);
	}
}
