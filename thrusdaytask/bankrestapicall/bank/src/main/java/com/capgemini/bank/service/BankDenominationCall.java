package com.capgemini.bank.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.bank.dao.BankDenominationRepository;
import com.capgemini.bank.dao.BankRepository;
import com.capgemini.bank.exception.CustomerException;
import com.capgemini.bank.model.Bank;
import com.capgemini.bank.model.BankDenominationTable;
import com.capgemini.bank.model.RefMoney;

public class BankDenominationCall {
	
	
	@Autowired
	BankDenominationImpl service;
	@Autowired
	BankDenominationRepository bankdeminationRepository;
	@Autowired
	BankServiceImpl bankService;
	@Autowired
	RefMoneyService refMoneyService;
	
	public void createBankDeom(List<BigDecimal>list, Integer bankId) throws CustomerException
	{
		for(BigDecimal amount:list)
		{
			final BankDenominationTable table=new BankDenominationTable(bankId,0,new BigDecimal(amount.intValue()));
			bankdeminationRepository.save(table);
		}
	}
	
	public void bankDenominationDeposit(BigDecimal amount, Integer bankId) throws CustomerException
	{
		List<RefMoney> list=refMoneyService.fetchAllDenomination();
		List<BigDecimal> money=new ArrayList<>();
		for(RefMoney refMoney: list)
		{
			money.add(refMoney.getDenomination());
		}
		Map<BigDecimal,Integer> map=service.createDenomination(amount, list);
		BankDenominationTable table=new BankDenominationTable();
		
		Iterator<Map.Entry<BigDecimal,Integer>> iterator=map.entrySet().iterator();
		
		while(iterator.hasNext())
		{
			 Map.Entry<BigDecimal, Integer> entry = iterator.next();
			    BigDecimal value = entry.getKey();
			    Integer count=entry.getValue();	
			    Optional<BankDenominationTable> banktable=bankdeminationRepository.findById(value.intValue());
			    BankDenominationTable denomination=banktable.get();
			    Bank bank=bankService.getBankDetailsById(bankId);
			    denomination.setBankId(bankId);
			    denomination.setNoOfDenom(denomination.getNoOfDenom()+count);
			    bankdeminationRepository.save(denomination);
			    
			    
		}
		
	}
	
	public void withdrawBankDenomination(BigDecimal amount, Integer bankId)throws CustomerException
	{
		List<RefMoney> list=refMoneyService.fetchAllDenomination();
		List<BigDecimal> money=new ArrayList<>();
		for(RefMoney refMoney: list)
		{
			money.add(refMoney.getDenomination());
		}
		Map<BigDecimal,Integer> map=service.withdrawDenomination(amount, money);
				
		BankDenominationTable table=new BankDenominationTable();
		
		Iterator<Map.Entry<BigDecimal,Integer>> iterator=map.entrySet().iterator();
		
		while(iterator.hasNext())
		{
			 Map.Entry<BigDecimal, Integer> entry = iterator.next();
			    BigDecimal value = entry.getKey();
			    Integer count=entry.getValue();	
			    Optional<BankDenominationTable> banktable=bankdeminationRepository.findById(value.intValue());
			    BankDenominationTable denomination=banktable.get();
			    Bank bank=bankService.getBankDetailsById(bankId);
			    denomination.setBankId(bankId);
			    denomination.setNoOfDenom(denomination.getNoOfDenom()-count);
			    bankdeminationRepository.save(denomination);
	}
	}
}