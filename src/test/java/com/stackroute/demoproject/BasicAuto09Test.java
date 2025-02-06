package com.stackroute.demoproject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAuto09Test {
	
	WebDriver driver;
	
	@BeforeClass
	public 	void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	@Test
	public void testSwitchtoWindow() throws Exception{
	
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("OrangeHRM")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		Thread.sleep(3000);

		String childwindowid = "";
		
		for(String windowid:driver.getWindowHandles()) {
			childwindowid = windowid;
		}
		
		driver.switchTo().window(childwindowid);
		Thread.sleep(3000);
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);

	}


	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
	}

}
