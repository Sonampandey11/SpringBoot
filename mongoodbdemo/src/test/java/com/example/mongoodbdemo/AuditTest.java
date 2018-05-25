package com.example.mongoodbdemo;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.mongoodbdemo.dao.AuditRepository;
import com.example.mongoodbdemo.exception.AuditException;
import com.example.mongoodbdemo.model.Audit;
import com.example.mongoodbdemo.service.AuditServiceImpl;
@RunWith(MockitoJUnitRunner.class)
public class AuditTest {
	@Mock
	AuditRepository auditRepository;

	@InjectMocks
	AuditServiceImpl service;

	@Test
	public void createAuditTest() throws AuditException
	{
		LocalDateTime today = LocalDateTime.now();
		Audit audit=new Audit("crud","local",today,4,new Object(),new Object());
		System.out.println(audit);
		Mockito.when(auditRepository.save(audit)).thenReturn(audit);
		//service.createAudit(audit);
		assertThat(service.createAudit(audit), is(notNullValue()));
	}	



	@Test
	public void viewDetailsByIdTest() throws AuditException
	{
		LocalDateTime today = LocalDateTime.now();
		Object ob=new Object();
		Object ob2=new Object();
		Audit audit=new Audit("crud","local",today,45,new Object(),new Object());
		Optional<Audit> obj=Optional.of(audit);
		Mockito.when(auditRepository.findById(Mockito.any(UUID.class))).thenReturn(obj);
		UUID uid = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");
		assertThat(service.viewAudit(uid), is(notNullValue()));


	}


	@Test
	public void updateAudit() {
		LocalDateTime today = LocalDateTime.now();
		Audit audit=new Audit("crud","local",today,45,new Object(),new Object());
		Optional<Audit> obj=Optional.of(audit);
		//when(service.updateAudit(eventId, eventName))





		//when(auditRepository.findById(Mockito.any(UUID.class))).thenReturn(obj);

		//assertEquals(service.updateAudit(obj.), eventName);
}
		 
	

	@Test
	public void deleteAuditTest() throws AuditException
	{
		LocalDateTime today = LocalDateTime.now();
		Audit audit=new Audit("crud","local",today,45,new Object(),new Object());
		UUID uid = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");
		Optional<Audit> obj=Optional.of(audit);
		when(auditRepository.findById(uid)).thenReturn(obj);
		service.deleteById(uid);
		//assertThat(service.deleteById(uid), is(notNullValue()));


	}

	@Test
	public void testcreateAuditNegative() throws AuditException
	{
		Audit audit=null;
		Mockito.when(auditRepository.save(audit)).thenReturn(audit);
		Audit Obj= service.createAudit(audit);
	}
	
	@Test
	public void testUpdate() throws AuditException
	{
		Optional<Audit> audit=Optional.empty();
		UUID uid = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");
		when(auditRepository.findById(uid)).thenReturn(audit);
		//Audit object=service.updateAudit(uid, "abc");
		
	}




}
