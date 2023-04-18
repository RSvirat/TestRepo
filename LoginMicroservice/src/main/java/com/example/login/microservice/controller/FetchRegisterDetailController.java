package com.example.login.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.login.microservice.entity.RegisterEntity;
import com.example.login.microservice.service.impl.FetchRegisterDetailService;

@Controller
public class FetchRegisterDetailController {

	@Autowired
	FetchRegisterDetailService fetchRegisterDetailService;
	
	@GetMapping("/getDetail")
	public ModelAndView getDetail() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("showRegistration");
		List<RegisterEntity> registerModel = fetchRegisterDetailService.getDetails();
		System.out.println(registerModel);
		modelAndView.addObject("items", registerModel);
		return modelAndView;
	}

}
