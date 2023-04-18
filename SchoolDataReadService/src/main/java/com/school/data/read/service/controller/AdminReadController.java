package com.school.data.read.service.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.school.data.read.service.response.SchoolDataResponse;
import com.school.data.read.service.service.AdminReadService;

@RestController
@RequestMapping("/adminRead")
public class AdminReadController {
	
	@Autowired
	AdminReadService adminReadService;
	
	@GetMapping("/getAdmin/{userName}")
	public SchoolDataResponse adminRead(@PathVariable("userName") String userName, HttpServletResponse response) {
		SchoolDataResponse schoolDataResponse = adminReadService.readAdminDetail(userName);
		System.out.println("resposne code from request : "+response.getStatus());
		return schoolDataResponse;
	}
}
