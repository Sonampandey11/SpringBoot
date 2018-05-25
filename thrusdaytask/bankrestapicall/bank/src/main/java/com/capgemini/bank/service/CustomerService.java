package com.capgemini.bank.service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Service;

import com.capgemini.bank.dao.BankRepository;
import com.capgemini.bank.dao.CustomerRepository;
import com.capgemini.bank.exception.CustomerException;
import com.capgemini.bank.model.Audit;
import com.capgemini.bank.model.AuditEnum.eventName;
import com.capgemini.bank.model.AuditEnum.eventType;
import com.capgemini.bank.model.Bank;
import com.capgemini.bank.model.Customer;
import com.capgemini.bank.wrapper.CustomerWrapper;

@Service
public class CustomerService implements ICustomerService {
	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	AuditServiceTemplate template;

	@Autowired
	BankRepository repo;

	public Customer createCustomer(final CustomerWrapper cust) 
	{

		Customer customer = null;
		Customer customerData = null;
		customer = cust.getCust();

		final Integer bankId = cust.getBankId();
		final Optional<Bank> bankList = repo.findById(bankId);

		final Bank bank = bankList.get();

		customer.setBank(bank);

		customerData = customerRepository.save(customer);
		// System.out.println(customerData);
		return customerData;


	}

	public List<Customer> getCustomerDetails()
	{
		return customerRepository.findAll();


	}

	public Customer getCustomerDetailsById(final Integer customerId) {
		// TODO Auto-generated method stub
		return customerRepository.findById(customerId).get();
	}

	@Override
	public Optional<Customer> updateCustomer(final Integer customerId, final String name) throws CloneNotSupportedException {
		final Optional<Customer> cusObject=customerRepository.findById(customerId);
		final Customer cus=cusObject.get();
		Customer oldvalue=cus.clone();


		if(cusObject.isPresent())
		{

			LocalDateTime time=LocalDateTime.now();
			cus.setName(name);
			customerRepository.save(cus);
			Audit audit = new Audit(eventName.Customer.toString(),eventType.update.toString(),time,cus.getUserId(), oldvalue,cus);

			template.createAuditServiceImpl(audit);
			return cusObject;

		}
		return cusObject;

	}
}

