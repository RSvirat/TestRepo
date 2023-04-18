package com.front.viewer.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.front.viewer.service.response.Department;
import com.front.viewer.service.service.impl.RegisterServiceImpl;

@Controller
@EnableAutoConfiguration
public class RegisterController {

	@Autowired
	RegisterServiceImpl registerServiceImpl;
	
	@GetMapping("/register")
	public ModelAndView register() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("register");
		modelAndView.addObject("categories",registerServiceImpl.getCategoryResponses());
		return modelAndView;
	}
	
	@GetMapping("/department")
	public ResponseEntity<List<Department>> getDepartmentResponses() {
		return new ResponseEntity<List<Department>>(registerServiceImpl.getDepartmentResponses(), HttpStatus.OK);
	}
}
