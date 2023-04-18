package com.school.data.valid.service.service;


import java.util.Optional;

import com.school.data.valid.service.exception.AdminValidateException;
import com.school.data.valid.service.request.LoginRequest;
import com.school.data.valid.service.response.AdminResponse;

public interface LoginService {
	public <T> Optional<T> loginValidate(LoginRequest loginRequest) throws AdminValidateException; 
}
