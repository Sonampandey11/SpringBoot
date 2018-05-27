package com.capgemini.bank.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bank.dao.BankDenominationRepository;
import com.capgemini.bank.dao.RefMoneyRepository;
import com.capgemini.bank.exception.CustomerException;
import com.capgemini.bank.model.RefMoney;

@Service
public class RefMoneyService {
	@Autowired
	RefMoneyRepository repository;
	public void createDenominationMoney(List<BigDecimal> refMoney)
	{
		for(BigDecimal denomination:refMoney)
		{
		if(!repository.findById(denomination).isPresent())
		{
			RefMoney money=new RefMoney();
			money.setDenomination(denomination);
			repository.save(money);
			
		}
		else
		{
			throw new CustomerException("invalid amount");
		}
	}
	}
		
	public List<RefMoney> fetchAllDenomination()
	{
		List<RefMoney> list=repository.findAll();
		if(list.isEmpty())
		{
			System.out.println("invalid input");
		}
	
		return list;
		
	}
	

}
