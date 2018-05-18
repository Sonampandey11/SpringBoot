package com.capgemini.bank.service;

import com.capgemini.bank.model.Atm;
import com.capgemini.bank.wrapper.AtmWrapper;
public interface IAtmService {

	/**
	 * method: to createAtm on
	 * 
	 */
	Atm createAtm(AtmWrapper atm);
	/**
	 * @author trainee
	 *
	 */
	Atm addMoneyFromBank(Atm atm);

	/**
	 * @author trainee
	 *
	 */
	Atm withdrawMoney();



}
