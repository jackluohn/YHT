package com.csust.tea;

public class Product {

	
	String name;
	String price1;
	String price2;
	String price3;
	
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice1() {
		return price1;
	}
	public void setPrice1(String price1) {
		this.price1 = price1;
	}
	public String getPrice2() {
		return price2;
	}
	public void setPrice2(String price2) {
		this.price2 = price2;
	}
	public String getPrice3() {
		return price3;
	}
	public void setPrice3(String price3) {
		this.price3 = price3;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price1=" + price1 + ", price2=" + price2 + ", price3=" + price3 + "]";
	}

	
	

}
