package com.capgemini.bank.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bank.dao.BankDenominationRepository;
import com.capgemini.bank.exception.CustomerException;
import com.capgemini.bank.model.BankDenominationTable;
import com.capgemini.bank.model.RefMoney;
@Service
public class BankDenominationImpl implements BankDenomination {

	@Autowired
	BankDenominationRepository repository;
	/*@Autowired
	RefMoney money;*/
	
	
		/*public  List<BigDecimal> noOfDenomination()
	{
		//storing number in list
		final List<BigDecimal> set=new ArrayList();
		set.add(new BigDecimal("50"));
		set.add(new BigDecimal(0("200"));
		set.add(new BigDecimal("500"));
		set.add(new BigDecimal("2000"));
		return set;
	}*/
	 
	@Override
	public Map<BigDecimal , Integer> createDenomination(BigDecimal amount , List<RefMoney> money ) {

		Map<BigDecimal , Integer> result = new HashMap<BigDecimal , Integer>();
		BigDecimal remainder=amount;
		//List<BigDecimal> list=BankDenominationImpl.noOfDenomination();

		Iterator<RefMoney> setItr =  money.iterator();
		System.out.println("value of set>>>>>>>>>>>>"+money);
		while (setItr.hasNext()) {

			final Random random=new Random();
			final Integer index= new Random().nextInt(money.size());
			RefMoney element=money.get(index);
			System.out.println("value of element>>>>>>>>>>>>"+element);
			if(element.getDenomination().compareTo(remainder) <= 0) {
				Integer denomination= remainder.divide(element.getDenomination()).intValue();
				//table.setNoOfDenom(denomination);
				remainder=remainder.remainder(element.getDenomination());
				//table.setDenominationAmount(element.getDenomination() );
				System.out.println("value is>>>>>>>>>>>>"+denomination);
				result.put(element.getDenomination(), denomination);
				if(remainder.compareTo(BigDecimal.ZERO) == 0) {
					break;
				}
			}

			money.remove(element);
			//repository.save(table);
		}

		if(remainder.compareTo(BigDecimal.ZERO) != 0) {
			//System.out.println("cant convert");
			throw new CustomerException("Value entered is not compatible");
		}
		return result;

	}

}
