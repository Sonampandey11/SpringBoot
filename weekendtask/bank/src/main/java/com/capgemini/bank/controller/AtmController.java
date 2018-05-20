package com.capgemini.bank.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bank.model.Atm;
import com.capgemini.bank.service.IAtmService;
import com.capgemini.bank.wrapper.AtmWrapper;

@RestController
@RequestMapping("/atm")
public class AtmController {

	@Autowired
	IAtmService iAtmService;
	@PostMapping(value="/create")
	public Atm createAtm(AtmWrapper atm)
	{
		return iAtmService.createAtm(atm);

	}


	@PostMapping(value="/add/{atmId}")
	public ResponseEntity<Atm> addMoneyFromBank( @PathVariable Integer atmmId, Atm atm, BigDecimal moneyBank)
	{

		Atm list=null;
		list=iAtmService.addMoneyFromBank(atm, moneyBank);
		
			return new ResponseEntity<Atm>(list,HttpStatus.OK);
		
	}
	
	@PostMapping(value="/withdraw/{atmId}")
	public ResponseEntity<Atm> withdrawMoneyBank(@PathVariable Integer atmId,Atm atm,BigDecimal moneyBank)
	{
		Atm list=null;
		list=iAtmService.addMoneyFromBank(atm, moneyBank);
		return new ResponseEntity<Atm>(list,HttpStatus.OK);
	
	}

}
