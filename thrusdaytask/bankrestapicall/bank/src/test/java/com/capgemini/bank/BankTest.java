package com.capgemini.bank;



import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.options;

import java.math.BigDecimal;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

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
		System.out.println(bank);
		 assertThat(bankService.createBank(bank)).isNotNull();
		
	}
	
	@Test
	public void viewBankdetailsById()
	{
		final BigDecimal amount=  new BigDecimal (500);
		Bank bank=new Bank(1,"Sbi","airoli",amount);
		Optional <Bank> ob= Optional.of(bank);
		//Optional <Bank> obEmpty= Optional.empty();
		//Mockito.when(bankRepository.save(bank)).thenReturn(bank);
		//System.out.println(">>>>>>>>>"+bankRepository.findById(bank.getBankId()).get());
		Mockito.when(bankRepository.findById(Mockito.any(Integer.class))).thenReturn(ob);
		//bankService.getBankDetailsById(bank.getBankId());
		assertThat(bankService.getBankDetailsById(1)).isNotNull();	
		
	}
	
	@Test
	public void bankDetailsIsEmpty()
	{
		final Bank bank=new Bank();
		final Optional<Bank> object=Optional.ofNullable(bank);
		assertFalse( object.isPresent());
		
	}
	
	
	//Throwing an exception from the mocked method
   // @Test(expected = CustomerException.class)
       public void testBankException() {
           when(bankRepository.save(Bank.class)).thenThrow(CustomerException.class);
           Bank bank = new Bank();
           bankService.createBank(bank);
       }
}

