package com.suraj.WebApp.service;

import com.suraj.WebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = Arrays.asList(
            new Product(101, 50000, "Laptop"),
            new Product(102, 75000, "I-phone"),
            new Product(103, 40000, "Drone")
    );

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int id) {
        return products.stream().filter(p -> p.getProductId() == id).findFirst().get();
    }
}
