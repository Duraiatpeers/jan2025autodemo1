package com.stackroute.demoproject;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Auto01Test {

 
  
  @Test
  public void testAdd() {
  
	  System.out.println("First test method");
	  assertTrue(false);
  }


  @Test
  public void testSub() {
  
	  System.out.println("First test method");
	  assertTrue(false);
  }
}
