package com.stackroute.demoproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class DataReader {

	
	public static void readdata(File file) throws IOException {

		Properties prop = new Properties();
		prop.load(new FileReader(file));
		System.out.println(prop.getProperty("username"));
	}
	
	public static void main(String[] args) {
		
		File datafile = new File(System.getProperty("user.dir")+"\\data\\data100.properties");
		try {
			readdata(datafile);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
