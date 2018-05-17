package com.capgemini.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bank.dao.BankRepository;
import com.capgemini.bank.model.Bank;
@Service
public class BankServiceImpl implements BankService{

	@Autowired
	BankRepository bankRepository;
	
	@Override
	public Bank createBank(Bank bank) {
	
		return bankRepository.save(bank);
	}

	@Override
	public List<Bank> getBankDetails() {
		
		return bankRepository.findAll();
	}
	
	public Bank getBankDetailsById(Integer bankId)
	{
		return bankRepository.findById(bankId).get();
	}

}
