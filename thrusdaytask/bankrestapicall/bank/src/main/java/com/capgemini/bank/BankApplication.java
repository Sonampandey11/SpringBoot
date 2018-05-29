package com.capgemini.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class BankApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}
	
	/*@LoadBalanced
	@Bean
	public RestTemplate template()
	{
		return new RestTemplate();
	
	}*/
	   /*public RestTemplate template(RestTemplateBuilder builder) {
	      return builder.build();
}*//*
	public Audit createAuditServiceImpl(Audit audit)
	{
		String url="http://localhost:8092/audit/create";
		Audit Object=template.postForObject(url, audit, Audit.class);
		return Object;
	}*/
	
	
}
