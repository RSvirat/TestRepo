package com.example.login.microservice.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.login.microservice.model.LoginModel;





@Service
@EnableAutoConfiguration
public class LoginServiceImpl {
	
	@Autowired
	RestTemplate restTemplate;
	
	public String addLogin(LoginModel loginModel) {
		LoginModel loginModel2 = new LoginModel("sudhakar", "SujjiYuva@1234");
		System.out.println(loginModel2.toString()+" "+loginModel.toString());
		return loginModel2.getLogin().equals(loginModel.getLogin())
				&& loginModel2.getPassword().equals(loginModel.getPassword()) ? "success"
						: "error";   
	}
	
	
}
