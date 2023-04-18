package com.front.viewer.service.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.front.viewer.service.constant.CommonConstant;
import com.front.viewer.service.response.SchoolDataResponse;
import com.front.viewer.service.service.DashbordService;

@Service
public class DashbordServiceImpl implements DashbordService{

	@Autowired
	WebService webService;
	@Override
	public SchoolDataResponse getSchoolData(String userName) {
		String url = CommonConstant.ADMIN_DETAILS_URL+"/"+userName;
		SchoolDataResponse schoolDataResponse =  webService.involveGet(url, null, SchoolDataResponse.class);
		schoolDataResponse.getSchoolDataResponses().setStaffCount(schoolDataResponse.getSchoolDataResponses().getStaff().size());
		schoolDataResponse.getSchoolDataResponses().setStudentDetailCount(schoolDataResponse.getSchoolDataResponses().getStudentDetail().size());
		schoolDataResponse.getSchoolDataResponses().setDepartmentCount(schoolDataResponse.getSchoolDataResponses().getDepartment().size());
		return schoolDataResponse;
	} 

}
