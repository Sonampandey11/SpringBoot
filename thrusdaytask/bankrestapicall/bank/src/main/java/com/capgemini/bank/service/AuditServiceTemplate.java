package com.capgemini.bank.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capgemini.bank.model.Audit;
import com.capgemini.bank.model.AuditEnum;

@Service
public class AuditServiceTemplate {
	public static void main(String[] args) {
		
	}
	
	
	public Audit createAuditServiceImpl(Audit audit)
	{
		RestTemplate template =new RestTemplate();
		String url="http://localhost:8092/audit/create";
		System.out.println("M1 Service >>>>>>" + audit);
		Audit Object=template.postForObject(url, audit, Audit.class);
		return Object;
		
	}
	

}
