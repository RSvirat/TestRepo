package com.school.data.read.service.entity;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import com.school.data.read.service.model.DepartmentModel;

import lombok.Data;

@Data
@Document(collection = "registers")
public class RegisterEntity {
	
	@Id
	private long regId;
	private String firstName;
	private String lastName;
	private String category;
	private AdminModel admin;
}
