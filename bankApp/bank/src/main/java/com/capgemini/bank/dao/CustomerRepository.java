package com.capgemini.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.bank.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
