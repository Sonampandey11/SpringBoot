package com.capgemini.bank.service;

import java.math.BigDecimal;
import java.util.Optional;

import javax.transaction.Transactional;

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

	@Autowired
	ITransaction txnService;

	/**
	 * method name: create account
	 * description: to create account we will take bankId from bankRepository and customerId 
	 *              from customerRepository and then we will set bank and customer in account
	 *
	 */
	@Override
	public Account createAccount(final AccountRequirement acccount) {

		final Optional<Bank> bankOpt = bankRepository.findById(acccount.getBankId());
		final Bank bank = bankOpt.get();
		final Optional<Customer> customerOpt = customerRepository.findById(acccount.getCustomerId());
		final Customer cust = customerOpt.get();
		final Account account = acccount.getAccount();
		account.setBank(bank);
		account.setCustomer(cust);
		accountRepository.save(account);
		return account;	
	}
	
	/**
	 * method name: to deposit money in bank and account 
	 * description: to deposit money we will fetch accountId from Account and check if accountId i
	 *              present 
	 *
	 */
	@Transactional
	@Override
	public String depositMoney(final AccountDeposit deposit) {
		System.out.println("Add Money"+deposit);
		final Optional<Account> accountOptional=accountRepository.findById(deposit.getAccountId());

		if(accountOptional.isPresent())
		{
			final Account accounts=accountOptional.get();
			BigDecimal balance=accounts.getAmount(); 
			balance=balance.add(deposit.getAmount());
			accounts.setAmount(balance);
			accountRepository.save(accounts);
			final Optional<Bank> bank=bankRepository.findById(deposit.getBankId());
			final Bank banks=bank.get();
			banks.setAmount(balance);
			bankRepository.save(banks);
			final Optional<Customer> customer =customerRepository.findById(deposit.getCustomerId());
			txnService.createTransaction(customer.get(), accounts, deposit.getAmount(), "CREDIT");
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
