package com.capgemini.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bank.model.Bank;
import com.capgemini.bank.service.BankService;
import com.capgemini.bank.service.BankServiceImpl;

@RestController
@RequestMapping(value="/bank")
public class BankController {
	
	@Autowired
	BankService bankService;
	
	
	@PostMapping(value="/create")
	public Bank createBank(Bank bank)
	{
		return bankService.createBank(bank);
		
	}

	@GetMapping(value="/details")
	public List<Bank> getBankDetails()
	{
		return bankService.getBankDetails();
		
	}
}
