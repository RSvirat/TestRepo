package com.school.data.valid.service.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.school.data.valid.service.entity.AdminEntity;

public interface AdminRepo extends MongoRepository<AdminEntity, String> {
	public AdminEntity findByEmail(String email);
}
