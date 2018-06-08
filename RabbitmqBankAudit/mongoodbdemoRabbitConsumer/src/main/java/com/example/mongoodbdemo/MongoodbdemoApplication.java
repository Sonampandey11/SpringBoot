package com.example.mongoodbdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

import com.example.mongoodbdemo.dao.AuditRepository;

@SpringBootApplication
public class MongoodbdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoodbdemoApplication.class, args);
	}
	
	@Autowired
	private AuditRepository auditRepository;

}
