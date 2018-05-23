package com.capgemini.bank;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.capgemini.bank.dao.TransactionRepository;
import com.capgemini.bank.service.TransactionService;

public class TransactionTest {

	@Mock
	TransactionRepository repository;
	@InjectMocks
	TransactionService service;
	
	@Test
	public void ctreateTransaction()
	{
		
	}

}
