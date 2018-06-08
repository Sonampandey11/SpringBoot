package com.capgemini.bank.service;

import java.io.IOException;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.capgemini.bank.dao.BankRepository;
import com.capgemini.bank.dao.CustomerRepository;
import com.capgemini.bank.model.Audit;
import com.capgemini.bank.model.AuditEnum.eventName;
import com.capgemini.bank.model.AuditEnum.eventType;
import com.capgemini.bank.model.Bank;
import com.capgemini.bank.model.Customer;
import com.capgemini.bank.rabbitconfig.RabbitConfig;
import com.capgemini.bank.wrapper.CustomerWrapper;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
@Component
public class CustomerService implements ICustomerService {
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	RabbitTemplate rabbitTemplate;
	@Autowired
	BankRepository repo;

	public Customer createCustomer(final CustomerWrapper cust) {

		Customer customer = null;
		Customer customerData = null;
		customer = cust.getCust();

		final Integer bankId = cust.getBankId();
		final Optional<Bank> bankList = repo.findByBankId(bankId);

		final Bank bank = bankList.get();

		customer.setBank(bank);

		customerData = customerRepository.save(customer);
		// System.out.println(customerData);
		return customerData;

	}

	public List<Customer> getCustomerDetails() {
		return customerRepository.findAll();

	}

	public Customer getCustomerDetailsById(final Integer customerId) {
		// TODO Auto-generated method stub
		return customerRepository.findByCustomerId(customerId).get();
	}
	public static String fromJavaToJson(Audit auditObj)
			throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper jsonMapper = new ObjectMapper();
		return jsonMapper.writeValueAsString(auditObj);
	}
	@Override
	public Optional<Customer> updateCustomer(final Integer customerId, final String name)
			throws CloneNotSupportedException {
		final Optional<Customer> cusObject = customerRepository.findByCustomerId(customerId);
		final Customer cus = cusObject.get();
		Customer oldvalue = cus.clone();

		if (cusObject.isPresent()) {

			Date date=new Date();
			cus.setName(name);
			customerRepository.save(cus);
			Audit audit = new Audit(eventName.Customer.toString(), eventType.update.toString(), date, cus.getUserId(),
					oldvalue, cus);
			System.out.println("hii");
			String rabbitSendData = null;
			try {
				 rabbitSendData =	CustomerService.fromJavaToJson(audit);
			} catch (JsonGenerationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			rabbitTemplate.convertAndSend(RabbitConfig.ROUTING_KEY, rabbitSendData);
			//auditService.createAudit(audit);
			return cusObject;

		}
		return cusObject;

	}
}
