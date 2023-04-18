package com.school.data.read.service.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import com.school.data.read.service.model.AdminDetailsModel;

import lombok.Data;

@Data
@Document(collection = "loginDetails")
public class AdminModel {
	private String category;
	private AdminDetailsModel loginDetail;
}
