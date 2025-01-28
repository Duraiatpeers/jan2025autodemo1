package com.stackroute.demoproject;

import java.io.File;
import java.io.FileReader;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BasicAuto02Test {

  /*
   * Launch browser and navigate to login page
   * Enter username: Admin
   * Enter password: admin123
   * Click login button
   * Validate if the login is successful
   * Close the browser
   */
  WebDriver driver;	
  private static final String USERNAME = "Admin";
  private static final String PASSWORD = "admin123";
  
  /*
   * Locators - id,name,classname,linktext, partial linktext, xpath, css, tagname
   * relative locators
   */
  
  // fixtures
  @BeforeClass
  public void init() {
	  driver = new ChromeDriver();
  }
  
  @Test
  public void testLogin() throws InterruptedException {
	  
		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
//		WebElement loginfield = driver.findElement(By.name("username"));
//		loginfield.sendKeys(USERNAME);
		
		driver.findElement(By.name("username")).sendKeys(USERNAME);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);
//		driver.findElements(By.tagName("button")).get(0).click();
		
		
  }
  
  @AfterClass
  public void destroy() {
	  driver.close();
  }
  
}
