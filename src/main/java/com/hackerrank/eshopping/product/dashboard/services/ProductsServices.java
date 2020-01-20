package com.hackerrank.eshopping.product.dashboard.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriUtils;

import com.hackerrank.eshopping.product.dashboard.exceptions.CustomException;
import com.hackerrank.eshopping.product.dashboard.model.Product;
import com.hackerrank.eshopping.product.dashboard.repository.ProductsCaching;

@Service
public class ProductsServices {
	
	@Autowired
	ProductsCaching productCaching;
	
	public void saveProducts(Product product) throws CustomException {
		if(productCaching.existsById(product.getId()))
			throw new CustomException();
			productCaching.save(product);
	}
	
	public void updateProduct(Long productId,Product product)throws CustomException{
		Optional<Product> productOptinal = productCaching.findById(productId);
		Product productPresent = productOptinal.orElseThrow(CustomException::new);
		productPresent.mergeProduct(product);
		productCaching.save(productPresent);
	}
	
	public Product getProductsById(Long productId) throws CustomException {
		Optional<Product> productOptinal = productCaching.findById(productId);
		return productOptinal.orElseThrow(CustomException::new);
	}
	
	public List<Product> listProductsByCategory(String category) throws CustomException{
		Sort sorted = Sort.by("availability").descending().and(Sort.by("discountedPrice").ascending()).and(Sort.by("id").ascending());
		List<Product> productsList = productCaching.findByCategoryIgnoreCase(decodeStringUTF8(category), sorted);
		return productsList;
	}
	
	public List<Product> listProductsByCategoryAndAvailability(String category,Boolean availability) throws CustomException{
		Sort sorted = Sort.by("discountPercentage").descending().and(Sort.by("discountedPrice").ascending()).and(Sort.by("id").ascending());
		List<Product> productsList = productCaching.findByCategoryIgnoreCaseAndAvailability(decodeStringUTF8(category), availability,sorted);
		return productsList;
	}
	public List<Product> listAllProducts(){
		return StreamSupport.stream(
			productCaching.findAll(Sort.by("id").ascending())
				.spliterator(),false)
				.collect(Collectors.toList());
	}
	
	private String decodeStringUTF8(String valor) {
		return UriUtils.decode(valor, "UTF-8");
	}
}
