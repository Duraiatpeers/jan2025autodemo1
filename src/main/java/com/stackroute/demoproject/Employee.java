package com.stackroute.demoproject;

// import statements

public class Employee {
	
	int current_year;
	
	// constructor overloading, more than one constructor. Constructors will be having different paratemeters
	// constructor - special method which carries the same name as class
	// No return type
	public Employee() {
		System.out.println("Initializing Employee");
	}
	
	public Employee(int year) {
		current_year = year;
	}
	
	
	public Employee(String name, String welcomemsg) {
		System.out.println(name+", "+welcomemsg);
	}
	
	// Method overloading, more than one method with same name but different paratemeters
	public void printcurrentyear() {
		System.out.println(current_year);
	}
	
	public int printcurrentyear(String name) {
		System.out.println(current_year);
		return 0;
	}
	
	
	public void printcurrentyear(int year) {
		System.out.println(current_year);
	}

	
	
}
