package com.stackroute.demoproject;

import java.io.File;
import java.io.FileReader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BasicAuto01Test {
	
  /*
   * Launch the browser
   * Navigate to ebay.com
   * Close the browser
   */
	
  @Test
  public void testBay() throws InterruptedException {
	  
	// ChromeDriver is a class and WebDriver is an interface
	// Creating ChromeDriver Object will launch the browser
	 
	WebDriver driver = new ChromeDriver();
//	driver.get("https://ebay.com");
	driver.navigate().to("https://ebay.com");	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	

//	driver.close();
	driver.quit();
	
  }
  
  
}
