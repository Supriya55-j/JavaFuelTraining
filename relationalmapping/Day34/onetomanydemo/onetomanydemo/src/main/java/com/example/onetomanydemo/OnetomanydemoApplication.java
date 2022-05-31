package com.example.onetomanydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OnetomanydemoApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		context=SpringApplication.run(OnetomanydemoApplication.class, args);
		CartRepository cart;
		cart=context.getBean(CartRepository.class);
		
	   ItemsRepository items;
	   items= context.getBean(ItemsRepository.class);
	    
	   Cart c1=new Cart(1,"abc");	
	   cart.save(c1);
	   Items i1= new Items(100,"mause",500,c1);
	
	   Items i2= new Items(101,"keyboard",1500,c1);
	
	items.save(i1);
	items.save(i2);
	
	}

}
