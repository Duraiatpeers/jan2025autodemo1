package com.stackroute.demoproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataReader3 {

	
	public static void readdata(File file) throws IOException {
		System.out.println("Inside readdata method");
		
		FileReader inputstream = new FileReader(file);
		
		FileWriter fos = new FileWriter(System.getProperty("user.dir")+"\\data\\newdata2.txt");
		
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
