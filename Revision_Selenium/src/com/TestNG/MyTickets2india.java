package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTickets2india {

	public WebDriver driver;

	public void OnewaySearch() {

		// Selecting One-Way

		driver.findElement(By.xpath("//label[@id='AirSearchForm_lbl-oneway']")).click();

		// From

		driver.findElement(By.xpath("//input[@id='AirSearchForm_From']")).sendKeys("BWI");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(
				By.xpath("//span[@class='highlight']/parent:: div[text()='] Baltimore, MD, United States, US']"))
				.click();

		// To

		driver.findElement(By.xpath("//input[@id='AirSearchForm_To']")).sendKeys("JFK");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath(
				"//span[@class='highlight']/ parent:: div[text()='] New York John F Kennedy, NY, United States, US']"))
				.click();

		// Click on Date Option

		driver.findElement(By.xpath("//div[@id='AirSearchForm_FromDate']")).click();

		// Select Month from Date Picker

		WebElement Depart = driver.findElement(By.xpath("//select[@class='calText']"));

		Depart.click();

		Select mnth = new Select(Depart);

		mnth.selectByVisibleText("Oct 2018");

		// Selecting Date

		driver.findElement(By.xpath("(//td[@class='wDay'])[4]")).click();

		// Adults

		driver.findElement(By.xpath("//div[@id='AirSearchForm_Adults']")).click();

		driver.findElement(By.xpath("//div[@id='DDListPopUp']/child::div[text()='3']")).click();

		// Cabin

		driver.findElement(By.xpath("//div[@id='AirSearchForm_Class']")).click();

		driver.findElement(By.xpath("//div[text()='Business']")).click();

		// Search

		driver.findElement(By.xpath("//a[@class='button']")).click();

	}

	@Test
	public void f() {

		OnewaySearch();
	}

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Softwares\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://myticketstoindia.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

}
