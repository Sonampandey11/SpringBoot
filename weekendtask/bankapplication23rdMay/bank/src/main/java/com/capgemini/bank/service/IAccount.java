package com.capgemini.bank.service;

import java.math.BigDecimal;

import com.capgemini.bank.model.Account;
import com.capgemini.bank.model.BankDenominationTable;
import com.capgemini.bank.wrapper.AccountDeposit;
import com.capgemini.bank.wrapper.AccountRequirement;
import com.capgemini.bank.wrapper.AccountWithdraw;


/**
 * @author trainee
 *
 */
public interface IAccount {

	/**
	 * method name: create account
	 * description: to create account we will take bankId from bankRepository and customerId 
	 *              from customerRepository and then we will set bank and customer in account
	 *
	 */
	 Account createAccount(AccountRequirement acccount);
	/**
	 * method name: to deposit money in bank and account 
	 * description: for deposit money we will fetch accountId from Account and check if accountId i
	 *              present 
	 *
	 */
	public String depositMoney(AccountDeposit deposit,BankDenominationTable table);
	/**
	 * method name: to withdraw money from account and bank
	 * description: to withdraw money from account we will fetch accountId and bankId first and 
	 *              then money will be deducted from bank and account; 
	 *
	 */
	public String withdrawMoney(BigDecimal amount, AccountWithdraw accountWithdraw);
	/**
	 *method name:to getAccountDetails
	 */
	public Account getAccountDetails(Integer accountId);
}
