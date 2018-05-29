package com.capgemini.bank.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.bank.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{

	Optional<Account> findByAccountId(Integer accountId);

}
