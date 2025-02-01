package com.stackroute.demoproject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAuto05Test {
	
	WebDriver driver;
	
	@BeforeMethod
	public 	void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		// Implicit wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test
	public void testSearch() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form/div[1]/div/div[2]/input")).sendKeys("Admin");

		
		driver.findElement(By.xpath("//form/div[2]//input")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

		
		
		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span/img")));
		
		WebElement welcomeimg = driver.findElement(By.xpath("//span/img"));
		
		assertTrue(welcomeimg.isDisplayed());
		
		welcomeimg.click();
		driver.findElement(By.cssSelector("li > ul > li:nth-child(4) > a")).click();
		
		String newurl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		assertEquals(newurl,driver.getCurrentUrl());
		
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		driver.close();
	}

}
