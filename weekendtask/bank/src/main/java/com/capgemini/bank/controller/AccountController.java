package com.capgemini.bank.controller;
import java.math.BigDecimal;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.bank.model.Account;
import com.capgemini.bank.service.BankService;
import com.capgemini.bank.service.CustomerService;
import com.capgemini.bank.service.IAccount;
import com.capgemini.bank.wrapper.AccountDeposit;
import com.capgemini.bank.wrapper.AccountRequirement;
import com.capgemini.bank.wrapper.AccountWithdraw;



@RestController
@RequestMapping("/account")
public class AccountController {
	private static final Logger log = Logger.getLogger(AccountController.class.getName());
	@Autowired
	BankService bankService;
	@Autowired
	CustomerService customerService;

	@Autowired
	IAccount iAccount;

	@PostMapping(value="/createacc")
	public ResponseEntity<?> createAccount(final @RequestBody AccountRequirement accountreq)
	{

		final Account account = iAccount.createAccount(accountreq);
		return new ResponseEntity<Account>(account,HttpStatus.OK);
	}



	@PostMapping(value="/deposit")
	public String depositMoney(@RequestBody final AccountDeposit deposit)
	{
		//System.out.println("Add "+account.getAccountId());
		final String details=iAccount.depositMoney(deposit);
		return details;

	}


	@PostMapping(value="/withdraw")
	public String withdrawMoney(final @RequestBody BigDecimal amount, final AccountWithdraw accountWithdraw)
	{
		final String withdraw=iAccount.withdrawMoney(amount, accountWithdraw);
		return "amount has been debit";

	}
	@GetMapping(value="/view/{accountId}")
	public ResponseEntity<?> getAccountDetail(@PathVariable final Integer accountId ) 
	{
		System.out.println("Thev account is"+accountId);
		final Account account= iAccount.getAccountDetails(accountId);
		return new ResponseEntity<Account>(account,HttpStatus.OK);




	}

}
