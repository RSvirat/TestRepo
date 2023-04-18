package com.school.data.read.service.handling;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.school.data.read.service.constant.CommonConstant;
import com.school.data.read.service.exception.AdminReadException;
import com.school.data.read.service.response.ErrorResponse;

@ControllerAdvice
public class AdminReadExceptionHandling {

	@ExceptionHandler(Exception.class)
	public ErrorResponse expectionHandle(Exception exception) {
		return new ErrorResponse(CommonConstant.SERVER_ERROR_CODE,CommonConstant.SERVER_ERROR_MESSAGE);
	}
	
	@ExceptionHandler(AdminReadException.class)
	public ErrorResponse adminReadExceptionHandle(AdminReadException adminReadException) {
		return new ErrorResponse(adminReadException.getErrorCode(), adminReadException.getErrorMessage());
	}
}
