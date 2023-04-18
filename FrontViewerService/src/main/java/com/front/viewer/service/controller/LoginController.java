package com.front.viewer.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.front.viewer.service.request.LoginRequest;
import com.front.viewer.service.response.AdminResponse;
import com.front.viewer.service.service.LoginService;

@Controller
@EnableAutoConfiguration
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@GetMapping("/")
	public String login() {
		return "login";
	}
	
	@GetMapping("/admin")
	public ModelAndView adminLogin() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("adminView");
		return modelAndView;
	}
	
	@PostMapping("/adminLogin")
	@ResponseBody
	public AdminResponse login(@RequestBody LoginRequest loginRequest) {
		return loginService.adminLogin(loginRequest);
	}
}
