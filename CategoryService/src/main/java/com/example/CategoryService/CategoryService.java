package com.example.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepo repo;
	
	public Category getByName(String categoryName) {
		Category m= repo.findByCategoryName(categoryName);
		return m;
	}
}
