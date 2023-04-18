package com.front.viewer.service.response;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AdminDataResponse {
	private String category;
	private String email;
	private long mobile;
	private String firstName;
	private String lastName;
	private String address;
	private String district;
	private Date dob;
}

