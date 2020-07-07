package com.bmw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class bmw_searchpage {

	public static WebDriver bmw;

	@BeforeTest
	public void config() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Softwares\\chromedriver.exe");
		bmw = new ChromeDriver();
		bmw.manage().window().maximize();
		bmw.get("https://www.google.com");

	}

	@Test
	public void bmw_TC1() {
		bmw.findElement(By.name("q")).sendKeys("bmw");
		bmw.findElement(By.name("btnK")).click();
	}

	@Test
	public void bmw_TC2() {

		bmw.findElement(By.xpath("//h3[text()='BMW USA: Luxury Sedans, SUVs, Convertibles, Coupes & Wagons']")).click();
	}

}
