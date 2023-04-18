package com.front.viewer.service.response;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "department")
public class Department {
	private String deptName;
	private String inchargeId;
	private String inchargeEmail;
	private double deptId;
}
