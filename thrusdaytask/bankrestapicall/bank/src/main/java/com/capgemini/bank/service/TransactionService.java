package com.capgemini.bank.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bank.dao.AccountRepository;
import com.capgemini.bank.dao.CustomerRepository;
import com.capgemini.bank.dao.TransactionRepository;
import com.capgemini.bank.exception.CustomerException;
import com.capgemini.bank.model.Account;
import com.capgemini.bank.model.Customer;
import com.capgemini.bank.model.Transaction;
import com.capgemini.bank.wrapper.TransactionWrapper;

@Service
public class TransactionService implements ITransaction {
	
	@Autowired
	TransactionRepository repository;
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	AccountRepository accountRepository;

	@Override
	public void createTransaction(Customer cust, Account acc, BigDecimal amount, String type) {

		Transaction txn = new Transaction();
		txn.setCustomer(cust);
		txn.setAccount(acc);
		txn.setAmount(amount);
		txn.setTransactionType(type);
		repository.save(txn);

	}

	@Override
	public Optional<Transaction> generateTransactionReport(Integer customerId) throws CustomerException {
		System.out.println("value>>>>>>>>>" + customerId);
		final Optional<Transaction> list = repository.findBytransactionId(customerId);
		System.out.println("value is" + customerId);
		return list;

	}
}
