package com.school.data.read.service.model;

import java.util.Date;

import lombok.Data;

@Data
public class AdminDetailsModel {
	private String email;
	private long mobile;
	private String firstName;
	private String lastName;
	private String address;
	private String district;
	private Date dob;
}
