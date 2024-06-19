package com.example.DIwithSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DIwithSpringBootApplication {

	public static void main(String[] args) {

		ApplicationContext context =
		SpringApplication.run(DIwithSpringBootApplication.class, args);
		// error -> NoSuchBeanDefinitionException: No qualifying bean of type 'com.example.DIwithSpringBoot1.Dev' available
		// means we don't have this object (or bean) in container already existing
		// & you need to create new object (or bean)? Ans. annotate corresponding class
		// whose object u need to create with @Component
		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
