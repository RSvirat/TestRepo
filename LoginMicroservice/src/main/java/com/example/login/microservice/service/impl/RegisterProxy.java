package com.example.login.microservice.service.impl;

import java.util.List;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.login.microservice.entity.RegisterEntity;

@FeignClient("Register-Service")
@LoadBalancerClient(name="Register-Service", configuration = CloudProviderConfiguration.class)
public interface RegisterProxy {
	@PostMapping("/registerInsert")
	public RegisterEntity regsiterInsert(@RequestBody RegisterEntity registerEntity); 
	
	@GetMapping("/getDetail")
	public List<RegisterEntity> getDetail();
}
