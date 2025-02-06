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

public class BasicAuto08Test {
	
	WebDriver driver;
	
	@BeforeClass
	public 	void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	@Test
	public void testKeyboardAction() throws Exception{
	
		
		Actions action = new Actions(driver);

		WebElement usernamefield = driver.findElement(By.name("username"));
		Thread.sleep(3000);
		
		action
			.click(usernamefield)
			.keyDown(Keys.SHIFT)
			.sendKeys("admin")
			.keyUp(Keys.SHIFT)
			.doubleClick()
			.keyDown(Keys.BACK_SPACE)
			.keyUp(Keys.BACK_SPACE)
			.sendKeys("Admin")
			.build()
			.perform();

		Thread.sleep(3000);
		
		

	}


	@AfterClass
	public void tearDown() throws Exception {
		driver.close();
	}

}
