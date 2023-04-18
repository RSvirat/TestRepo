package com.example.login.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.login.microservice.model.LoginModel;
import com.example.login.microservice.service.impl.LoginServiceImpl;

@Controller
@EnableAutoConfiguration
public class LoginController {
	
	@Autowired
	LoginServiceImpl loginServiceImpl;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("/login")
	public ModelAndView login(@ModelAttribute LoginModel loginModel) {
		String result = loginServiceImpl.addLogin(loginModel);
		ModelAndView modelAndView = new ModelAndView();
		if(result.equals("success")) {
			modelAndView.setViewName("showRegistration");
			modelAndView.addObject("items", loginServiceImpl);
		} else {
			modelAndView.setViewName("index");
		}
 		return modelAndView;
	}
	
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("/registerBeh")
	public String registerBeh() {
		return "registerBeh";
	}
}
