package com.hackerrank.eshopping.product.dashboard.controller;

import com.hackerrank.eshopping.product.dashboard.model.Product;
import com.hackerrank.eshopping.product.dashboard.service.ProductService;
import com.hackerrank.eshopping.product.dashboard.util.CustomErrors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductsController {
    
    public static final Logger logger = LoggerFactory.getLogger(ProductsController.class);

    @Autowired
    ProductService productService; //Service which will do all data retrieval/manipulation work

    
    // -------------------Create a Product-------------------------------------------

    @RequestMapping(value = "", method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> createProduct(@RequestBody Product product) {
        logger.info("Creating Product : {}", product);

        if (productService.isProductExist(product)) {
            logger.error("Unable to create. A Product with name {} already exist", product.getId());
            return new ResponseEntity<>(new CustomErrors("Unable to create. A Product with id " +
                    product.getId() + " already exist."), HttpStatus.BAD_REQUEST);
        }
        productService.saveProduct(product);

        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }

    // -------------------Retrieve All Products--------------------------------------------

    @RequestMapping(value = "", method = RequestMethod.GET,produces = "application/json")
    public ResponseEntity<List<Product>> listAllProducts() {
        List<Product> products = productService.findAllProducts();
        if (products.isEmpty()) {
            return new ResponseEntity<>(products, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    // -------------------Retrieve Product by ID------------------------------------------

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getProduct(@PathVariable("id") long id) {
        logger.info("Fetching Product with id {}", id);
        Product product = productService.findById(id);
        if (product == null) {
            logger.error("Product with id {} not found.", id);
            return new ResponseEntity<>(new CustomErrors("Product with id " + id  + " not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    // -------------------Retrieve Product by Category------------------------------------------

    @RequestMapping(value = "/?category={category}", method = RequestMethod.GET)
    public ResponseEntity<?> getProduct(@PathVariable("category") String category) {
        logger.info("Fetching Product with category {}", category);
        Product product = productService.findByCategory(category);
        if (product == null) {
            logger.error("Product with category {} not found.", category);
            return new ResponseEntity<>(new CustomErrors("Product with category " + category  + " not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    

}
