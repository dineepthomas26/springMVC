package com.hackerrank.eshopping.product.dashboard.service;

import com.hackerrank.eshopping.product.dashboard.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {


    //  Using two hashmaps in order to provide performance of O(1) while fetching products
    private static HashMap<Long, Product> products = new HashMap<>();
    private static HashMap<String, Long> idNameHashMap = new HashMap<>();


    public List<Product> findAllProducts() {
        // Pagination should be added...
        return new ArrayList<>(products.values());
    }

    public Product findById(long id) {
            return products.get(id);
    }

    public Product findByCategory(String category) {

        if (idNameHashMap.get(category) != null){
            return products.get(idNameHashMap.get(category));
        }

        return null;
    }

    public void saveProduct(Product product) {
         {    
            products.put(product.getId(), product);
            idNameHashMap.put(product.getCategory(), product.getId());
        }
    }

    public void updateProduct(Product product) {
         {    
            products.put(product.getId(), product);
            idNameHashMap.put(product.getCategory(), product.getId());
        }
    }

    public boolean isProductExist(Product product) {
        return findById(product.getId()) != null;
    }


}
