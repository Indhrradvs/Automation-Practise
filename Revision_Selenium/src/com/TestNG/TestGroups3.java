package com.TestNG;

import org.testng.annotations.Test;

public class TestGroups3 {
	
	@Test (groups= {"Regression"})
	  public void Tc_7() {
		  
		  System.out.println("Regression 7th Test Case");
	  }
	  
	  @Test(groups= {"Regression"})
	  public void Tc_8() {
		  
		  System.out.println("Regression 8th Test Case");
	  }
	  
	  @Test (groups= {"smoke"})
	  public void Tc_9() {
		  
		  System.out.println("smoke 9th Test Case");
	  }

}
