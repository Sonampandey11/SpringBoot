package com.capgemini.bank;



import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import com.capgemini.bank.dao.BankRepository;
import com.capgemini.bank.exception.CustomerException;
import com.capgemini.bank.model.Bank;
import com.capgemini.bank.service.BankServiceImpl;
@RunWith(MockitoJUnitRunner.class)
public class BankTest {
	
	@InjectMocks
	BankServiceImpl bankService;
	
	@Mock
	BankRepository bankRepository;
	
	
	@Test
	public void createBankTest() throws CustomerException
	{
		final BigDecimal amount=  new BigDecimal (500);
		final Bank bank=new Bank(1,"Sbi","airoli",amount);
		Mockito.when(bankRepository.save(bank)).thenReturn(bank);
		bankService.createBank(bank);
		 assertThat(bankService.createBank(bank)).isNotNull();
		
	}
	
	@Test
	public void viewBankdetailsById(Integer bankId)
	{/*
		when (bankRepository.save(any(Bank.class))).thenAnswer(new Answer<Bank>())
		{
			
		}
		Mockito.when(bankRepository.findById(1)).getClass();
		bankService.getBankDetailsById(bankId);
		assertThat(bankService.getBankDetailsById(bankId)).isNotNull();
		*/
		 
		     
	}
	//Throwing an exception from the mocked method
    @Test(expected = CustomerException.class)
       public void testBankException() {
          // when(bankRepository.save(Bank.class)).thenThrow(CustomerException.class);
           Bank bank = new Bank();
           bankService.createBank(bank);
       }
}

