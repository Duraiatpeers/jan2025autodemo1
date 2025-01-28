package com.stackroute.demoproject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAuto04Test {
	
	WebDriver driver;
	
	@BeforeMethod
	public 	void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void testSearch() throws InterruptedException {
		
//		driver.findElement(By.linkText("Images")).click();
		driver.findElement(By.partialLinkText("How Search")).click();		

		Thread.sleep(3000);
		
//		assertTrue(driver.getCurrentUrl().equals("https://www.google.com/imghp?hl=en&ogbl"));		
		assertTrue(driver.getCurrentUrl().equals("https://www.google.com/search/howsearchworks/?fg=1"));
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		driver.close();
	}

}
