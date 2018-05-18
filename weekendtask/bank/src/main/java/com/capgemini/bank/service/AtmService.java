package com.capgemini.bank.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bank.dao.AtmRepository;
import com.capgemini.bank.dao.BankRepository;
import com.capgemini.bank.model.Account;
import com.capgemini.bank.model.Atm;
import com.capgemini.bank.model.Bank;
import com.capgemini.bank.model.Customer;
import com.capgemini.bank.wrapper.AtmWrapper;
@Service
public class AtmService implements IAtmService {
  
	@Autowired
	AtmRepository atmRepository;
	@Autowired
	BankRepository bankRepository;
	
	@Override
	public Atm createAtm(final AtmWrapper atms) {
		final Optional<Bank> bankOptional=bankRepository.findById(atms.getBankId());
		Atm atm=atms.getAtm();
		return atmRepository.save(atm);

	}

	@Override
	public Atm addMoneyFromBank(Atm atm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Atm withdrawMoney() {
		// TODO Auto-generated method stub
		return null;
	}

}
