package com.capgemini.bank.service;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bank.dao.AccountRepository;
import com.capgemini.bank.dao.BankRepository;
import com.capgemini.bank.dao.CustomerRepository;
import com.capgemini.bank.model.Account;
import com.capgemini.bank.model.Bank;
import com.capgemini.bank.model.Customer;
import com.capgemini.bank.wrapper.AccountDeposit;
import com.capgemini.bank.wrapper.AccountRequirement;
import com.capgemini.bank.wrapper.AccountWithdraw;

@Service
public class AccountService implements IAccount{
	@Autowired
	AccountRepository accountRepository;
	@Autowired
	BankRepository bankRepository;
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Account createAccount(AccountRequirement acccount) {

		Optional<Bank> bankOpt = bankRepository.findById(acccount.getBankId());
		Bank bank = bankOpt.get();
		Optional<Customer> customerOpt = customerRepository.findById(acccount.getCustomerId());
		Customer cust = customerOpt.get();
		Account account = acccount.getAccount();
		account.setBank(bank);
		account.setCustomer(cust);
		accountRepository.save(account);
		return account;	
	}

	@Override
	public String depositMoney(AccountDeposit deposit,Account account) {
		System.out.println("Add Money"+account.getAccountId());
		final Optional<Account> accountOptional=accountRepository.findById(account.getAccountId());
		Account accounts=accountOptional.get();
		if(accountOptional.isPresent())
		{
			BigDecimal balance=account.getAmount(); 
			balance=balance.add(account.getAmount());
			account.setAmount(balance);
			accountRepository.save(account);
		}
		else
		{
			return "please enter correct accountId";
			
		}
		return "balance credit";
	}
	
	
	@Override
	public Account getAccountDetails(Integer accountId) {
		System.out.println("AccountId"+accountId);
		Optional<Account> account=accountRepository.findById(accountId);
		if(account.isPresent())
		{
			Account acc=accountRepository.getOne(accountId);
			return acc;
		}
		else
		{
			return null;
		}
	}

	@Override
	public String withdrawMoney(BigDecimal amount, AccountWithdraw accountWithdraw) {
		// TODO Auto-generated method stub
		return null;
	}


}
