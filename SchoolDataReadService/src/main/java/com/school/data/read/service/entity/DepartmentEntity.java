package com.school.data.read.service.entity;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "department")
public class DepartmentEntity {
	private String deptName;
	private String inchargeId;
	private String inchargeEmail;
	@Id
	private double deptId;
}
