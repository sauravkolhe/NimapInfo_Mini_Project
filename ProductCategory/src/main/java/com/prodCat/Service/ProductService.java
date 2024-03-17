package com.prodCat.Service;

import java.util.List;
import java.util.Optional;

import com.prodCat.Entity.ProductEntity;

//These are service interface which
//defining methods for managing products.
public interface ProductService{
	
	//save Product
	
	ProductEntity saveProduct(ProductEntity product);
	
	//Get All Product

	List<ProductEntity> getAllProduct();
	
	//Update By Id
	
	ProductEntity updateProduct(ProductEntity product, Integer productId);
	
	//Delete Product By Id

	void delectProductById(Integer productId);
	
	//get by Id
	
	Optional<ProductEntity> findById(Integer productId);
	

	

}
