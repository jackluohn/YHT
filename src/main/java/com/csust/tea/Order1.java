package com.csust.tea;

public class Order1 {

	String Pname;
	int prices;
	double ratio;
	int counts;
	public Order1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public int getPrices() {
		return prices;
	}
	public void setPrices(int prices) {
		this.prices = prices;
	}
	public double getRatio() {
		return ratio;
	}
	public void setRatio(double ratio) {
		this.ratio = ratio;
	}
	public int getCounts() {
		return counts;
	}
	public void setCounts(int counts) {
		this.counts = counts;
	}
	@Override
	public String toString() {
		return "Order1 [Pname=" + Pname + ", prices=" + prices + ", ratio=" + ratio + ", counts=" + counts + "]";
	}
	
	
	

	
}
