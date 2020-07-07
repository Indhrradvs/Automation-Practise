package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearch {

	@Test
	public void Tc_001() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Softwares\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");

		driver.findElement(By.name("q")).sendKeys("GMC");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.name("btnK")).click();

	}
}
