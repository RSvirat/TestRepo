package com.school.data.read.service.test.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.school.data.read.service.controller.AdminReadController;
import com.school.data.read.service.response.AdminDataResponse;
import com.school.data.read.service.response.Department;
import com.school.data.read.service.response.SchoolDataResponse;
import com.school.data.read.service.response.SchoolDataResponses;
import com.school.data.read.service.service.AdminReadService;


public class AdminReadControllerTest {

	@Mock
	AdminReadService adminReadService;
	
	@InjectMocks
	AdminReadController adminReadController;
	
	MockMvc mockMvc;
	
	@BeforeEach
	public void init() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(AdminReadController.class).build();
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void adminReadTest() {
		SchoolDataResponse schoolDataResponse = getSchoolDataResponse();
		String userName = "sudhakar_18.R";
		when(adminReadService.readAdminDetail(anyString())).thenReturn(schoolDataResponse);
		assertNotNull(adminReadController.adminRead(userName, null));
	}
	
	@Test
	public void adminReadTestMvc() throws Exception {
		//when(adminReadService.readAdminDetail(anyString())).thenReturn(getSchoolDataResponse());
		mockMvc.perform(get("/adminRead/getAdmin/{userName}", "sudhakar_18.R"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.schoolDataResponses.adminDataResponse.category", Matchers.is("admin")))
				.andExpect(MockMvcResultMatchers.jsonPath("$.schoolDataResponses.adminDataResponse.address", Matchers.is("selliamman nagar ,thatti thoppu")))
				.andExpect(MockMvcResultMatchers.jsonPath("$.schoolDataResponses.adminDataResponse.email", Matchers.is("sudhakardir@yahoo.com")))
				.andExpect(MockMvcResultMatchers.jsonPath("$.schoolDataResponses.adminDataResponse.mobile", Matchers.is(86083238)))
				.andExpect(MockMvcResultMatchers.jsonPath("$.schoolDataResponses.adminDataResponse.address", Matchers.is("selliamman nagar ,thatti thoppu")));
	}
	private SchoolDataResponse getSchoolDataResponse() {
		SchoolDataResponse schoolDataResponse = new SchoolDataResponse();
		SchoolDataResponses schoolDataResponses = new SchoolDataResponses();
		AdminDataResponse adminDataResponse = new AdminDataResponse();
		Department department = new Department();
		List<Department> list = new ArrayList<Department>();
		adminDataResponse.setAddress("selliamman nagar ,thatti thoppu");
		adminDataResponse.setCategory("admin");
		adminDataResponse.setEmail("sudhakardir@yahoo.com");
		adminDataResponse.setMobile(86083238);
		adminDataResponse.setFirstName("sudhakar");
		department.setDeptId(100001.0);
		department.setDeptName("CS");
		list.add(department);
		schoolDataResponses.setAdminDataResponse(adminDataResponse);
		schoolDataResponses.setDepartment(list);
		schoolDataResponse.setSchoolDataResponses(schoolDataResponses);
		return schoolDataResponse;
	}
	
	private String getResult() {
		return "{\r\n"
				+ "    \"schoolDataResponses\": {\r\n"
				+ "        \"adminDataResponse\": {\r\n"
				+ "            \"category\": \"admin\",\r\n"
				+ "            \"email\": \"sudhakardir@yahoo.com\",\r\n"
				+ "            \"mobile\": 8608323839,\r\n"
				+ "            \"firstName\": \"sudhakar\",\r\n"
				+ "            \"lastName\": \"R\",\r\n"
				+ "            \"address\": \"selliamman nagar ,thatti thoppu\",\r\n"
				+ "            \"district\": \"kanchipuram\",\r\n"
				+ "            \"dob\": \"1997-06-29T00:00:00.000+00:00\"\r\n"
				+ "        },\r\n"
				+ "        \"department\": [\r\n"
				+ "            {\r\n"
				+ "                \"deptName\": \"CS\",\r\n"
				+ "                \"inchargeId\": \"611400117\",\r\n"
				+ "                \"inchargeEmail\": \"pazhani1829@gmail.com\",\r\n"
				+ "                \"deptId\": 100001.0\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"deptName\": \"MATHS\",\r\n"
				+ "                \"inchargeId\": \"611400118\",\r\n"
				+ "                \"inchargeEmail\": \"malar1234@gmail.com\",\r\n"
				+ "                \"deptId\": 100002.0\r\n"
				+ "            }\r\n"
				+ "        ],\r\n"
				+ "        \"staff\": [\r\n"
				+ "            {\r\n"
				+ "                \"name\": \"pazhani\",\r\n"
				+ "                \"mobile\": \"8825849059\",\r\n"
				+ "                \"designation\": \"HOD\",\r\n"
				+ "                \"dob\": \"1997-06-28T18:30:00.000+00:00\",\r\n"
				+ "                \"staffEmail\": \"pazhai@gmail.com\",\r\n"
				+ "                \"staffId\": \"611400117\"\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"name\": \"malar\",\r\n"
				+ "                \"mobile\": \"8825849060\",\r\n"
				+ "                \"designation\": \"HOD\",\r\n"
				+ "                \"dob\": \"1998-06-27T18:30:00.000+00:00\",\r\n"
				+ "                \"staffEmail\": \"malar@gmail.com\",\r\n"
				+ "                \"staffId\": \"611400118\"\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"name\": \"raghul\",\r\n"
				+ "                \"mobile\": \"8825849061\",\r\n"
				+ "                \"designation\": \"Professor\",\r\n"
				+ "                \"dob\": \"1999-12-03T18:30:00.000+00:00\",\r\n"
				+ "                \"staffEmail\": \"raghul@gmail.com\",\r\n"
				+ "                \"staffId\": \"611400119\"\r\n"
				+ "            }\r\n"
				+ "        ],\r\n"
				+ "        \"studentDetail\": [\r\n"
				+ "            {\r\n"
				+ "                \"name\": \"sudhakar.r\",\r\n"
				+ "                \"fatherName\": \"Ravi\",\r\n"
				+ "                \"motherName\": \"prema\",\r\n"
				+ "                \"dob\": \"1997-06-28T18:30:00.000+00:00\",\r\n"
				+ "                \"email\": \"sudhakardir@gmail.com\",\r\n"
				+ "                \"mobile\": \"7010096261\",\r\n"
				+ "                \"deptId\": \"10001\",\r\n"
				+ "                \"courseId\": \"CS10001\",\r\n"
				+ "                \"qulication\": \"12th\",\r\n"
				+ "                \"batch\": \"2014 - 2017\",\r\n"
				+ "                \"studentId\": 832100145\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"name\": \"sujji.r\",\r\n"
				+ "                \"fatherName\": \"Ravi\",\r\n"
				+ "                \"motherName\": \"prema\",\r\n"
				+ "                \"dob\": \"2000-06-28T18:30:00.000+00:00\",\r\n"
				+ "                \"email\": \"sujjidir@gmail.com\",\r\n"
				+ "                \"mobile\": \"8608323839\",\r\n"
				+ "                \"deptId\": \"10001\",\r\n"
				+ "                \"courseId\": \"CS10001\",\r\n"
				+ "                \"qulication\": \"12th\",\r\n"
				+ "                \"batch\": \"2017 - 2020\",\r\n"
				+ "                \"studentId\": 731200145\r\n"
				+ "            }\r\n"
				+ "        ],\r\n"
				+ "        \"staffCount\": 0,\r\n"
				+ "        \"studentDetailCount\": 0\r\n"
				+ "    }\r\n"
				+ "}";
	}
}
