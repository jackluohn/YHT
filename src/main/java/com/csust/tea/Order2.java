package com.csust.tea;

import java.sql.Date;

public class Order2 {
	
	String pname;
	String size;
	String sugar;
	String temp;
	String opt;
	int price;
	
	Date Ptime;

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

	public Date getDate() {
		return Ptime;
	}

	public void setDate(Date date) {
		this.Ptime = date;
	}

	@Override
	public String toString() {
		return "Order2 [pname=" + pname + ", size=" + size + ", sugar=" + sugar + ", temp=" + temp + ", opt=" + opt
				+ ", price=" + price + ", date=" + Ptime + "]";
	}
	
	
	

}
