package com.stackroute.demoproject;


public class Demo {
	
	
	public static int countofwords(String line) {
		
		return line.split(" ")[0].trim().length();	
	}
	
	public static void main(String[] args) {
		
		int count= countofwords("Welcome to Java");
		System.out.println(count);
		
	}

}
