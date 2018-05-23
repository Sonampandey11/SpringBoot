package com.capgemini.bank.service;

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
	public RefMoney createDenominationMoney(RefMoney refmoney)
	{
		try {
			System.out.println("Value in service"+refmoney);
			return repository.save(refmoney);
		} catch (CustomerException exception ) {
			
			throw new CustomerException("refMoney cannot be null");
		}
		
	}
	

}
