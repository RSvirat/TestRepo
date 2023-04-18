package com.school.data.valid.service.handling;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


import com.school.data.valid.service.exception.AdminValidateException;
import com.school.data.valid.service.exception.ErrorResponse;


@ControllerAdvice
public class ExceptionHandling {
	
	@ExceptionHandler(AdminValidateException.class)
	public ResponseEntity<ErrorResponse> handlAdminValidateException(AdminValidateException adminValidateException, HttpServletRequest request) {
		ErrorResponse errorResponse = new ErrorResponse(adminValidateException.getErrorCode(), adminValidateException.getErrorMessage());
		return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.EXPECTATION_FAILED);
	}
}