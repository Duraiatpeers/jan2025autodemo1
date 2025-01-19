package com.stackroute.demoproject;

public class ExceptionDemos {
	
	public void demo1() throws Exception {
		
		System.out.println("Beginning of execution");
		int num1 = 100;
		int num2 = 0;
		int result = 0;
	    result = num1 / num2;
		
		System.out.println(result);
		System.out.println("End of execution");
		
	}
	
	public void demo2(){
		try {
			demo1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
