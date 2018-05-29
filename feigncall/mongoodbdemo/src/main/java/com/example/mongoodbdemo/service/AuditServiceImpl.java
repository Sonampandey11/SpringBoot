package com.example.mongoodbdemo.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongoodbdemo.dao.AuditRepository;
import com.example.mongoodbdemo.exception.AuditException;
import com.example.mongoodbdemo.model.Audit;
/**
 * @author trainee
 *
 */
@Service
public class AuditServiceImpl  implements IAuditService {
	@Autowired
	AuditRepository auditRepository;
	/*
	 * method name: createAudit
	 * description: createAudit track and insert attribute such as uuid and save in mongo repo
	 */
	@Override
	public Audit createAudit(final Audit audit) {

		try {
			return auditRepository.save(audit);
		} catch (AuditException e) {
			// TODO Auto-generated catch block
			throw new AuditException("invalid!! input");

		}
	}

	/*method name: viewAudit
	 * description: viewAudit details on basis of uuid
	 */

	@Override
	public Audit viewAudit(final UUID eventId) {
		final Optional<Audit> auditObject=auditRepository.findByEventId(eventId);
		if(auditObject.isPresent())
		{
			final Audit audit=auditObject.get();
			return audit;
		}
		throw  new AuditException("eventId cannot be null");
	}


	/*
	 * method name : updateAudit
	 * description:updateAudit on basis of eventName 
	 */

	@Override
	public Optional<Audit> updateAudit(final UUID eventId,final String eventName) {
		final Optional<Audit> auditobj=auditRepository.findByEventId(eventId);
		if(auditobj.isPresent())
		{
			final Audit audit=auditobj.get();
			if(audit.getEventName()!=null)
			{
				audit.setEventName(eventName);
			}
			auditRepository.save(audit);

		}
		else
		{
			throw new AuditException("eventName cannot be null");
		}
		return auditobj;

	}


	/*
	 * method name: deleteAuditById
	 * description:deleteAudit on basis of uuid 
	 */
	@Override
	public void deleteById(final UUID eventId) {
		final Optional<Audit> auditObj=auditRepository.findByEventId(eventId);
		if(auditObj.isPresent())
		{
			auditRepository.deleteByEventId(eventId);

		}
		else
		{
			throw new AuditException("uuid does not exist");
		}

	}

}
