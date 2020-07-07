package seleniumWD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowcmds {
	
	public static WebDriver driver;

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Softwares\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.get("https://www.hdfcbank.com");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
		// Click on Credit Card Option
		
		driver.findElement(By.xpath("/(//a[@class='applynowknowmore'])[5]")).click();
				

	}

}
