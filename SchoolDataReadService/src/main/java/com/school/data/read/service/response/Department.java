package com.school.data.read.service.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Department {
	private String deptName;
	private String inchargeId;
	private String inchargeEmail;
	private double deptId;
}
