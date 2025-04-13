package com.stackroute.demoproject;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import java.lang.Object;


public class DataDrivenTest{
	
  @Test(dataProvider = "getTestData")
  public void testDemo(Integer id,String name) {
	  
	  System.out.println(id+" === "+name);
  
  }

  @DataProvider
  public Object[][] getTestData() {
	  
//	  Object o = "welcome";
//	  Object o1 = 100;
	  
  			  
	Object[][] testdata = TestUtil.getData();
	    
//	int[] a = new int[] {
//			4,5,6
//	};
	    
//	int[][] a = new int[][] {
//		{4,5,6},
//		{1,2,3}
//	};
	    
	return testdata; 
    
    
  }
  
  
  
}
