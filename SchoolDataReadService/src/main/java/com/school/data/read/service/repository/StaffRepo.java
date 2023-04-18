package com.school.data.read.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.school.data.read.service.entity.StaffEntity;

public interface StaffRepo extends MongoRepository<StaffEntity, String>{

}
