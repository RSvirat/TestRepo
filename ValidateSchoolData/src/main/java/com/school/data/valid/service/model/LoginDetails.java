package com.school.data.valid.service.model;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LoginDetails {
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
