package com.example.springWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //it creates getter & setter
@AllArgsConstructor //it creates constructor
public class Product {
    //use LOMBOK library which create getter,setter,constructor for us
    private int productId;
    private String productName;
    private int price;
}
