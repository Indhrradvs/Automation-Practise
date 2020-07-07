package com.TestNG;

import org.testng.annotations.Test;

public class TestGroups2 {
	
	 @Test (groups= {"Regression"})
	  public void Tc_4() {
		  
		  System.out.println("Regression 4th Test Case");
	  }
	  
	  @Test(groups= {"Regression"})
	  public void Tc_5() {
		  
		  System.out.println("Regression 5th Test Case");
	  }
	  
	  @Test (groups= {"Regression"})
	  public void Tc_6() {
		  
		  System.out.println("Regression 6th Test Case");
	  }

}
