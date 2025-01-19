package com.stackroute.demoproject;

public class Customer{ 
	
	private int customerid;	
	
	// Data Encapsulation - Hiding the data from getting accessed directly
	// We have to use setter and getter methods
	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	
	public void changecustomerid(int customerid) {
		this.customerid = customerid;
	}
	
}
