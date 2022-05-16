package com.example.onetomanydemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.*;
//import org.hibernate.mapping.Set;

@Entity

public class Cart {
	// declare all variables as private
	@Id
	private int cart_id;
	private String uname;
	
	@OneToMany (mappedBy="cartobj")
     private Set<Items>items;
	
	public Cart()
	{
		
	}

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Set<Items> getItems() {
		return items;
	}

	public void setItems(Set<Items> items) {
		this.items = items;
	}

	public Cart(int cart_id, String uname) {
		super();
		this.cart_id = cart_id;
		this.uname = uname;
	}
	
	
	
}
