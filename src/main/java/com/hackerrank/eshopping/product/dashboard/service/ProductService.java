package com.hackerrank.eshopping.product.dashboard.service;

import java.util.List;

import com.hackerrank.eshopping.product.dashboard.model.Product;

public interface ProductService {
	
	Product findById(long id);
	
	Product findByCategory(String category);
	
	void saveProduct(Product product);
	
	void updateProduct(Product product);

	List<Product> findAllProducts();
	
	boolean isProductExist(Product product);
	
}
