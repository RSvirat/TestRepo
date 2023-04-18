package com.front.viewer.service.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.front.viewer.service.response.Department;

public interface DepartmentRepo extends MongoRepository<Department, Double>{

}
