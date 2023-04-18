package com.front.viewer.service.service;



import java.util.List;

import com.front.viewer.service.response.CategoryResponse;
import com.front.viewer.service.response.Department;

public interface RegisterService{
	public List<Department> getDepartmentResponses();
	public List<CategoryResponse> getCategoryResponses();
}
