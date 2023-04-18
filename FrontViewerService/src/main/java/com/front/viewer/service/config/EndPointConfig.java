package com.front.viewer.service.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application.properties")
public class EndPointConfig {
	
	@Value("${username}")
	private String loginVlaidateEndPoint;

	public String getLoginVlaidateEndPoint() {
		return loginVlaidateEndPoint;
	}

	public void setLoginVlaidateEndPoint(String loginVlaidateEndPoint) {
		this.loginVlaidateEndPoint = loginVlaidateEndPoint;
	}
}
