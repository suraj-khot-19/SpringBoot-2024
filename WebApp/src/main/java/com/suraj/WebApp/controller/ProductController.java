package com.suraj.WebApp.controller;

import com.suraj.WebApp.model.Product;
import com.suraj.WebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    //instance of product service using autowired(filed injection)
    @Autowired
    ProductService service;


    //get all the products
    @RequestMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @RequestMapping("/products/{id}")
    public Product getProductById(@PathVariable int id){
        return service.getProductById(id);
    }
}
