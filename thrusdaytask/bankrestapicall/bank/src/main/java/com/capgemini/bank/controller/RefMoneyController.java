package com.capgemini.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bank.model.RefMoney;
import com.capgemini.bank.service.RefMoneyService;

@RestController
@RequestMapping(value="/ref")
public class RefMoneyController {

	@Autowired
	RefMoneyService service;
	
	@PostMapping(value="/money")
	public ResponseEntity<RefMoney> createDenominationMoney(@RequestBody RefMoney refmoney)
	{
		return null;
		//RefMoney object= service.createDenominationMoney(refmoney);
	//	System.out.println("value    is>>>>>>>>"+object);
		//return new ResponseEntity<RefMoney>(object, HttpStatus.CREATED);
	}
	
}
