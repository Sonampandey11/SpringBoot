package com.capgemini.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	public void createAtm(AtmWrapper atm)
	{
		Atm atms=iAtmService.createAtm(atm);
		
	}

}
