package com.front.viewer.service.service;

import com.front.viewer.service.request.LoginRequest;
import com.front.viewer.service.response.AdminResponse;

public interface LoginService {
	public AdminResponse adminLogin(LoginRequest loginRequest);
}
