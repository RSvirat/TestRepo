package com.school.data.valid.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ValidateSchoolDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValidateSchoolDataApplication.class, args);
	}

}
