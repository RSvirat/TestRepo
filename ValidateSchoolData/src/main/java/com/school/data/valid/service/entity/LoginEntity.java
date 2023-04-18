package com.school.data.valid.service.entity;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import com.school.data.valid.service.model.LoginDetails;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Document(collection = "loginDetails")
public class LoginEntity {
	
	private String loginId;
	@Id
	private String userName;
	private String password;
	private String category;
	private LoginDetails loginDetail;
}
