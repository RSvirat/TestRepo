package com.example.login.microservice.model;

import java.util.Objects;

public class LoginModel {
	private String login;
	private String password;
	
	public String getLogin() {
		return login;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(login, password);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginModel other = (LoginModel) obj;
		return Objects.equals(login, other.login) && Objects.equals(password, other.password);
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginModel(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}
	public LoginModel() {
		super();
	}

	@Override
	public String toString() {
		return "LoginModel [login=" + login + ", password=" + password + "]";
	}
	
	
}
