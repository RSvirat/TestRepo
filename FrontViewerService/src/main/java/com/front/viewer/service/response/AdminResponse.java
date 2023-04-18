package com.front.viewer.service.response;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AdminResponse {
	private String adminId;
	private String email;
	private long mobile;
	private String firstName;
	private String lastName;
	private String addres;
	private String district;
	private Date dob;
	private String pincode;
	private String state;
	private String category;
}
