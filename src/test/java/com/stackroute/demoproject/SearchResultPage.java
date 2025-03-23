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

public class SearchResultPage {
  
	
  WebDriver driver;
  @FindBy(css="span.VuuXrf") 
  WebElement seleniumLink;
  
  public SearchResultPage(WebDriver driver){
	  this.driver = driver;
	  PageFactory.initElements(driver,this);
  }
	
  public boolean isSeleniumOfficialPageLinkDisplayed(){
	String seleniumlinktext = seleniumLink.getText();
	if( seleniumlinktext.equalsIgnoreCase("Selenium")) {
		return true;
	}
	return false;
  }
  
}
