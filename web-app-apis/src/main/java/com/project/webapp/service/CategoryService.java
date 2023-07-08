package com.project.webapp.service;

import java.util.List;
import com.project.webapp.payload.CategoryDto;

public interface CategoryService {
	// Create
	CategoryDto createCategory(CategoryDto categoryDto);
	// Update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	// Delete
	void deleteCategory(Integer categoryId);
	// Fetch
	CategoryDto getCategory(Integer categoryId);
	// Fetch All
	List<CategoryDto> getCategories();
	
}
