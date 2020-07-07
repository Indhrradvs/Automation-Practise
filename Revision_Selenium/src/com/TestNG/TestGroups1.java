package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGroups1 {
	
  @Test (groups= {"smoke"})
  public void Tc_1() {
	  
	  System.out.println("Smoke 1st Test Case");
	  Assert.assertEquals("test", "test123");
  }
  
  @Test(groups= {"smoke"},dependsOnMethods= {"Tc_1"})
  public void Tc_2() {
	  
	  System.out.println("Smoke 2nd Test Case");
  }
  
  @Test (groups= {"smoke"},dependsOnMethods= {"Tc_1"})
  public void Tc_3() {
	  
	  System.out.println("Smoke 3rd Test Case");
  }
}
