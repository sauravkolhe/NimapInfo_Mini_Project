package com.prodCat.Service;

import java.util.List;
import java.util.Optional;

import com.prodCat.Entity.CategoryEntity;

//These are service interface which
//defining methods for managing categories.
public interface CategoryService {
	
	    //save category
	
		CategoryEntity saveCategory(CategoryEntity category);
		
		//Get All category

		List<CategoryEntity> getAllCategory();
		
		//Update By Id
		
		CategoryEntity updateCategory(CategoryEntity category, Integer categoryId);
		
		//Delete category By Id

		void delectCategoryById(Integer categoryId);
		
		//get by Id
		
		Optional<CategoryEntity> findById(Integer categoryId);
		

		


}
