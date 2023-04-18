package com.front.viewer.service.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class WebService {
	
	@Autowired
	WebClient.Builder webClient;
	
	public <B, T> T involvePost(String url, Object requestOptional, final Class<T> responseClass) {
		return webClient.build()
				.post()
				.uri(url)
				.bodyValue(requestOptional)
				.retrieve()
				.bodyToMono(responseClass)
				.block();
	}
	
	public <B, T> T involveGet(String url, Object requestObject, final Class<T> responseClass) {
		return webClient.build()
				.get()
				.uri(url)
				.retrieve()
				.bodyToMono(responseClass)
				.block();
	}
}
