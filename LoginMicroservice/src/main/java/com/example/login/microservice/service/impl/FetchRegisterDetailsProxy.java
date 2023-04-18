package com.example.login.microservice.service.impl;

import java.util.List;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.login.microservice.entity.RegisterEntity;

@FeignClient("FetchDetails-Service")
@LoadBalancerClient(name="FetchDetails-Service", configuration = CloudProviderConfiguration.class)
public interface FetchRegisterDetailsProxy {
	@GetMapping("/getDetails")
	public List<RegisterEntity> getDetails();
}
