package com.example.springWebApp.service;

import com.example.springWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"Iphone",50000),
            new Product(102, "Canon Camera",70000),
            new Product(103,"Shure Mic",10000)));

    //create method which will return List of Products
    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int productId) {
        return products.stream()
                .filter(product -> product.getProductId() == productId)
                .findFirst().orElse(new Product(100,"No Item",0));
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
