package com.front.viewer.service.constant;

public class CommonConstant {

//Error Messages 
	public final static int EMAIL_ERROR_CODE = 10001;
	public final static String EMAIL_ERROR_MESSAGE = "Please Enter Validate Email Id";
	public final static int PASSWORD_MISMATCH_ERROR_CODE = 10002;
	public final static String PASSWORD_MISMATCH_ERROR_MESSAGE = "Your Password is Mismatching";
	public final static int USERNAME_MISMATCH_ERROR_CODE = 10003;
	public final static String USERNAME_MISMATCH_ERROR_MESSAGE = "Your Username is Mismatching";
	public final static int USERNAME_EMPTY_CODE = 10004;
	public final static String USERNAME_EMPTY_MESSAGE = "Please Enter the Username";
	public final static int PASSWORD_EMPTY_CODE = 10005;
	public final static String PASSWORD_EMPTY_MESSAGE = "Please Enter the Password";
	public final static int PASSWORD_AND_USERNAME_INCORRECT_CODE = 10006;
	public final static String PASSWORD_AND_USERNAME_INCORRECT_MESSAGE = "Username or Password Incorrected";
	
// URL'S
	
	public final static String LOGIN_USERNAME_PASSWORD_VALIDATE_URL = "http://localhost:8820/adminValidate/login";
	public final static String ADMIN_DETAILS_URL = "http://localhost:8810/adminRead/getAdmin/";
}
