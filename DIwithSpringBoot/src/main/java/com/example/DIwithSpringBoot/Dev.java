package com.example.DIwithSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    @Qualifier("laptop")
    private Computer computer;

//    Laptop laptop; //NullPointerException: Cannot invoke "com.example.DIwithSpringBoot.Laptop.compile()" because "this.laptop" is null
//    @Autowired //field injection
//    private Laptop laptop;
    /*public Dev(Laptop laptop) { //constructor injection
        this.laptop = laptop;
    }*/
    /*@Autowired
    public void setLaptop(Laptop laptop) { //setter injection
        this.laptop = laptop;
    }*/
    public void build() {
        computer.compile();
        System.out.println("working on Awesome Project");

    }

}
