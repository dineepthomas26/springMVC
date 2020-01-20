package com.hackerrank.eshopping.product.dashboard.controller;


import com.hackerrank.test.utility.Order;
import com.hackerrank.test.utility.OrderedTestRunner;
import com.hackerrank.test.utility.ResultMatcher;
import static org.junit.Assert.assertTrue;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(OrderedTestRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ProductsControllerTest {
    @ClassRule
    public static final SpringClassRule springClassRule = new SpringClassRule();

    @Rule
    public final SpringMethodRule springMethodRule = new SpringMethodRule();
    
    @Autowired    
    private MockMvc mockMvc;

    /**
     *
     * @throws Exception
     *
     * It tests creating a product
     */
    @Test
    @Order(1)
    public void createProduct() throws Exception {
        /**
         *
         * Create product with id 1
         *
         * The request body is:
         * {
         *     "id": 1,
         *     "name": "Dressing Gown",
         *     "category": "Full Body Outfits",
         *     "retail_price": 303.0,
         *     "discounted_price": 251.49,
         *     "availability": true
         * }
         */
        String json = "{\"id\": 1, \"name\": \"Dressing Gown\", \"category\": \"Full Body Outfits\", \"retail_price\": 303.0, \"discounted_price\": 251.49, \"availability\": true}";

        mockMvc.perform(
                post("/products")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(json)
        )
                .andExpect(status().isCreated());

        /**
         *
         * Create product with id 2
         *
         * The request body is:
         * {
         *     "id": 2,
         *     "name": "Shoes",
         *     "category": "Footwear",
         *     "retail_price": 150.0,
         *     "discounted_price": 123.0,
         *     "availability": true
         * }
         */
        json = "{\"id\": 2, \"name\": \"Shoes\", \"category\": \"Footwear\", \"retail_price\": 150.0, \"discounted_price\": 123.0, \"availability\": true}";

        mockMvc.perform(
                post("/products")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(json)
        )
                .andExpect(status().isCreated());

        /**
         *
         * Create product with id 3
         *
         * The request body is:
         * {
         *     "id": 3,
         *     "name": "Nightgown",
         *     "category": "Full Body Outfits",
         *     "retail_price": 307.0,
         *     "discounted_price": 254.81,
         *     "availability": true
         * }
         */
        json = "{\"id\": 3, \"name\": \"Nightgown\", \"category\": \"Full Body Outfits\", \"retail_price\": 307.0, \"discounted_price\": 254.81, \"availability\": true}";

        mockMvc.perform(
                post("/products")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(json)
        )
                .andExpect(status().isCreated());

        /**
         *
         * Create product with id 4
         *
         * The request body is:
         * {
         *     "id": 4,
         *     "name": "Boots",
         *     "category": "Footwear",
         *     "retail_price": 162.0,
         *     "discounted_price": 132.84,
         *     "availability": true
         * }
         */
        json = "{\"id\": 4, \"name\": \"Boots\", \"category\": \"Footwear\", \"retail_price\": 162.0, \"discounted_price\": 132.84, \"availability\": true}";

        mockMvc.perform(
                post("/products")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(json)
        )
                .andExpect(status().isCreated());

        /**
         *
         * Create product with id 5
         *
         * The request body is:
         * {
         *     "id": 5,
         *     "name": "Ball Gown",
         *     "category": "Full Body Outfits",
         *     "retail_price": 337.0,
         *     "discounted_price": 272.97,
         *     "availability": true
         * }
         */
        json = "{\"id\": 5, \"name\": \"Ball Gown\", \"category\": \"Full Body Outfits\", \"retail_price\": 337.0, \"discounted_price\": 272.97, \"availability\": true}";

        mockMvc.perform(
                post("/products")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(json)
        )
                .andExpect(status().isCreated());

        /**
         *
         * Create product with id 6
         *
         * The request body is:
         * {
         *     "id": 6,
         *     "name": "Shawl",
         *     "category": "Accessories",
         *     "retail_price": 283.0,
         *     "discounted_price": 260.36,
         *     "availability": true
         * }
         */
        json = "{\"id\": 6, \"name\": \"Shawl\", \"category\": \"Accessories\", \"retail_price\": 283.0, \"discounted_price\": 260.36, \"availability\": true}";

        mockMvc.perform(
                post("/products")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(json)
        )
                .andExpect(status().isCreated());

        /**
         *
         * Create product with id 7
         *
         * The request body is:
         * {
         *     "id": 7,
         *     "name": "Belt",
         *     "category": "Accessories",
         *     "retail_price": 471.0,
         *     "discounted_price": 419.19,
         *     "availability": true
         * }
         */
        json = "{\"id\": 7, \"name\": \"Belt\", \"category\": \"Accessories\", \"retail_price\": 471.0, \"discounted_price\": 419.19, \"availability\": true}";

        mockMvc.perform(
                post("/products")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(json)
        )
                .andExpect(status().isCreated());

        /**
         *
         * Create product with id 8
         *
         * The request body is:
         * {
         *     "id": 8,
         *     "name": "Kaftan",
         *     "category": "Accessories",
         *     "retail_price": 237.0,
         *     "discounted_price": 215.67,
         *     "availability": true
         * }
         */
        json = "{\"id\": 8, \"name\": \"Kaftan\", \"category\": \"Accessories\", \"retail_price\": 237.0, \"discounted_price\": 215.67, \"availability\": true}";

        mockMvc.perform(
                post("/products")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(json)
        )
                .andExpect(status().isCreated());

        /**
         *
         * Create product with id 9
         *
         * The request body is:
         * {
         *     "id": 9,
         *     "name": "Overalls",
         *     "category": "Full Body Outfits",
         *     "retail_price": 374.0,
         *     "discounted_price": 321.64,
         *     "availability": true
         * }
         */
        json = "{\"id\": 9, \"name\": \"Overalls\", \"category\": \"Full Body Outfits\", \"retail_price\": 374.0, \"discounted_price\": 321.64, \"availability\": true}";

        mockMvc.perform(
                post("/products")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(json)
        )
                .andExpect(status().isCreated());

        /**
         *
         * Create product with id 10
         *
         * The request body is:
         * {
         *     "id": 10,
         *     "name": "Cufflinks",
         *     "category": "Accessories",
         *     "retail_price": 284.0,
         *     "discounted_price": 247.08,
         *     "availability": true
         * }
         */
        json = "{\"id\": 10, \"name\": \"Cufflinks\", \"category\": \"Accessories\", \"retail_price\": 284.0, \"discounted_price\": 247.08, \"availability\": true}";

        mockMvc.perform(
                post("/products")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(json)
        )
                .andExpect(status().isCreated());

        /**
         *
         * Create product with id 11
         *
         * The request body is:
         * {
         *     "id": 11,
         *     "name": "Cargos",
         *     "category": "Bottoms",
         *     "retail_price": 498.0,
         *     "discounted_price": 428.28,
         *     "availability": true
         * }
         */
        json = "{\"id\": 11, \"name\": \"Cargos\", \"category\": \"Bottoms\", \"retail_price\": 498.0, \"discounted_price\": 428.28, \"availability\": true}";

        mockMvc.perform(
                post("/products")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(json)
        )
                .andExpect(status().isCreated());

        /**
         *
         * Create product with id 12
         *
         * The request body is:
         * {
         *     "id": 12,
         *     "name": "Poncho",
         *     "category": "Accessories",
         *     "retail_price": 280.0,
         *     "discounted_price": 224.7,
         *     "availability": true
         * }
         */
        json = "{\"id\": 12, \"name\": \"Poncho\", \"category\": \"Accessories\", \"retail_price\": 280.0, \"discounted_price\": 224.7, \"availability\": true}";

        mockMvc.perform(
                post("/products")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(json)
        )
                .andExpect(status().isCreated());

        /**
         *
         * Create product with id 13
         *
         * The request body is:
         * {
         *     "id": 13,
         *     "name": "Cummerbund",
         *     "category": "Accessories",
         *     "retail_price": 435.0,
         *     "discounted_price": 400.2,
         *     "availability": true
         * }
         */
        json = "{\"id\": 13, \"name\": \"Cummerbund\", \"category\": \"Accessories\", \"retail_price\": 435.0, \"discounted_price\": 400.2, \"availability\": true}";

        mockMvc.perform(
                post("/products")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(json)
        )
                .andExpect(status().isCreated());

        /**
         *
         * Create product with id 14
         *
         * The request body is:
         * {
         *     "id": 14,
         *     "name": "Dress",
         *     "category": "Full Body Outfits",
         *     "retail_price": 175.0,
         *     "discounted_price": 140.0,
         *     "availability": true
         * }
         */
        json = "{\"id\": 14, \"name\": \"Dress\", \"category\": \"Full Body Outfits\", \"retail_price\": 175.0, \"discounted_price\": 140.0, \"availability\": true}";

        mockMvc.perform(
                post("/products")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(json)
        )
                .andExpect(status().isCreated());

        /**
         *
         * Create product with id 15
         *
         * The request body is:
         * {
         *     "id": 15,
         *     "name": "Trainers",
         *     "category": "Footwear",
         *     "retail_price": 228.0,
         *     "discounted_price": 184.68,
         *     "availability": true
         * }
         */
        json = "{\"id\": 15, \"name\": \"Trainers\", \"category\": \"Footwear\", \"retail_price\": 228.0, \"discounted_price\": 184.68, \"availability\": true}";

        mockMvc.perform(
                post("/products")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(json)
        )
                .andExpect(status().isCreated());

        /**
         *
         * Create product with id 16
         *
         * The request body is:
         * {
         *     "id": 16,
         *     "name": "Tracksuit",
         *     "category": "Full Body Outfits",
         *     "retail_price": 471.0,
         *     "discounted_price": 423.9,
         *     "availability": false
         * }
         */
        json = "{\"id\": 16, \"name\": \"Tracksuit\", \"category\": \"Full Body Outfits\", \"retail_price\": 471.0, \"discounted_price\": 423.9, \"availability\": false}";

        mockMvc.perform(
                post("/products")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(json)
        )
                .andExpect(status().isCreated());

        /**
         *
         * Create product with id 17
         *
         * The request body is:
         * {
         *     "id": 17,
         *     "name": "Tailcoat",
         *     "category": "Full Body Outfits",
         *     "retail_price": 307.0,
         *     "discounted_price": 254.81,
         *     "availability": true
         * }
         */
        json = "{\"id\": 17, \"name\": \"Tailcoat\", \"category\": \"Full Body Outfits\", \"retail_price\": 307.0, \"discounted_price\": 254.81, \"availability\": true}";

        mockMvc.perform(
                post("/products")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(json)
        )
                .andExpect(status().isCreated());

        /**
         *
         * Create product with id 18
         *
         * The request body is:
         * {
         *     "id": 18,
         *     "name": "Vest",
         *     "category": "Tops",
         *     "retail_price": 446.0,
         *     "discounted_price": 392.48,
         *     "availability": true
         * }
         */
        json = "{\"id\": 18, \"name\": \"Vest\", \"category\": \"Tops\", \"retail_price\": 446.0, \"discounted_price\": 392.48, \"availability\": true}";

        mockMvc.perform(
                post("/products")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(json)
        )
                .andExpect(status().isCreated());

        /**
         *
         * Create product with id 19
         *
         * The request body is:
         * {
         *     "id": 19,
         *     "name": "Suit",
         *     "category": "Full Body Outfits",
         *     "retail_price": 158.0,
         *     "discounted_price": 135.88,
         *     "availability": true
         * }
         */
        json = "{\"id\": 19, \"name\": \"Suit\", \"category\": \"Full Body Outfits\", \"retail_price\": 158.0, \"discounted_price\": 135.88, \"availability\": true}";

        mockMvc.perform(
                post("/products")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(json)
        )
                .andExpect(status().isCreated());

        /**
         *
         * Create product with id 20
         *
         * The request body is:
         * {
         *     "id": 20,
         *     "name": "Catsuit",
         *     "category": "Full Body Outfits",
         *     "retail_price": 158.0,
         *     "discounted_price": 135.88,
         *     "availability": true
         * }
         */
        json = "{\"id\": 20, \"name\": \"Catsuit\", \"category\": \"Full Body Outfits\", \"retail_price\": 158.0, \"discounted_price\": 135.88, \"availability\": true}";

        mockMvc.perform(
                post("/products")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(json)
        )
                .andExpect(status().isCreated());

        /**
         *
         * Create product with id 21
         *
         * The request body is:
         * {
         *     "id": 21,
         *     "name": "Dungarees",
         *     "category": "Full Body Outfits",
         *     "retail_price": 437.0,
         *     "discounted_price": 362.71,
         *     "availability": false
         * }
         */
        json = "{\"id\": 21, \"name\": \"Dungarees\", \"category\": \"Full Body Outfits\", \"retail_price\": 437.0, \"discounted_price\": 362.71, \"availability\": false}";

        mockMvc.perform(
                post("/products")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(json)
        )
                .andExpect(status().isCreated());
    }

}
