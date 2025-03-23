package com.stackroute.demoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearchPage3 {
  
	
  WebDriver driver;
  @FindBy(name = "q")
  WebElement searchTextField;
  @FindBy(name = "btnK")
  WebElement searchButton;
  
  
  public GoogleSearchPage3(WebDriver driver){
	  this.driver = driver;
	  PageFactory.initElements(driver,this);
  }
	
  public void enterSearchText(String searchText) {
	  searchTextField.sendKeys(searchText);
  }
 
  public void clickSearchBtn() {
	  searchButton.click();
  }
  
  
}
