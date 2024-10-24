package com.suraj.WebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity //create table for me JPA and Hibernate
public class Product {
    @Id //primary key
    private int productId;
    private int productPrice;
    private String productName;

    //!Parameter 0 of constructor in com.suraj.WebApp.model.Product required a bean of type 'int' that could not be found.
    public Product(){

    }


    //constructor to accepts products
    public Product(int productId, int productPrice, String productName) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productName = productName;
    }

    //getters and setters for all
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    //products to string method

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productPrice=" + productPrice +
                ", productName='" + productName + '\'' +
                '}';
    }
}
