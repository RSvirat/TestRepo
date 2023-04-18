package com.front.viewer.service.response;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "category")
public class CategoryResponse {
	@Id
	private String category;

	@Override
	public String toString() {
		return "CategoryResponse [category=" + category + "]";
	}
	
	
}
