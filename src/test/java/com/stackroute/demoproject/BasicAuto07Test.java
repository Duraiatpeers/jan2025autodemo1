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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAuto07Test {
	
	WebDriver driver;
	
	@BeforeClass
	public 	void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	@Test(groups = {"smoketest"})
	public void testFrame() throws Exception {
		
		driver.switchTo().frame(0);
		WebElement element1 = driver.findElement(By.cssSelector("div#draggable > p"));
		assertEquals(element1.getText(), "Drag me to my target");
		Thread.sleep(3000);
		
	}
	
	
	@Test(dependsOnGroups = {"smoketest"})
	public void testMouseAction() throws Exception{
	
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
//		action
//			.dragAndDrop(draggable, droppable)
//			.build()
//			.perform();

		action
			.clickAndHold(draggable)
			.moveToElement(droppable)
			.release()
			.clickAndHold(draggable)
			.moveByOffset(50,50)
			.release()
			.build()
			.perform();

		Thread.sleep(3000);
		

	}


	@AfterClass
	public void tearDown() throws Exception {
		driver.close();
	}

}
