package com.stackroute.demoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearchPage2 {
  
	
  WebDriver driver;
  WebElement searchTextField;
  WebElement searchButton;
  
  
  public GoogleSearchPage2(WebDriver driver){
	  this.driver = driver;
  }
	
  public void enterSearchText(String searchText) {
	  driver.findElement(By.name("q")).sendKeys(searchText);
  }
 
  public void clickSearchBtn() {
	  driver.findElement(By.name("btnK")).click();
  }
  
  
}
