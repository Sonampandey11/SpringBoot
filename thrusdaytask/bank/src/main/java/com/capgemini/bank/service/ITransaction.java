package com.capgemini.bank.service;

import java.util.List;

import com.capgemini.bank.exception.CustomerException;
import com.capgemini.bank.model.Transaction;
import com.capgemini.bank.wrapper.TransactionWrapper;

public interface ITransaction {
	public Transaction createTransaction(Transaction transaction);
	public List<Transaction> generateTransactionReport(Transaction transaction)throws CustomerException;

}
