package com.capgemini.bank.service;

import java.util.List;

import com.capgemini.bank.model.Bank;

public interface BankService {

public 	Bank createBank(Bank bank);

public List<Bank> getBankDetails();
public Bank getBankDetailsById(Integer bankId);

}
