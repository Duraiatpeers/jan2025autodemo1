package com.stackroute.demoproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataReader4 {

	
	public static void readdata(File file) throws IOException {
		System.out.println("Inside readdata method");
		
		FileReader fr = new FileReader(file);
		FileWriter fos = new FileWriter(System.getProperty("user.dir")+"\\data\\newdata3.txt");
		
		BufferedReader reader = new BufferedReader(fr);
		BufferedWriter writer = new BufferedWriter(fos);

		String newline;
		
		while((newline = reader.readLine()) != null) {
			System.out.println(newline);
			writer.write(newline+"\n");
		}
		
		reader.close();
		writer.close();
		fos.close();
		fr.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		File datafile = new File(System.getProperty("user.dir")+"\\data\\data.txt");
		
		readdata(datafile);
		
	}
	
	
}
