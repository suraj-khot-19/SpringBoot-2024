package com.suraj.WebApp.controller;

import com.suraj.WebApp.model.Product;
import com.suraj.WebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    //instance of product service using autowired(filed injection)
    @Autowired
    ProductService service;


    //get all the products
    //@RequestMapping("/products")
    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    //get product by id
    //@RequestMapping("/products/{id}")
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id){
        return service.getProductById(id);
    }

    //add product to list
    @PostMapping("/products")
    public void addProduct(@RequestBody Product newProduct){
        System.out.println(newProduct);
        service.addProduct(newProduct);
    }

    //update a existing product
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product newProduct){
        service.updateProduct(newProduct);
    }
}
