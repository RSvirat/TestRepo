package com.school.data.read.service.entity;

import java.util.Date;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Document(collection = "studentDetails")
public class StudentDetailEntity {
	@Id
	private long studentId;
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
}
