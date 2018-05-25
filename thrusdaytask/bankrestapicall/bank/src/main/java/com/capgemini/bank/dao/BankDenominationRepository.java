package com.capgemini.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.bank.model.BankDenominationTable;

public interface BankDenominationRepository extends JpaRepository<BankDenominationTable, Integer> {

}
