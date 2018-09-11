package com.csust.tea;



public class Order {

	String pname;
	String size;
	String sugar;
	String temp;
	String opt;
	int price;
	
	java.util.Date  date = new java.util.Date();
	
	java.sql.Date  data1=  new java.sql.Date(date.getTime());
	
	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	public String getPname() {
		return pname;
	}




	public void setPname(String pname) {
		this.pname = pname;
	}




	public String getSize() {
		return size;
	}




	public void setSize(String size) {
		this.size = size;
	}




	public String getSugar() {
		return sugar;
	}




	public void setSugar(String sugar) {
		this.sugar = sugar;
	}




	public String getTemp() {
		return temp;
	}




	public void setTemp(String temp) {
		this.temp = temp;
	}




	public String getOpt() {
		return opt;
	}




	public void setOpt(String opt) {
		this.opt = opt;
	}




	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		this.price = price;
	}
	
	




	public java.util.Date getDate() {
		return date;
	}




	public void setDate(java.util.Date date) {
		this.date = date;
	}




	public java.sql.Date getData1() {
		return data1;
	}




	public void setData1(java.sql.Date data1) {
		this.data1 = data1;
	}




	@Override
	public String toString() {
		return "Order [pname=" + pname + ", size=" + size + ", sugar=" + sugar + ", temp=" + temp + ", opt=" + opt
				+ ", price=" + price + ", data1=" + data1 + "]";
	}

	
}
