package com.sanaa.ecommerce.controller;


import com.sanaa.ecommerce.model.Product;
import com.sanaa.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id){

        Product product=service.getProductById(id);
        if(product!=null)
            return new ResponseEntity<>(product,HttpStatus.OK);


        return new ResponseEntity<>(HttpStatus.NOT_FOUND) ;
    }



}
