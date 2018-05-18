package com.capgemini.bank.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capgemini.bank.model.Transaction;

@ResponseBody
@RequestMapping("/transaction")
public class TransactionController {
	
	@PostMapping(value="/create")
	public Transaction createTransaction()
	{
		return null;
		
	}
	

}
