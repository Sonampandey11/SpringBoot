package com.capgemini.bank;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.bank.dao.TransactionRepository;
import com.capgemini.bank.service.TransactionService;
@RunWith(SpringRunner.class)
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
