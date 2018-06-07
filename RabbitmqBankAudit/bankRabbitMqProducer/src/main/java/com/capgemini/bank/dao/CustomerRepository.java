package com.capgemini.bank.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.bank.model.Bank;
import com.capgemini.bank.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	Optional<Customer> findByCustomerId(Integer customerId);

	
}
