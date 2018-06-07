package com.capgemini.bank.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.capgemini.bank.model.RefMoney;

public interface BankDenomination {
	
	

	Map<BigDecimal, Integer> createDenomination(BigDecimal amount,List<RefMoney> money);
	Map<BigDecimal,Integer> withdrawDenomination(BigDecimal amount,List<BigDecimal> money);

}
