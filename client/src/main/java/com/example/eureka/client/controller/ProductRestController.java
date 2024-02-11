package com.example.eureka.client.controller;

import com.example.eureka.client.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductRestController {

    @GetMapping()
    public Product getProduct(@RequestParam String productId) {
        return new Product(productId, "Notebook", 100.0,"Instance 1");
    }
}
