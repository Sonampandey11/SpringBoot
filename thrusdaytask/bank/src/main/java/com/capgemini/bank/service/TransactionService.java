package com.capgemini.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bank.dao.TransactionRepository;
import com.capgemini.bank.exception.CustomerException;
import com.capgemini.bank.model.Transaction;
import com.capgemini.bank.wrapper.TransactionWrapper;
@Service
public class TransactionService implements ITransaction{
@Autowired
TransactionRepository repository;

	@Override
	public Transaction createTransaction(Transaction transaction) {
		Transaction model=repository.save(transaction);
		return transaction;
		
	}

	@Override
	public List<Transaction> generateTransactionReport(Transaction transaction) throws CustomerException {
		
		List<Transaction> list=repository.findAll();
		if(list.isEmpty())
			
		{
			throw new CustomerException("list does not exist");
			
		}
		else
			return list;
		
	}

}
