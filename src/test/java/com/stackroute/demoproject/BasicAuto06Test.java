package com.stackroute.demoproject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
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

public class BasicAuto06Test {
	
	WebDriver driver;
	
	@BeforeMethod
	public 	void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://javascript.info/alert-prompt-confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
//	@Test(dependsOnMethods = {"testAlert"})
//	public void testConfirmAlert() throws InterruptedException {
		
//		Thread.sleep(3000);
//		
////		driver.findElement(By.cssSelector("div#h3o1xizjmn div:nth-child(1)>a")).click();
//		driver.findElement(By.cssSelector("div:nth-of-type(7) div:nth-child(1) > a")).click();
//		Thread.sleep(2000);
//		
////		Alert simplealert = driver.switchTo().alert();
//		Alert confirmalert = driver.switchTo().alert();
//		
////		assertEquals(simplealert.getText(), "Hello");
//		assertEquals(confirmalert.getText(), "Are you the boss?");
//		Thread.sleep(2000);
//
////		simplealert.accept();
//		confirmalert.dismiss();
//		
//		Alert simplealert = driver.switchTo().alert();
//		assertEquals(simplealert.getText(), "false");
//		
//		simplealert.accept();
//		
		
//	}
	
	@Test
	public void testPrompt() throws Exception {
		
		
		driver.findElement(By.cssSelector("div#wiz7u7f4mr div:nth-child(1)>a")).click();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		
		
		assertEquals(al.getText(),"How old are you?");
		Thread.sleep(2000);
		al.sendKeys("30");
		Thread.sleep(2000);
		al.accept();
		Thread.sleep(2000);
		al = driver.switchTo().alert();
		assertEquals(al.getText(),"You are 30 years old!");
		Thread.sleep(2000);
		al.accept();
		Thread.sleep(2000);
		
		
	}

//	@Test
//	public void testAlert() throws InterruptedException {
//		
//		
//		assertTrue(false);
//		
//	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.close();
	}

}
