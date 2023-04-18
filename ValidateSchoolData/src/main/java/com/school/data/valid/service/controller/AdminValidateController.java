package com.school.data.valid.service.controller;

import java.util.Optional;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.data.valid.service.constant.CommonConstant;
import com.school.data.valid.service.entity.AdminEntity;
import com.school.data.valid.service.entity.LoginEntity;
import com.school.data.valid.service.exception.AdminValidateException;
import com.school.data.valid.service.request.LoginRequest;
import com.school.data.valid.service.response.AdminResponse;
import com.school.data.valid.service.service.AdminService;
import com.school.data.valid.service.service.LoginService;

@RestController
@RequestMapping("/adminValidate")
public class AdminValidateController {

	@Autowired
	AdminService adminService;
	
	@Autowired
	LoginService loginService;
	
	@PostMapping("/adminUserValidate/{email}")
	public AdminEntity adminUserValidate(@PathVariable String email) throws AdminValidateException {
		return adminService.adminEmailValidate(email);
	}
	
	@GetMapping("/success")
	public String getVString(@RequestBody LoginRequest loginRequest) {
		return loginRequest.getUserName();
	}
	
	@PostMapping("/validatedUserName")
	public AdminResponse loginUserNameValidate(@PathVariable String userName) {
		return null;
	}
	
	@PostMapping("/login")
	public <T> Optional<T> loginUserValidate(@RequestBody LoginRequest loginRequest) throws AdminValidateException {
		return loginService.loginValidate(loginRequest);
	}
}
