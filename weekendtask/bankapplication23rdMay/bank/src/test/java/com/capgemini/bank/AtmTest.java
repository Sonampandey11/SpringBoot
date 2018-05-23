package com.capgemini.bank;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.capgemini.bank.dao.AtmRepository;
import com.capgemini.bank.model.Atm;
import com.capgemini.bank.model.Bank;
import com.capgemini.bank.service.AtmService;

public class AtmTest {

	@Mock
	AtmRepository repository;
	
	@InjectMocks
	AtmService service;
	
	@Test
	public void createAtm()
	{
		final BigDecimal amount=  new BigDecimal (500);
		Atm atm=new Atm(1,amount);
		System.out.println(atm);
		Mockito.when(repository.save(atm)).thenReturn(atm);
		service.createAtm(atm);
		assertThat(service.createAtm(atm)).isNotNull();
		
		
	}
	
	//@Test
	public void test() {
		fail("Not yet implemented");
	}

}
