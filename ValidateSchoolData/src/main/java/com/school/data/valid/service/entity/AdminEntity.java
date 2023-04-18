package com.school.data.valid.service.entity;

import java.util.Date;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Document(collection = "admin")
public class AdminEntity {
	@Id
	private String adminId;
	private String email;
	private long mobile;
	private String firstName;
	private String lastName;
	private String address;
	private String district;
	private Date dob;
	private String pincode;
	private String state;
}
