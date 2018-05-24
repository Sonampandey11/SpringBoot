package com.example.mongoodbdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.mongoodbdemo.dao.AuditRepository;

@SpringBootApplication
public class MongoodbdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoodbdemoApplication.class, args);
	}
	
	@Autowired
	private AuditRepository auditRepository;
	
//	@Bean
//	ApplicationRunner applicationRunner() {
//		return (args) -> {
//			String eventId = UUID.randomUUID().toString();
//			Audit aud = new Audit(eventId, "eventName", "Type", LocalDateTime.now(), "sonam",
//					null, null);
//			
//			auditRepository.save(aud);
//			
//			Audit audit = auditRepository.findById(eventId).get();
//			
//			System.out.println(">>>>>>>>>>>"+audit);
//		};
//	}
}
