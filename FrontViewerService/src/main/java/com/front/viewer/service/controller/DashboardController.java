package com.front.viewer.service.controller;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.front.viewer.service.response.SchoolDataResponse;
import com.front.viewer.service.service.DashbordService;

@Controller
@RequestMapping("/Dashboard")
public class DashboardController {
	
	@Autowired
	DashbordService dashbordService;
	
	@GetMapping("/admin")
	public ModelAndView getDashboard(@QueryParam("userName") String userName) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("adminView");
		SchoolDataResponse schoolDataResponse = dashbordService.getSchoolData(userName);
		System.out.println(schoolDataResponse);
		modelAndView.addObject("schoolDataRes",schoolDataResponse);
		return modelAndView;
	}
}
