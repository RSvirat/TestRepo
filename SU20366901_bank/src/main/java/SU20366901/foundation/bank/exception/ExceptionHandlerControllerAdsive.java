package SU20366901.foundation.bank.exception;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerControllerAdsive {

	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ResponseBody
	public ExceptionResponse handleResourceNotFoundException(ResourceNotFoundException resourceNotFoundException,
			HttpServletRequest request) {
		return new ExceptionResponse(resourceNotFoundException.getMessage(), request.getRequestURL().toString()); 
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ResponseBody
	public ExceptionResponse handleException(Exception exception, HttpServletRequest request) {
		return new ExceptionResponse(exception.getMessage(), request.getRequestURL().toString());
	}
	
	@ExceptionHandler(InsuffientBalanceException.class)
	@ResponseStatus(HttpStatus.CHECKPOINT)
	@ResponseBody
	public ExceptionResponse handleInsuffientBalanceException(InsuffientBalanceException exception, HttpServletRequest request) {
		return new ExceptionResponse(exception.getMessage(), request.getRequestURL().toString());
	}
	
	@ExceptionHandler(JwtTokenException.class)
	@ResponseStatus(HttpStatus.CHECKPOINT)
	@ResponseBody
	public ExceptionResponse handleJwtTokenException(JwtTokenException exception, HttpServletRequest request) {
		return new ExceptionResponse(exception.getMessage(), request.getRequestURI().toString());
	}
	
	@ExceptionHandler(IOException.class)
	@ResponseStatus(HttpStatus.CHECKPOINT)
	@ResponseBody
	public ExceptionResponse handleIOException(IOException exception, HttpServletRequest request) {
		return new ExceptionResponse(exception.getMessage(), request.getRequestURI().toString());
	}
}