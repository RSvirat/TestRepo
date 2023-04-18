package com.school.data.read.service.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;

import com.mongodb.MongoException;
import com.school.data.read.service.constant.CommonConstant;
import com.school.data.read.service.entity.DepartmentEntity;import com.school.data.read.service.exception.AdminReadException;
import com.school.data.read.service.repository.DepartmentRepo;
import com.school.data.read.service.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentRepo departmentRepo;
	
	@Override
	public List<DepartmentEntity> getDepartment() {
		try {
			List<DepartmentEntity> departmentEntities = departmentRepo.findAll();
			if(departmentEntities.size() > 0 || !ObjectUtils.isEmpty(departmentEntities)) {
				return departmentEntities;
			} else {
				throw new AdminReadException(CommonConstant.DEPARTMENT_EMPTY_CODE, CommonConstant.DEPARTMENT_EMPTY_MESSAGE);
			}
		} catch(MongoException e) {
			throw new MongoException(e.getCode(), e.getMessage());
		}
	}

}
