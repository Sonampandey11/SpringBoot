package com.capgemini.bank.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.bank.model.BankDenominationTable;

public interface BankDenominationRepository extends JpaRepository<BankDenominationTable, Integer> {

	Optional<BankDenominationTable> findBynoOfDenom(Integer noOfDenom);

	

	

}
