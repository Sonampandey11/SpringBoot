package com.capgemini.bank.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bank.dao.BankDenominationRepository;
import com.capgemini.bank.dao.RefMoneyRepository;
import com.capgemini.bank.model.BankDenominationTable;
import com.capgemini.bank.wrapper.DenominationWrapper;

@Service
public class BankDenominationService {
@Autowired
BankDenominationRepository repository;

	
	public void createDenomination(BankDenominationTable table)
	{
	 
	}

}
