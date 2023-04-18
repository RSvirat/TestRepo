package com.school.data.read.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.school.data.read.service.entity.DepartmentEntity;

public interface DepartmentRepo extends MongoRepository<DepartmentEntity, Double>{
	
}
