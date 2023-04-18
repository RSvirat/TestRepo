package com.school.data.valid.service.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.school.data.valid.service.entity.LoginEntity;

public interface LoginRepo extends MongoRepository<LoginEntity, String>{
	public LoginEntity findByUserName(String userName);
}
