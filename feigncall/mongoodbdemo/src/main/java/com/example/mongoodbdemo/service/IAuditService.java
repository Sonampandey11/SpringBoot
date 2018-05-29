package com.example.mongoodbdemo.service;

import java.util.Optional;
import java.util.UUID;

import com.example.mongoodbdemo.model.Audit;

/**
 * @author trainee
 *
 */
public interface IAuditService {

	/*
	 * method name: createAudit
	 * description: createAudit track and insert attribute such as uuid and save in mongo repo
	 */
	public Audit createAudit(Audit audit);

	/*method name: viewAudit
	 * description: viewAudit details on basis of uuid
	 */

	public Audit viewAudit(UUID eventId);


	/*
	 * method name : updateAudit
	 * description:updateAudit on basis of eventName 
	 */

	public Optional<Audit> updateAudit(UUID eventId,String eventName);

	/*
	 * method name: deleteAuditById
	 * description:deleteAudit on basis of uuid 
	 */
	public void deleteById(UUID eventId);



}
