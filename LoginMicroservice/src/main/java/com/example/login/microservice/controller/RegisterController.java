package com.example.login.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.login.microservice.entity.RegisterEntity;
import com.example.login.microservice.service.impl.RegisterService;

@Controller
@EnableAutoConfiguration
public class RegisterController {

	@Autowired
	RegisterService registerService;
	
	@PostMapping("/registerInsert")
	public String registerInsert(@ModelAttribute RegisterEntity registerEntity) {
		RegisterEntity registerModel2 = registerService.registerInsert(registerEntity);
		System.out.println(registerModel2.toString());
		return "redirect";
	}
	
	
	
}
