package com.school.data.valid.service.exception;

public class ServerException extends RuntimeException {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 147719274261644049L;
	private int errorCode;
	private String errorMessage;
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public ServerException(int errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	public ServerException() {
		super();
	}
	
	
	
}
