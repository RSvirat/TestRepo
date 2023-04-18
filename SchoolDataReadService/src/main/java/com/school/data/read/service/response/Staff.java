package com.school.data.read.service.response;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Staff {
	private String name;
	private String mobile;
	private String designation;
	private Date dob;
	private String staffEmail;
	private String staffId;
}
