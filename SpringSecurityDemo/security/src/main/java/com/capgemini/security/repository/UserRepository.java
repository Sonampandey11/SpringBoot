package com.capgemini.security.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.security.entity.User;



public interface UserRepository extends JpaRepository<User, Serializable> {

	
	Optional<User> findByUserName(String userName);
}
