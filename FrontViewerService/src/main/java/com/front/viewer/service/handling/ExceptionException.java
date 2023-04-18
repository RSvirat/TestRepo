package com.front.viewer.service.handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.reactive.function.client.WebClientRequestException;

import com.front.viewer.service.exception.LoginException;
import com.front.viewer.service.response.ErrorResponse;

@ControllerAdvice
public class ExceptionException {


	@ExceptionHandler(value = LoginException.class)
	public ResponseEntity<?> getLoginException(LoginException loginException) {
		return new ResponseEntity<ErrorResponse>(
				new ErrorResponse(loginException.getErrorCode(),loginException.getErrorMsg()), HttpStatus.OK);
	}
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorResponse> getException(Exception exception) {
		return new ResponseEntity<ErrorResponse>(
				new ErrorResponse(HttpStatus.CONFLICT.value(), exception.getMessage()), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = WebClientRequestException.class)
	public ResponseEntity<ErrorResponse> getWebException(WebClientRequestException webClientRequestException) {
		return new ResponseEntity<ErrorResponse>(new ErrorResponse(HttpStatus.CONFLICT.value(), webClientRequestException.getMessage()), HttpStatus.BAD_REQUEST);
	}
}
