package com.capgemini.bank.feignCall;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.capgemini.bank.model.Audit;
/*
@Service
public class AuditService {

	@Autowired
	private AuditCall auditCall;

	public void retrieveAudit(Audit audit) {
		String url="http://localhost:8092/audit/create";
		System.out.println("M1 Service >>>>>>" + audit);
		ResponseEntity<Audit> createAudit = auditCall.createAudit(audit);
		
	}
*/
//}