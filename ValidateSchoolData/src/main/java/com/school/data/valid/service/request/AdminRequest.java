package com.school.data.valid.service.request;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AdminRequest {
	private String adminId;
	private String email;
	private long mobile;
}
