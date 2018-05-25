package com.capgemini.bank;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.web.servlet.MockMvc;

import com.capgemini.bank.model.Customer;
import com.capgemini.bank.service.CustomerService;

public class CsutomerController {
@Autowired
private MockMvc mockmvc;

@MockBean
CustomerService service;

@LocalServerPort
private int port;


@Test
public void addCustomer(Customer customer)
{
Customer customers=new Customer();	
//customers.set
}
	

/*@Autowired
private MockMvc mockmvc;
	
@MockBean 
SpringService spring;

@LocalServerPort
private int port;
	
@Test
public void getEmpDetailsById() throws Exception
{
	SpringBean springBean = new SpringBean("Sonam", "Pandey");
	springBean.setId(1);
	Optional<SpringBean> data =Optional.of(springBean);
	
	Mockito.when(spring.getEmpDetailsById(1)).thenReturn(data);

	mockmvc.perform(get("http://localhost:" + port +"/api/spring/employee/1"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
		.andExpect(jsonPath("$.id", is(1)))
		.andExpect(jsonPath("$.firstName", is("Sonam")));
				
}*/
}
