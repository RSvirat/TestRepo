package com.school.data.read.service.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SchoolDataResponses {
	private AdminDataResponse adminDataResponse;
	private List<Department> department;
	private List<Staff> staff;
	private List<StudentDetail> studentDetail;
	private int staffCount;
	private int studentDetailCount; 
}
