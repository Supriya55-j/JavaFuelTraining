package com.example.demosessionUrlAssig;

import java.util.Objects;

public class Shopping
{
	private String item;
	private int price;
	@Override
	public int hashCode() {
		return Objects.hash(item, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shopping other = (Shopping) obj;
		return Objects.equals(item, other.item) && price == other.price;
	}
	

	
}
