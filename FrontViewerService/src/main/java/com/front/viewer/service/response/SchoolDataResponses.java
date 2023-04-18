package com.front.viewer.service.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SchoolDataResponses {
	private AdminDataResponse adminDataResponse;
	private List<Department> department;
	private List<StudentDetail> studentDetail;
	private List<Staff> staff;
	private int staffCount;
	private int studentDetailCount;
	private int departmentCount;
}
	