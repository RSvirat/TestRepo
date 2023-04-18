package com.su;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.su.model.Movie;

@Configuration
public class Config {

	@Bean
	public Movie getMovie() {
		return new Movie();
	}
}
