package com.capgemini.bank.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.capgemini.bank.exception.CustomerException;
import com.capgemini.bank.model.Account;
import com.capgemini.bank.model.Customer;
import com.capgemini.bank.model.Transaction;
import com.capgemini.bank.wrapper.TransactionWrapper;

public interface ITransaction {
	
	public void createTransaction(Customer cust, Account acc , BigDecimal amount , String type);
	
	public Optional<Transaction> generateTransactionReport(Integer customerId) throws CustomerException;

}
