package com.capgemini.bank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bank.dao.BankRepository;
import com.capgemini.bank.exception.CustomerException;
import com.capgemini.bank.model.Bank;
@Service
public class BankServiceImpl implements BankService{

	@Autowired
	BankRepository bankRepository;
	/*
	 * (non-Javadoc)
	 * @see com.capgemini.bank.service.BankService#createBank(com.capgemini.bank.model.Bank)
	 */
	@Override
	public Bank createBank(Bank bank) {

		try {
			return bankRepository.save(bank);
		} catch (Exception e) {
			// TODO Auto-generated catch block
		 throw new CustomerException("Please enter corret data");
		}
		
	}
	/*
	 * (non-Javadoc)
	 * @see com.capgemini.bank.service.BankService#getBankDetails()
	 */
	@Override
	public List<Bank> getBankDetails() {

		try {
			return bankRepository.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 throw new CustomerException("bankId is not valid");
		}
	}
	/*
	 * (non-Javadoc)
	 * @see com.capgemini.bank.service.BankService#getBankDetailsById(java.lang.Integer)
	 */
	public Bank getBankDetailsById(Integer bankId)
	{
		if(bankId==0)
	{
       System.out.println("please enter correct bankId"+bankId);
	}
	//Optional<Bank> bankDetails=bankRepository.findById(bankId);
	try {
		return bankRepository.findByBankId(bankId).get();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		throw new CustomerException("bankId is not valid");
	}
	}

}
