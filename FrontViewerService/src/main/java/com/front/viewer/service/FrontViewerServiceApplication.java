package com.front.viewer.service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FrontViewerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontViewerServiceApplication.class, args);
	}
	
	@Bean
	public WebClient.Builder getWeBuilder() {
		return WebClient.builder();
	}
}
