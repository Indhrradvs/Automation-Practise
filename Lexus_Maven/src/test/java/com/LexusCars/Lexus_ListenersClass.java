package com.LexusCars;


import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Lexus_ListenersClass extends TestListenerAdapter {
	
	
	@Override
	public void onTestSuccess(ITestResult tr) {

		System.out.println("Test Case:" + tr.getName()); // To print Test Case Name

	}

	@Override
	public void onTestFailure(ITestResult tr) {

		File scrFile = ((TakesScreenshot)Lexus_Search.driver).getScreenshotAs(OutputType.FILE);

		/* Now you can do whatever you need to do with it, for example copy somewhere */

		try {
			
			FileUtils.copyFile(scrFile, new File("..//Lexus/target/" +tr.getName()+".png"));
			
		} catch (IOException e) {

			e.printStackTrace();
	

		
	}
  }
}
