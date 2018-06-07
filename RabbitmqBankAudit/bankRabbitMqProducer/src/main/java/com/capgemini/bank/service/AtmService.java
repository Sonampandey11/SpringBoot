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
	public Atm createAtm( Atm atms) {

		return atmRepository.save(atms);

	}

	@Override
	public Atm addMoneyFromBank(final Integer atmId, final BigDecimal money,final  Integer bankId) {

		final Optional<Atm> list=atmRepository.findByAtmId(atmId);
		System.out.println(">>>>>>>>>>>>>>"+atmId);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<"+list);
		Atm atms=list.get();
		final Optional<Bank> listbank=bankRepository.findByBankId(bankId);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<"+listbank);

		final Bank bank=listbank.get();
		final BigDecimal amount=bank.getAmount();
		final BigDecimal total=amount.subtract(money);
		if(total.compareTo(BigDecimal.ZERO)>500)
		{
			atms.setAmount(amount);
			bank.setAmount(total);
			atms=atmRepository.save(atms);
			bankRepository.save(bank);

		}
		else
		{
			System.out.println("Please enter correct amount");
		}

		return atms;

	}
	@Override
	public Atm withdrawMoney(final Integer atmId,final BigDecimal moneyBank,final Integer bankId) {

		final Optional<Atm> list=atmRepository.findByAtmId(atmId);
		final Atm atms=list.get();
		final Optional<Bank> listBank=bankRepository.findByBankId(bankId);
		final Bank bank=listBank.get();
		final BigDecimal money=bank.getAmount();
		final BigDecimal amounts=money.subtract(moneyBank);
		if(amounts.compareTo(BigDecimal.ZERO)>500)
		{
			atms.setAmount(moneyBank);
			bank.setAmount(amounts);
		}
		return atms;


	}

}
