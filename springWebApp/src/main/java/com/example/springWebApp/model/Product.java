package com.example.springWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data //it creates getter & setter
@AllArgsConstructor //it creates constructor
@NoArgsConstructor
@Component
public class Product {
    //use LOMBOK library which create getter,setter,constructor for us
    private int productId;
    private String productName;
    private int price;
}
