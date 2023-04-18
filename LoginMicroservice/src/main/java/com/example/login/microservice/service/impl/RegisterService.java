package com.example.login.microservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import com.example.login.microservice.entity.RegisterEntity;

@Service
@EnableAutoConfiguration
public class RegisterService {
	
	@Autowired
	RegisterProxy registerProxy;
	
	public RegisterEntity registerInsert(RegisterEntity registerEntity) {
		return registerProxy.regsiterInsert(registerEntity);
	}
}
