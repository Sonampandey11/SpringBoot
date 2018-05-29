package com.capgemini.bank.controller;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bank.model.Audit;

/*@RestController
public class FeignController {
@PostMapping(value="/audit/create")
public Audit createAudit( Audit audit)
	{
	return 	audit;
}
}
*/