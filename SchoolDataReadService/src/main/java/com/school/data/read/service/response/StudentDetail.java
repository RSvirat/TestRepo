package com.school.data.read.service.response;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class StudentDetail {
	private String name;
	private String fatherName;
	private String motherName;
	private Date dob;
	private String email;
	private String mobile;
	private String deptId;
	private String courseId;
	private String qulication;
	private String batch;
	private long studentId;
}
