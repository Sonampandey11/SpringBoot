package com.capgemini.bank.service;

import java.math.BigDecimal;
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
	public Atm addMoneyFromBank(Atm atm, BigDecimal moneyBank) {
		Optional<Atm> list=atmRepository.findById(atm.getAtmId());
		Atm atms=null;
		atm=list.get();
		Bank bank =new Bank();
			Optional<Bank> listbank=bankRepository.findById(bank.getBankId());
			bank=listbank.get();
			BigDecimal amount=bank.getAmount();
			BigDecimal total=amount.subtract(moneyBank);
			if(total.compareTo(BigDecimal.ZERO)>500)
			{
				atm.setAmount(moneyBank);
				bank.setAmount(moneyBank);
				atms=atmRepository.save(atm);
				bankRepository.save(bank);
				
			}
		
		return atms;
		
	}
 @Override
	public Atm withdrawMoney(Atm atm, BigDecimal moneyBank) {
		
		Optional<Atm> list=atmRepository.findById(atm.getAtmId());
		Atm atms=list.get();
		Bank bank= new Bank();
		BigDecimal data=bank.getAmount();
		BigDecimal amounts=data.subtract(moneyBank);
		if(amounts.compareTo(BigDecimal.ZERO)>500)
		{
			atms.setAmount(moneyBank);
			bank.setAmount(amounts);
		}
	 return atm;
				
		
	}

}
