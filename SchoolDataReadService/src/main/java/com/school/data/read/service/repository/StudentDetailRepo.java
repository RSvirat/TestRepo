package com.school.data.read.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.school.data.read.service.entity.StudentDetailEntity;

public interface StudentDetailRepo extends MongoRepository<StudentDetailEntity, Long>{
	
}
