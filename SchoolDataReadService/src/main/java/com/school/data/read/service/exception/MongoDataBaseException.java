package com.school.data.read.service.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MongoDataBaseException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	
	private int errorCode;
	private String errorMessage;

}
