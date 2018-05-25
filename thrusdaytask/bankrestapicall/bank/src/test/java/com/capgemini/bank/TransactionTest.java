package com.capgemini.bank;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.capgemini.bank.dao.TransactionRepository;
import com.capgemini.bank.service.TransactionService;
@RunWith(MockitoJUnitRunner.class)
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
