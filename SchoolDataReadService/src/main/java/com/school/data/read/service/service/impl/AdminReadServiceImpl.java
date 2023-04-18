package com.school.data.read.service.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.school.data.read.service.constant.CommonConstant;
import com.school.data.read.service.entity.AdminModel;
import com.school.data.read.service.entity.DepartmentEntity;
import com.school.data.read.service.entity.StaffEntity;
import com.school.data.read.service.entity.StudentDetailEntity;
import com.school.data.read.service.exception.AdminReadException;
import com.school.data.read.service.response.AdminDataResponse;
import com.school.data.read.service.response.Department;
import com.school.data.read.service.response.SchoolDataResponse;
import com.school.data.read.service.response.SchoolDataResponses;
import com.school.data.read.service.response.Staff;
import com.school.data.read.service.response.StudentDetail;
import com.school.data.read.service.service.AdminReadService;

@Service
public class AdminReadServiceImpl extends SchoolDataReadServiceImpl implements AdminReadService {

	@Autowired
	MongoOperations mongoOperation;

	@Override
	public SchoolDataResponse readAdminDetail(String userName) {
		AdminModel adminModel = super.readAdminDetails(userName);
		List<DepartmentEntity> departmentEntity = super.getDepartment();
		SchoolDataResponses schoolDataResponses = new SchoolDataResponses();
		SchoolDataResponse schoolDataResponse = new SchoolDataResponse();
		if (ObjectUtils.isEmpty(adminModel) && ObjectUtils.isEmpty(departmentEntity) || departmentEntity.size() == 0) {
			throw new AdminReadException(CommonConstant.RECORD_NOT_FETCH_CODE, CommonConstant.RECORD_NOT_FETCH_MESSAGE);
		} else {
			AdminDataResponse adminDataResponse = new AdminDataResponse();
			adminDataResponse.setCategory(adminModel.getCategory());
			adminDataResponse.setEmail(adminModel.getLoginDetail().getEmail());
			adminDataResponse.setFirstName(adminModel.getLoginDetail().getFirstName());
			adminDataResponse.setLastName(adminModel.getLoginDetail().getLastName());
			adminDataResponse.setAddress(adminModel.getLoginDetail().getAddress());
			adminDataResponse.setDistrict(adminModel.getLoginDetail().getDistrict());
			adminDataResponse.setMobile(adminModel.getLoginDetail().getMobile());
			adminDataResponse.setEmail(adminModel.getLoginDetail().getEmail());
			adminDataResponse.setDob(adminModel.getLoginDetail().getDob());
			schoolDataResponses.setAdminDataResponse(adminDataResponse);
			setDepartDetails(schoolDataResponses, departmentEntity);
			setStaffDetails(schoolDataResponses, readStaffDetails());
			setStudentDetail(schoolDataResponses, readStudentDetail());
			schoolDataResponse.setSchoolDataResponses(schoolDataResponses);
		}

		return schoolDataResponse;
	}

	private void setStaffDetails(SchoolDataResponses schoolDataResponses, List<StaffEntity> staffEntities) {
		List<Staff> staffs = new ArrayList<Staff>();
		for(StaffEntity staffEntity: staffEntities) {
			Staff staff = new Staff();
			staff.setDesignation(staffEntity.getDesignation());
			staff.setDob(staffEntity.getDob());
			staff.setMobile(staffEntity.getMobile());
			staff.setName(staffEntity.getName());
			staff.setStaffEmail(staffEntity.getStaffEmail());
			staff.setStaffId(staffEntity.getStaffId());
			staffs.add(staff);
		}
		schoolDataResponses.setStaff(staffs);
	}
	
	@Override
	public List<StudentDetailEntity> readStudentDetail() {
		return super.readStudentDetail();
	}
	
	private void setStudentDetail(SchoolDataResponses schoolDataResponses,
			List<StudentDetailEntity> studentDetailEntities) {
		List<StudentDetail> studentDetailList = new ArrayList<StudentDetail>();
		for(StudentDetailEntity studentDetailEntity : studentDetailEntities) {
			StudentDetail studentDetail = new StudentDetail();
			studentDetail.setBatch(studentDetailEntity.getBatch());
			studentDetail.setCourseId(studentDetailEntity.getCourseId());
			studentDetail.setDeptId(studentDetailEntity.getDeptId());
			studentDetail.setDob(studentDetailEntity.getDob());
			studentDetail.setEmail(studentDetailEntity.getEmail());
			studentDetail.setFatherName(studentDetailEntity.getFatherName());
			studentDetail.setMobile(studentDetailEntity.getMobile());
			studentDetail.setMotherName(studentDetailEntity.getMotherName());
			studentDetail.setName(studentDetailEntity.getName());
			studentDetail.setQulication(studentDetailEntity.getQulication());
			studentDetail.setStudentId(studentDetailEntity.getStudentId());
			studentDetailList.add(studentDetail);
		}
		schoolDataResponses.setStudentDetail(studentDetailList);
	}

	private void setDepartDetails(SchoolDataResponses schoolDataResponses,
			List<DepartmentEntity> departmentEntity) {
		List<Department> departmentList = new ArrayList<Department>();
		for (DepartmentEntity departmentEntity2 : departmentEntity) {
			Department department = new Department();
			department.setDeptId(departmentEntity2.getDeptId());
			department.setDeptName(departmentEntity2.getDeptName());
			department.setInchargeEmail(departmentEntity2.getInchargeEmail());
			department.setInchargeId(departmentEntity2.getInchargeId());
			departmentList.add(department);
		}
		schoolDataResponses.setDepartment(departmentList);
	}

	@Override
	public List<StaffEntity> readStaffDetails() {
		return super.readStaffDetails();
	}
	
	
}
