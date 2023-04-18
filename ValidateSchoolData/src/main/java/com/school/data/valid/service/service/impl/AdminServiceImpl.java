package com.school.data.valid.service.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.school.data.valid.service.constant.CommonConstant;
import com.school.data.valid.service.entity.AdminEntity;
import com.school.data.valid.service.exception.AdminValidateException;
import com.school.data.valid.service.repo.AdminRepo;
import com.school.data.valid.service.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepo adminRepo;
	
	@Override
	public AdminEntity adminEmailValidate(String email) throws AdminValidateException {
		AdminEntity adminEntity = adminRepo.findByEmail(email);
		if(!ObjectUtils.isEmpty(adminEntity)) {
			return adminEntity;
		} else {
			throw new AdminValidateException(CommonConstant.EMAIL_ERROR_CODE, CommonConstant.EMAIL_ERROR_MESSAGE);
		}
	}

}
