package com.school.data.read.service.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.school.data.read.service.entity.RegisterEntity;
import com.school.data.read.service.repository.RegisterRepo;

@Service
public class RegisterServiceImpl implements RegisterRepo {

	@Autowired
	MongoOperations mongoOperations;
	@Override
	public List<RegisterEntity> findList() {
		Query query = Query.query(Criteria.where("firstName").is("sudhakar"));
		List<RegisterEntity> list = mongoOperations.find(query, RegisterEntity.class);
		return list;
	}
	

}
