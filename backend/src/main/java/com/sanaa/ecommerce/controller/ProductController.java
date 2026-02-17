package com.sanaa.ecommerce.controller;


import com.sanaa.ecommerce.model.Product;
import com.sanaa.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/")
    public String greet(){
        return "Hello..";
    }

    @GetMapping("/products")
    public List<Product> getProduct(){
        return service.getProducts();
    }


}
