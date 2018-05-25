package com.capgemini.bank;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import com.capgemini.bank.dao.CustomerRepository;
import com.capgemini.bank.exception.CustomerException;
import com.capgemini.bank.model.Bank;
import com.capgemini.bank.model.Customer;
import com.capgemini.bank.service.CustomerService;
@RunWith(MockitoJUnitRunner.class)
public class CustomerTest {

	@InjectMocks
	CustomerService service;
	@Mock
	CustomerRepository repository;

	@Test
    public void createCustomerTest() throws CustomerException
    {
		/*final BigDecimal amount=  new BigDecimal (500);
		final Bank bank=new Bank(1,"Sbi","airoli",amount);
		final Customer customer = new Customer(1,"Sonam",452,bank);
        Mockito.when(repository.save(customer)).thenReturn(customer);
        try {
			service.createCustomer(customer);
		} catch (CustomerException e) {
			System.out.println("Please enter valid customer Details");
		}
        assertThat(service.createCustomer(customer)).isNotNull();
       */
		
    }
	
	@Test
	public void getCustomerDetailsById()
	{
		
			final BigDecimal amount=  new BigDecimal (500);
			Bank bank=new Bank(1,"Sbi","airoli",amount);
			final Customer customer = new Customer(1,"Sonam",452,bank);
			final Optional<Customer> object=Optional.of(customer);
			Mockito.when(repository.findById(Mockito.any(Integer.class))).thenReturn(object);
			assertThat(service.getCustomerDetailsById(1)).isNotNull();	
			
		}
	}
	


