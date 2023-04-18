package com.school.data.valid.service.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.school.data.valid.service.constant.CommonConstant;
import com.school.data.valid.service.entity.LoginEntity;
import com.school.data.valid.service.exception.AdminValidateException;
import com.school.data.valid.service.exception.ErrorResponse;
import com.school.data.valid.service.repo.LoginRepo;
import com.school.data.valid.service.request.LoginRequest;
import com.school.data.valid.service.response.AdminResponse;
import com.school.data.valid.service.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginRepo loginRepo;

	@Override
	public <T> Optional<T> loginValidate(LoginRequest loginRequest) throws AdminValidateException {
		LoginEntity loginEntity = loginRepo.findByUserName(loginRequest.getUserName());
		if(!ObjectUtils.isEmpty(loginEntity)) {
			if(!loginRequest.getPassword().equals(loginEntity.getPassword())) {
				return (Optional<T>) Optional.ofNullable(new ErrorResponse(CommonConstant.PASSWORD_MISMATCH_ERROR_CODE, CommonConstant.PASSWORD_MISMATCH_ERROR_MESSAGE));
			}
			AdminResponse adminResponse = new AdminResponse();
			if(!ObjectUtils.isEmpty(loginEntity.getLoginDetail()) && loginEntity.getLoginDetail() != null) {
				adminResponse.setAddres(loginEntity.getLoginDetail().getAddress());
				adminResponse.setAdminId(loginEntity.getLoginDetail().getAdminId());
				adminResponse.setDistrict(loginEntity.getLoginDetail().getDistrict());
				adminResponse.setDob(loginEntity.getLoginDetail().getDob());
				adminResponse.setEmail(loginEntity.getLoginDetail().getEmail());
				adminResponse.setFirstName(loginEntity.getLoginDetail().getFirstName());
				adminResponse.setLastName(loginEntity.getLoginDetail().getLastName());
				adminResponse.setMobile(loginEntity.getLoginDetail().getMobile());
				adminResponse.setPincode(loginEntity.getLoginDetail().getPincode());
				adminResponse.setState(loginEntity.getLoginDetail().getState());
				adminResponse.setCategory(loginEntity.getCategory());
			}
			return (Optional<T>) Optional.ofNullable(adminResponse);
		} else {
			return (Optional<T>) Optional.ofNullable(new ErrorResponse(CommonConstant.USERNAME_MISMATCH_ERROR_CODE, CommonConstant.USERNAME_MISMATCH_ERROR_MESSAGE));
		}
		
	}
	
	
}
