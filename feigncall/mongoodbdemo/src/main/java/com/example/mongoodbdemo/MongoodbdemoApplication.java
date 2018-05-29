package com.example.mongoodbdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;

import com.example.mongoodbdemo.dao.AuditRepository;

@SpringBootApplication
@EnableEurekaClient
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
