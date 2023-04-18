package com.school.data.valid.service.service;

import com.school.data.valid.service.entity.AdminEntity;
import com.school.data.valid.service.exception.AdminValidateException;

public interface AdminService {
	public AdminEntity adminEmailValidate(String email) throws AdminValidateException;
}
