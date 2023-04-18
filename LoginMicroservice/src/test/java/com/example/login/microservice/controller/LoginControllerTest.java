package com.example.login.microservice.controller;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


import com.example.login.microservice.service.impl.LoginServiceImpl;


public class LoginControllerTest {
	
	@Mock
	LoginServiceImpl loginServiceImpl;
	
	@InjectMocks
	LoginController loginController;
	
	MockMvc mockMvc;
	
	@BeforeEach
	public void init() {
		MockitoAnnotations.openMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(loginController).build();
	}
	
	@Test
	public void loginTest() throws Exception {
		MockHttpServletResponse response = mockMvc.perform(get("/login").accept(MediaType.TEXT_HTML)).andReturn().getResponse();
		assertNotNull(response);
	}
}
