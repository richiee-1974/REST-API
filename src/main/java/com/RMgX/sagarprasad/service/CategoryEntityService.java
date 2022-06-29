package com.RMgX.sagarprasad.service;

import java.util.List;
import java.util.Locale.Category;

import com.RMgX.sagarprasad.Entity.CategoryEntity;

public interface CategoryEntityService {

	Category createCategory(Category category);

	List<Category> getAllCategory();

	Category updateCategory(Category product);

	void deleteCategory(long CategoryId);

	CategoryEntity getCategoryById(long CategoryId);

	
	
}
