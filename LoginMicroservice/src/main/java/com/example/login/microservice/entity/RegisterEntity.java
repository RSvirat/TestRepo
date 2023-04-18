package com.example.login.microservice.entity;

import java.util.Objects;

public class RegisterEntity {
	private String userId;
	private String assessment;
	private String date;
	private String type;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAssessment() {
		return assessment;
	}
	public void setAssessment(String assessment) {
		this.assessment = assessment;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public RegisterEntity(String userId, String assessment, String date, String type) {
		super();
		this.userId = userId;
		this.assessment = assessment;
		this.date = date;
		this.type = type;
	}
	@Override
	public String toString() {
		return "RegisterEntity [userId=" + userId + ", assessment=" + assessment + ", date=" + date + ", type=" + type
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(assessment, date, type, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegisterEntity other = (RegisterEntity) obj;
		return Objects.equals(assessment, other.assessment) && Objects.equals(date, other.date)
				&& Objects.equals(type, other.type) && Objects.equals(userId, other.userId);
	}
	
	
}
