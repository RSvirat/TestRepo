package com.school.data.read.service.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminReadException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private int errorCode;
	private String errorMessage;
	
	

}
