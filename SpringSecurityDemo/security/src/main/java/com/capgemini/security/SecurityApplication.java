package com.capgemini.security;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.security.entity.Role;
import com.capgemini.security.entity.User;
import com.capgemini.security.repository.UserRepository;

@SpringBootApplication
public class SecurityApplication implements CommandLineRunner{
	@Autowired
	UserRepository userRepo;

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
		userRepo.deleteAll();

		Role role = new Role("ADMIN");
		Set<Role> roles = new HashSet<>();
		roles.add(role);
		roles.add(new Role("USER"));
		User user = new User("Sonam", "pandey", roles);
		userRepo.saveAndFlush(user);
		
		
		Set<Role> newRole = new HashSet<>();
		newRole.add(new Role("USER"));
		User user2 = new User("Pooja", "jain", newRole) ;
		userRepo.saveAndFlush(user2);
	}
}

