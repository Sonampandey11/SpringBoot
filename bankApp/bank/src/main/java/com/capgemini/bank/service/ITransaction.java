package com.capgemini.bank.service;

import com.capgemini.bank.model.Transaction;

public interface ITransaction {
	public Transaction createTransaction(Transaction transaction);
	public void generateTransactionReport(Transaction transaction);

}
