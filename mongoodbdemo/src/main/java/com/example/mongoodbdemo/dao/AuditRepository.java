package com.example.mongoodbdemo.dao;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongoodbdemo.model.Audit;

public interface AuditRepository extends MongoRepository<Audit, UUID> {

}
