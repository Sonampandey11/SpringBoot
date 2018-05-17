package com.capgemini.bank.service;

import org.springframework.stereotype.Service;

import com.capgemini.bank.model.Transaction;
@Service
public class TransactionService implements ITransaction{

	@Override
	public Transaction createTransaction(Transaction transaction) {
		
		return null;
	}

	@Override
	public void generateTransactionReport(Transaction transaction) {
		
		
	}

}
