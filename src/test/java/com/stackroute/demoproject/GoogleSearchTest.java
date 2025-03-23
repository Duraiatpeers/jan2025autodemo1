package com.stackroute.demoproject;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearchTest {
  
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
	  SearchResultPage srp = gsp.clickSearchBtn();
	  Thread.sleep(3000);
	  assertTrue(srp.isSeleniumOfficialPageLinkDisplayed());
	  
	  
  }
  
  @AfterClass
  public void tearDown() throws Exception {
	  driver.close();
  }
}
