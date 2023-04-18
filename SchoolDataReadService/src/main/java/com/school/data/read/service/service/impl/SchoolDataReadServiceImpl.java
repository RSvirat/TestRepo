package com.school.data.read.service.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.util.ObjectUtils;

import com.mongodb.MongoException;
import com.school.data.read.service.constant.CommonConstant;
import com.school.data.read.service.entity.AdminModel;
import com.school.data.read.service.entity.DepartmentEntity;
import com.school.data.read.service.entity.StaffEntity;
import com.school.data.read.service.entity.StudentDetailEntity;
import com.school.data.read.service.exception.AdminReadException;
import com.school.data.read.service.exception.MongoDataBaseException;
import com.school.data.read.service.repository.DepartmentRepo;
import com.school.data.read.service.repository.StaffRepo;
import com.school.data.read.service.repository.StudentDetailRepo;

public abstract class SchoolDataReadServiceImpl {
	
	@Autowired
	DepartmentRepo departmentRepo;
	
	@Autowired
	MongoOperations mongoOperation;
	
	@Autowired
	StaffRepo staffRepo;
	
	@Autowired
	StudentDetailRepo studentDetailRepo;
	
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
	
	public AdminModel readAdminDetails(String userName) {
		try {
			Query query = Query.query(Criteria.where("userName").is(userName));
			AdminModel adminModel = mongoOperation.findOne(query, AdminModel.class);
			if(ObjectUtils.isEmpty(adminModel)) {
				throw new AdminReadException(CommonConstant.USERNAME_INVALID_CODE,CommonConstant.USERNAME_INVALID_MESSAGE);
			} else {
				return adminModel;
			}
		} catch(MongoException exception) {
			throw new MongoDataBaseException(exception.getCode(), exception.getMessage());
		}
	}
	
	public List<StaffEntity> readStaffDetails() {
		try {
			List<StaffEntity> staffEntities = staffRepo.findAll();
			return staffEntities;
		} catch(MongoException e) {
			throw new MongoDataBaseException(e.getCode(), e.getMessage());
		}
	}
	
	public List<StudentDetailEntity> readStudentDetail() {
		try {
			List<StudentDetailEntity> studentDetailEntities = studentDetailRepo.findAll();
			return studentDetailEntities;
		} catch(MongoException e) {
			throw new MongoDataBaseException(e.getCode(), e.getMessage());
		}
	}
}
