package com.stackroute.demoproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataReader2 {

	
	public static void readdata(File file) throws IOException {
		System.out.println("Inside readdata method");
		
		FileInputStream inputstream = new FileInputStream(file);
		
		FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"\\data\\newdata.txt");
		
		int dt;
		while((dt = inputstream.read()) != -1) {
			System.out.print((char)dt);
			fos.write(dt);
		}
		
		fos.close();
		inputstream.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		
		File datafile = new File(System.getProperty("user.dir")+"\\data\\data.txt");
		
		readdata(datafile);
		
	}
	
	
}
