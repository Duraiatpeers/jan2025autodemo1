package com.stackroute.demoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearchPage {
  
	
  WebDriver driver;

//  @FindBy - only one condition
//  @FindBys - and condition
//  @FindAll - or condition

 /*
  *  @FindAll(
  *  	{
  *  		@FindBy(how = How.ID, using = "foo"),
  *  		@FindBy(className = "bar")
  *     }
  *  )
  *  
  */
  
  WebElement q;
  WebElement btnK;
  
  
  public GoogleSearchPage(WebDriver driver){
	  this.driver = driver;
	  PageFactory.initElements(driver,this);
  }
	
  public void enterSearchText(String searchText) {
	  q.sendKeys(searchText);
  }
 
  public SearchResultPage clickSearchBtn() {
	  btnK.click();
	  return new SearchResultPage(driver);
  }
  
  
}
