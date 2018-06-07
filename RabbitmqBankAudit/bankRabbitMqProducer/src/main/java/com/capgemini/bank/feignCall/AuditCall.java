package com.capgemini.bank.feignCall;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import com.capgemini.bank.model.Audit;
/*
@FeignClient("audit-service")
public interface AuditCall {
	
	@PostMapping("/audit/create")
	ResponseEntity<Audit> createAudit(Audit audit);
	
}//@FeignClient(name="audit-service", url="http://localhost:8092")*/