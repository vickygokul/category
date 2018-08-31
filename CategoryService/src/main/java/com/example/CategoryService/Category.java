package com.example.CategoryService;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="category")
public class Category {

	private String categoryName;
	private int price;
	
	public Category() {
		
	}
	public Category(String categoryName, int price) {
		
		this.categoryName = categoryName;
		this.price = price;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
