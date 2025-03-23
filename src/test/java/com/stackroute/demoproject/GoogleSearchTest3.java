package com.stackroute.demoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearchTest3 {
  
	WebDriver driver;
	
  @BeforeClass
  public void setUp() throws Exception {
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
  }
  
 
  
  @Test
  public void searchTest() throws InterruptedException {
	  
	  GoogleSearchPage gsp = new GoogleSearchPage(driver);
	  gsp.enterSearchText("Selenium");
	  Thread.sleep(3000);
	  gsp.clickSearchBtn();
	  
	  
  }
  
  @AfterClass
  public void tearDown() throws Exception {
	  driver.close();
  }
}
