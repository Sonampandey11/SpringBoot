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
import com.capgemini.bank.dao.AccountRepository;
import com.capgemini.bank.dao.BankRepository;
import com.capgemini.bank.dao.CustomerRepository;
import com.capgemini.bank.exception.CustomerException;
import com.capgemini.bank.model.Account;
import com.capgemini.bank.model.Bank;
import com.capgemini.bank.model.Customer;
import com.capgemini.bank.service.AccountService;
import com.capgemini.bank.service.BankServiceImpl;
import com.capgemini.bank.service.CustomerService;
import com.capgemini.bank.wrapper.AccountRequirement;
@RunWith(MockitoJUnitRunner.class)
public class AccountControllerException {

	@Mock
	AccountRepository accountRepository;

	@Mock
	CustomerRepository customerRepository;
	@Mock
	BankRepository bankRepository;
	
	@InjectMocks
	CustomerService customerService;
	
	@InjectMocks
	BankServiceImpl bankService;
	
	@InjectMocks
	AccountService accountService;

	@Test
	public void testcreateAccount()
	{  
		BigDecimal amount= new BigDecimal(100);
		final Bank bank=new Bank(1,"Sbi","airoli",amount);
		Optional<Bank> bankObj=Optional.of(bank);
		
		final Customer customer = new Customer(1,"Sonam",452,bank);
		Optional<Customer> customerObject=Optional.of(customer);
		
		Account account=new Account(1,amount,bank,customer);
		
		final AccountRequirement requirement=new AccountRequirement(account,1,1,"AxisBank","Sonam Pandey");
		
		when(bankRepository.findById(Mockito.any(Integer.class))).thenReturn(bankObj);
		when(customerRepository.findById(Mockito.any(Integer.class))).thenReturn(customerObject);
		when(accountRepository.save(account)).thenReturn(account);
		
		assertThat(accountService.createAccount(requirement)).isNotNull(); 
	}
}