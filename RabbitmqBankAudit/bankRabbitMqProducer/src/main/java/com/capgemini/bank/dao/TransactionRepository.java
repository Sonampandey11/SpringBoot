package com.capgemini.bank.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.bank.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>{

	Optional<Transaction> findBytransactionId(Integer customerId);

	
}
