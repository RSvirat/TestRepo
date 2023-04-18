package com.front.viewer.service.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.front.viewer.service.constant.CommonConstant;
import com.front.viewer.service.exception.LoginException;
import com.front.viewer.service.request.LoginRequest;
import com.front.viewer.service.response.AdminResponse;
import com.front.viewer.service.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {


	@Autowired
	WebService webService;
	
	@Override
	public AdminResponse adminLogin(LoginRequest loginRequest) {
		 
		AdminResponse adminResponse = webService.involvePost(CommonConstant.LOGIN_USERNAME_PASSWORD_VALIDATE_URL,
				loginRequest, AdminResponse.class);
		if(adminResponse.getMobile() == 0) {
			throw new LoginException(CommonConstant.PASSWORD_AND_USERNAME_INCORRECT_CODE, CommonConstant.PASSWORD_AND_USERNAME_INCORRECT_MESSAGE);
		}
		return adminResponse;
	}
	
}
