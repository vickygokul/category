package com.example.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CategoryController {

	@Autowired
	private CategoryService service;
	
	@PostMapping("/api/category/{category}")
	public Category getCategory(@PathVariable("category") String categoryName) {
		
		Category category2=service.getByName(categoryName);
		return category2;
	}
}
