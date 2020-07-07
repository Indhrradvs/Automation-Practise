package com.TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	
	Reporter Myreport = new Reporter(); // Creating reporter obj for Logs
	
	
  @Test (enabled=true)
  public void Tc_01() {
	  
	  Reporter.log("this  Test case is checking for Log report");
	  System.out.println("This is 1st Test Case ");
	  Assert.assertEquals("test", "test123"); // Intentionally failing test Case
	  
  }
  
  @Test (enabled = false)
  public void Tc_02() {
	  
	  System.out.println("This is 2nd Test Case ");
  }
  
  @Test
  public void Tc_03() {
	  
	  System.out.println("This is 3rd Test Case ");
  }
  
  /*

  @BeforeMethod
  public void setup() {
	  System.out.println("This is Before Method");
  }
  
  @AfterMethod
  public void closebrowser() {
	  
	  System.out.println("This is After method ");
  }   */
  
  
   // @BeforeClass  
  
   /* It will runs once in the program*/
  
    //  public void start() {
	  
	 // System.out.println("Test Execution is ready......"); 
  }  
  
  
