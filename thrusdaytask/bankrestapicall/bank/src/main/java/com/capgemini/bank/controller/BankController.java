package com.capgemini.bank.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.bank.exception.CustomerException;
import com.capgemini.bank.model.Bank;
import com.capgemini.bank.service.BankService;




@RestController
@RequestMapping(value="/bank")
public class BankController {
	private static final Logger log = Logger.getLogger(BankController.class.getName());
	@Autowired
	BankService bankService;
	
	
	@PostMapping(value="/create")
	public Bank createBank(@RequestBody Bank bank)
	{
		return bankService.createBank(bank);
		
	}

	@GetMapping(value="/details")
	public List<Bank> getBankDetails()
	{
		return bankService.getBankDetails();
		
	}
	@GetMapping(value="/view/{bankId}")
	public ResponseEntity<?> viewBankDetailById(final @PathVariable("bankId") Integer bankId) 
	{
		final Bank bank=bankService.getBankDetailsById(bankId);
		if(bank!=null )
		{
		System.out.println("Details are"+bankId);
		return new ResponseEntity<Bank>(bank,HttpStatus.OK);
		}
		return new ResponseEntity<String>(
				"Please Enter valid customerId",HttpStatus.OK);
}
	
}