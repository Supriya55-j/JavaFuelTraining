package com.example.onetomanydemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Items {
// declare all variables as private
	@Id
  private int item_id;
  private String item_desc;
  private int item_cost;
	
	@ManyToOne
	@JoinColumn(name="cart_id")
	private Cart cartobj;
	
	public Items()
	{
		
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getItem_desc() {
		return item_desc;
	}

	public void setItem_desc(String item_desc) {
		this.item_desc = item_desc;
	}

	public int getItem_cost() {
		return item_cost;
	}

	public void setItem_cost(int item_cost) {
		this.item_cost = item_cost;
	}

	public Cart getCartobj() {
		return cartobj;
	}

	public void setCartobj(Cart cartobj) {
		this.cartobj = cartobj;
	}

	public Items(int item_id, String item_desc, int item_cost, Cart cartobj) {
		super();
		this.item_id = item_id;
		this.item_desc = item_desc;
		this.item_cost = item_cost;
		this.cartobj = cartobj;
	}
	
}
