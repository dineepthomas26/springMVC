package com.hackerrank.eshopping.product.dashboard.productcaching;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.hackerrank.eshopping.product.dashboard.model.Product;


@Repository
public interface ProductsCaching extends PagingAndSortingRepository<Product, Long>{

	List<Product> findByCategoryIgnoreCase(String category,Sort sort);
	List<Product> findByCategoryIgnoreCaseAndAvailability(String category,Boolean availability,Sort sort);
}
