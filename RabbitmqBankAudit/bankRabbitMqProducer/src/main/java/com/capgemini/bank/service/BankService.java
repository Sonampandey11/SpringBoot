package com.capgemini.bank.service;

import java.util.List;

import com.capgemini.bank.model.Bank;

/**
 * @author trainee
 *
 */
public interface BankService {
/*
 * method to create bank
 */
public 	Bank createBank(Bank bank);

public List<Bank> getBankDetails();
public Bank getBankDetailsById(Integer bankId);

}
