package com.school.data.read.service.entity;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Document(collection = "stuff")
public class StaffEntity {
	private String name;
	private String mobile;
	private String designation;
	private Date dob;
	private String staffEmail;
	private String staffId;
}
