package com.capgemini.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.bank.model.Atm;

public interface AtmRepository extends JpaRepository<Atm, Integer> {

}
