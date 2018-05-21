package com.capgemini.bank.controller;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bank.exception.CustomerException;
import com.capgemini.bank.model.Atm;
import com.capgemini.bank.service.IAtmService;
import com.capgemini.bank.wrapper.AtmWrapper;


@RestController
@RequestMapping("/atm")
public class AtmController {
	private static final Logger log = Logger.getLogger(AtmController.class.getName());
	@Autowired
	IAtmService iAtmService;
	@PostMapping(value="/create")
	public Atm createAtm(final @RequestBody AtmWrapper atm) throws CustomerException
	{

		final Atm atmm=atm.getAtm();

		return iAtmService.createAtm(atmm);

	}


	@PostMapping(path="/add/{atmmId}/{money}/{bankId}")
	public ResponseEntity<Atm> addMoneyFromBank(final  @PathVariable Integer atmmId,final @PathVariable BigDecimal money,final @PathVariable Integer bankId)
	{


		final Atm list=iAtmService.addMoneyFromBank(atmmId, money,bankId);

		return new ResponseEntity<Atm>(list,HttpStatus.OK);

	}

	@PostMapping(value="/withdraw/{atmId}/{moneyBank}/{bankId}")
	public ResponseEntity<Atm> withdrawMoneyBank(final @PathVariable Integer atmId,final BigDecimal moneyBank,final @PathVariable Integer bankId)
	{
		final Atm list=iAtmService.addMoneyFromBank(atmId,moneyBank, bankId);
		return new ResponseEntity<Atm>(list,HttpStatus.OK);

	}

}
