package com.front.viewer.service.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.front.viewer.service.response.CategoryResponse;

public interface CategoryRepo extends MongoRepository<CategoryResponse, String>{

}
