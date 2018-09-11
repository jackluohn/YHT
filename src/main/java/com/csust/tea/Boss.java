package com.csust.tea;

public class Boss {
	
//	String id;
	String name;
	String password;
	
	public Boss() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Boss [ "+ "name=" + name + ", password=" + password + "]";
	}
	
	
	
	
	
	

}
