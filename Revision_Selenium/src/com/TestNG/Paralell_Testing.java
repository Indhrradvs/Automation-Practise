package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Paralell_Testing {

	public WebDriver IndhrraDriver;

	@Parameters("myBrowser")
	@BeforeClass
	public void LaunchBrowser(String myBrowser) {

		if (myBrowser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "D:\\Selenium Softwares\\geckodriver.exe");

			IndhrraDriver = new FirefoxDriver();

		} else if (myBrowser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "D:\\Selenium Softwares\\chromedriver.exe");

			IndhrraDriver = new ChromeDriver();
		}
	}

	@Test
	public void Tc_01() {
		
		IndhrraDriver.get("https://www.google.com");
		IndhrraDriver.findElement(By.name("q")).sendKeys("Apple");
	}
}
