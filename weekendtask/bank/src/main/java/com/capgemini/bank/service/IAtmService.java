package com.capgemini.bank.service;

import java.math.BigDecimal;

import com.capgemini.bank.model.Atm;
import com.capgemini.bank.wrapper.AtmWrapper;
public interface IAtmService {

	/**
	 * method: to createAtm on
	 * 
	 */
	Atm createAtm(Atm atm);
	/**
	 * @author trainee
	 *
	 */
	Atm addMoneyFromBank(Integer atmId, BigDecimal moneyBank,Integer bankId);

	/**
	 * @author trainee
	 *
	 */
	Atm withdrawMoney(Integer atmId, BigDecimal moneyBank,Integer bankId);



}
