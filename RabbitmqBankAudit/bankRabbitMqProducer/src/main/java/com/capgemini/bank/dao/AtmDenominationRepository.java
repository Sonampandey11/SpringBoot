package com.capgemini.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.bank.wrapper.DenominationWrapper;

public interface AtmDenominationRepository extends JpaRepository<DenominationWrapper, Integer> {

}
