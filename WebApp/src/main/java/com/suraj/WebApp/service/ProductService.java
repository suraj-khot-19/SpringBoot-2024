package com.suraj.WebApp.service;

import com.suraj.WebApp.model.Product;
import com.suraj.WebApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
/*
     List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, 50000, "Laptop"),
            new Product(102, 75000, "I-phone"),
            new Product(103, 40000, "Drone")
    ));

    // get all product
    public List<Product> getProducts() {
        return products;
    }

    //get product by its id
    public Product getProductById(int id) {
        //return products.stream().filter(p -> p.getProductId() == id).findFirst().get();
        //instead of using get we can sed dummy product if we not found by its id
        return products.stream().filter(p -> p.getProductId() == id).findFirst().orElse(new Product(100,0,"No Item Found!"));
    }

    //add product to a list
    public void addProduct(Product newProduct){
        products.add(newProduct);
    }

    //method which return the index of product in a products
    public int returnProductIndex(int productId){
        int index=0;
        for(int i=0;i<products.size();i++){
            if (products.get(i).getProductId()==productId)
                index= i;
            else
                index=0;
        }
        return index;
    }


    //update a existing product
    public void updateProduct(Product newProduct) {
        //get an index
        int index=returnProductIndex(newProduct.getProductId());
        products.set(index,newProduct);
    }

    //delete a product
    public void deleteProduct(int id) {
        //get index
        int index=returnProductIndex(id);
        products.remove(index);
    }
 */


//using spring jpa and hibernate

    //create field injection autowiring to repo
    @Autowired
    ProductRepository repository;


    // get all product
    public List<Product> getProducts() {
        return repository.findAll();
    }

    //get product by its id
    public Product getProductById(int id) {
            return repository.findById(id).orElse(new Product());
    }

    //add product to a list
    public void addProduct(Product newProduct){
       repository.save(newProduct);
    }

    //update a existing product
    public void updateProduct(Product newProduct) {
      repository.save(newProduct);
    }

    //delete a product
    public void deleteProduct(int id) {
       repository.deleteById(id);
    }

}