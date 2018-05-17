package com.capgemini.bank.service;

import java.math.BigDecimal;

import com.capgemini.bank.model.Account;
import com.capgemini.bank.wrapper.AccountDeposit;
import com.capgemini.bank.wrapper.AccountRequirement;
import com.capgemini.bank.wrapper.AccountWithdraw;


public interface IAccount {
	
	
    public Account createAccount(AccountRequirement acccount);
	public String depositMoney(AccountDeposit deposit,Account account);
	public String withdrawMoney(BigDecimal amount, AccountWithdraw accountWithdraw);
	public Account getAccountDetails(Integer accountId);
}
