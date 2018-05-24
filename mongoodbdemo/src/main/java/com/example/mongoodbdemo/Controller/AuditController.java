package com.example.mongoodbdemo.Controller;

import java.util.Optional;
import java.util.UUID;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.mongoodbdemo.exception.AuditException;
import com.example.mongoodbdemo.model.Audit;
import com.example.mongoodbdemo.service.IAuditService;


@RestController
@RequestMapping("/audit")
public class AuditController {
	private static final Logger log = Logger.getLogger(AuditController.class.getName());
	@Autowired
	IAuditService auditService;
	
	@PostMapping(value="/create")
	public ResponseEntity<Audit> createAudit(final @RequestBody Audit audit) throws AuditException
	{

		try
		{
			final Audit  auditObj=auditService.createAudit(audit) ;
			return new ResponseEntity<Audit>(auditObj,HttpStatus.OK);
		}
		catch(AuditException exception)
		{
			return new ResponseEntity("Provide valid input", HttpStatus.OK);
		}


	}

	@GetMapping(value="/getId/{eventId}")
	public ResponseEntity<Audit> getAuditById(final @PathVariable String eventId) throws AuditException
	{
		log.info("Please enter eventId");

		try
		{
			final Audit obj=auditService.viewAudit(UUID.fromString(eventId));
			return new ResponseEntity<Audit>(obj,HttpStatus.OK);
		}
		catch(AuditException exception)
		{
			throw new AuditException("id cannot be null");
		}

	}

	

	@PostMapping(value="/update")
	public ResponseEntity<Audit> updateAudit(final @RequestBody UUID eventId,final String eventName)throws AuditException
	{
		final Optional<Audit> obj=auditService.updateAudit(eventId, eventName);
		final Audit audit=obj.get();
		
		return new ResponseEntity<Audit>(audit,HttpStatus.OK);

	}



	@PostMapping(value="/delete/{eventId}")
	public void deleteAudit(final @PathVariable String eventId)
	{

		log.info("please enter valid eventId");
		try
		{
			auditService.deleteById(UUID.fromString(eventId) );
		}
		catch(AuditException exception)
		{
			throw new AuditException("eventId is invalid");
		}
	}

}
