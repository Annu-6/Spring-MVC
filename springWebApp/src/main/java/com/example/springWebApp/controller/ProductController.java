package com.example.springWebApp.controller;

import com.example.springWebApp.model.Product;
import com.example.springWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService productService;

//    @RequestMapping(value = "/products", method = RequestMethod.GET)
    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/products/{productId}")
    //whatever 'productId' client sends to server is in method parameter, based on id fetch that 'product' & service is responsible to write code for server to return product for particular requested id
    public Product getProductById(@PathVariable int productId) {
        return productService.getProductById(productId);
    }

    //@RequestBody: since u sending body from client to server otherwise it'll not take data from client & u'll get error json with default values instead of what client passed
    @PostMapping("/products")
    //JACKSON library: is responsible to convert ur object into json  otherwise from json to object
    public void addProduct(@RequestBody Product product) {
        System.out.println(product);
        productService.addProduct(product);
    }
}
