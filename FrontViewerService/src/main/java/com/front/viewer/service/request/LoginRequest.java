package com.front.viewer.service.request;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LoginRequest {	
	
	private String userName;
	private String password;
	
}
