package com.LexusCars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Lexus_Search {

	public static WebDriver driver;
	
	/*
	 * Parallel  Execution
	 * 
	 * */
	
	@Parameters("LBrowser")
	
	@BeforeClass
	public void LaunchBrowser(String LBrowser) {
		
		if(LBrowser.equalsIgnoreCase("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium Softwares\\geckodriver.exe");
			driver = new FirefoxDriver();
					
		}
		else if (LBrowser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium Softwares\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
		}
		
		driver.get("https://www.google.com");
	}
	
	
	/*
	 * entering into Search Box
	 * 
	 */

	@Test
	public void LX_001() {

		driver.findElement(By.name("q")).sendKeys("Lexus");
	
		//Assert.assertEquals("hi", "Hello");
	}

	/*
	 * Click on Search Option
	 *
	 */

	@Test
	public void LX_002() {
		
		driver.findElement(By.xpath("(//input[@name='btnK'])[1]")).submit();
		
		//Assert.assertEquals("hi", "Hello");
	}
}