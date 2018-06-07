package com.example.mongoodbdemo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;


import com.example.mongoodbdemo.dao.AuditRepository;
import com.example.mongoodbdemo.service.AuditServiceImpl;

public class AuditExceptionTest {

	@Mock
	AuditRepository repository;
	@InjectMocks
	AuditServiceImpl service;
	
	
	
	/*@Test(expected=AuditException.class)
    public void falsecreateTest() throws AuditException
    {
		AuditLog audit1=null;
		Mockito.when(auditRepo.save(audit1)).thenReturn(audit1);
		AuditLog audi;
	    audi = auditServcie.createAudit(audit1);
    }

@Test(expected=AuditException.class)
public void auditupdatefalsecase() throws AuditException
{
	Optional<AuditLog> opt=Optional.empty();
	when(auditRepo.findById(id)).thenReturn(opt);
	//AuditLog auditt=opt.get();
	//when(auditRepo.save(auditt)).thenReturn(auditt);
	AuditLog newAudit=auditServcie.update(id, "updation");


}

@Test
public void auditdeletetruecase() throws AuditException
{
	Optional<AuditLog> opt=Optional.of(audit);
	when(auditRepo.findById(id)).thenReturn(opt);
	AuditLog auditt=opt.get();
	
	String newAudit=auditServcie.deleteAudit(id);

	assertEquals("deleted",newAudit);
}

}*/

}
