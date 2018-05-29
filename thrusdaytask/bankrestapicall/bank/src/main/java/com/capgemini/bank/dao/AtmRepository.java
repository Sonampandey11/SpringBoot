package com.capgemini.bank.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.bank.model.Atm;

public interface AtmRepository extends JpaRepository<Atm, Integer> {

	Optional<Atm> findByAtmId(Integer atmId);

}
