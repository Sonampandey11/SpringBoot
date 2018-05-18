package com.capgemini.bank.controller;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.bank.exception.CustomerException;
import com.capgemini.bank.model.Transaction;
import com.capgemini.bank.service.TransactionService;

/**
 * @author trainee
 *
 */
@RestController
@RequestMapping("/transaction")
public class TransactionController {
	@Autowired
	TransactionService service;
   //generationg details of transaction on basis of transactionId
	@PostMapping("/fetch/{customerId}")
	public ResponseEntity<?> generateTransactionReport(final @PathVariable Integer customerId) throws CustomerException
	{
		Optional<Transaction> list=null;
	
		
		list=service.generateTransactionReport(customerId);
		return new ResponseEntity<Optional<Transaction>>(list,HttpStatus.OK);
	}
	
}
