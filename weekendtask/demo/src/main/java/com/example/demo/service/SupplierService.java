package com.example.demo.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.SupplierRepository;
import com.example.demo.model.Supplier;
@Service
public class SupplierService {
	@Autowired
	SupplierRepository supplierRepository;
	
	public Supplier addSupplier(Supplier supplier) {

		return supplierRepository.save(supplier);
	}

	public Optional<Supplier> viewSupplier(Integer supplierId) {
		
		return supplierRepository.findById(supplierId);
	}

	public Supplier updateSupplier(Integer supplierId) {
		Supplier supplier=new Supplier();
		supplier.setSupplierId(supplierId);		
		supplier.setSupplierName("kitkat");
		return supplierRepository.save(supplier);
	}
	


}
