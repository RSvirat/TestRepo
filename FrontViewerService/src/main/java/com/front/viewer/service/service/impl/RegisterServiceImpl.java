package com.front.viewer.service.service.impl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.front.viewer.service.repo.CategoryRepo;
import com.front.viewer.service.repo.DepartmentRepo;
import com.front.viewer.service.response.CategoryResponse;
import com.front.viewer.service.response.Department;
import com.front.viewer.service.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	DepartmentRepo departmentRepo;
	
	@Autowired
	CategoryRepo categoryRepo;
	
	@Override
	public List<Department> getDepartmentResponses() {
		return departmentRepo.findAll();
	}

	@Override
	public List<CategoryResponse> getCategoryResponses() {
		return categoryRepo.findAll();
	}
}
