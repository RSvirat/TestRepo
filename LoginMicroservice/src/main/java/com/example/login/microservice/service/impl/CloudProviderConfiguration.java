package com.example.login.microservice.service.impl;

import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

class CloudProviderConfiguration {
	@Bean
	public ServiceInstanceListSupplier discoveryClientServiceInstanceListSupplier(ConfigurableApplicationContext configurableApplicationContext) {
		return ServiceInstanceListSupplier.builder().withBlockingDiscoveryClient().withZonePreference()
				.build(configurableApplicationContext);
	}
}
