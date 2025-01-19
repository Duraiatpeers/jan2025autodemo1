package com.stackroute.demoproject;


public class Democls2 {
	
	public int getWordcount(String sentence) {
		int len = 0;
		len = sentence.split(" ").length;
		return len;
	}
	
	public boolean isEmpty(String sentence) {
		
		return sentence.isBlank();
	}
	
}
