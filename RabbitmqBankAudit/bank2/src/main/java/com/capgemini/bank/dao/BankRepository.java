package com.capgemini.bank.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.bank.model.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer>{

	Object save(Class<Bank> class1);

	Optional<Bank> findByBankId(Integer bankId);

	

	

}
