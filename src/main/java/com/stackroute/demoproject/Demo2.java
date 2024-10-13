package com.stackroute.demoproject;

public class Demo2 {
	
	public static void main(String[] args) {
		
		int number1 = 20;
		int number2 = 100;
		
//		boolean isNumber1Bigger = number1 > number2;
		
//		System.out.println(isNumber1Bigger);
		
		if(number1 > number2) {
			System.out.println("Number1 is greater than number2");
		}else {
			System.out.println("Number2 is greater than number1");
		}
		
		number1 = number1 + 100;
		number1++;
		System.out.println(number1);
		System.out.println(++number1);
		System.out.println(number1++);
		
		int age= 19;
		boolean isIndianNational = false;
		
		if((age >= 18) && (isIndianNational)) {
			System.out.println("Eligibile to vote");
		}else {
			System.out.println("Not Eligibile to vote");
		}
		
		
		int no=1;
		switch(1) {
		case 1:
			System.out.println("First");
			break;
		case 2:
			break;
		default:
			System.out.println("Default");
		}
		
		
		int day = 4;
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		}

	}
	
}
