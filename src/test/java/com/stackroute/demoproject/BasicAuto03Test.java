package com.stackroute.demoproject;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAuto03Test {
	
	WebDriver driver;
	
	@BeforeMethod
	public 	void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://ebay.com");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void testSearch() throws InterruptedException {
		
		driver.findElement(By.id("gh-ac")).sendKeys("Samsung");
		Thread.sleep(2000);
		
//		List<WebElement> catylist = driver.findElements(By.xpath("//select/option"));
//		
//		for(WebElement category:catylist) {
//			System.out.println(category.getText());
//		}
		
		
		// To select the options in a dropdown, we can use index, value, text
		
		
		WebElement dd = driver.findElement(By.xpath("//select"));
		
		Select dropdown = new Select(dd);
		
//		dropdown.selectByIndex(7);
//		dropdown.selectByValue("15032");
		dropdown.selectByVisibleText("Cell Phones & Accessories");
		
		
		
		driver.findElement(By.id("gh-search-btn")).click();
//		driver.findElement(By.id("gh-search-btn")).submit();
		
		Thread.sleep(2000);
		
		
		// Xpath - Absolute xpath, relative xpath
		
		WebElement resultmsgElement = driver.findElement(By.xpath("//h1/span[2]"));
		String actualResultText = resultmsgElement.getText();
		Thread.sleep(2000);
		
		String expectedResultText = "Samsung";
		assertEquals(expectedResultText, actualResultText);
		
		Thread.sleep(2000);
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		driver.close();
	}

}
