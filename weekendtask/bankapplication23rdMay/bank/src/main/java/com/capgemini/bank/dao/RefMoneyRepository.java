package com.capgemini.bank.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.bank.model.RefMoney;

public interface RefMoneyRepository extends JpaRepository<RefMoney, BigDecimal>{

	

}
