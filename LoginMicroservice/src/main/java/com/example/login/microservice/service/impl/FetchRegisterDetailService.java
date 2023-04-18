package com.example.login.microservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.login.microservice.entity.RegisterEntity;

@Service
public class FetchRegisterDetailService {
	@Autowired
	RegisterProxy registerProxy;
	
	public List<RegisterEntity> getDetails() {
		return registerProxy.getDetail();
	}
}
