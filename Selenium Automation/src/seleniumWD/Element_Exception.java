package seleniumWD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_Exception {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Softwares\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		driver.manage().window().maximize();

		try {
			if (driver.findElement(By.id("TEST")).isDisplayed()) {

				System.out.println("Text box present, Enter Text");
			}

		} catch (Exception e) {
			System.out.println("Element not Found");
		}
	}

}
