package seleniumWD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Softwares\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		driver.manage().window().maximize();

		// System.out.println(driver.findElement(By.id("lst-ib")).isDisplayed()); //
		// Verifying Text Box -->Ans:True

		/*
		 * if Element found then i need to send some text into text box if not i need to 
		 print Element not found.
		 
		 Here Else condition won't work so we use " try catch Block "
		 * 
		 */

		if (driver.findElement(By.id("lst-ib")).isDisplayed()) {

			System.out.println("Text box present, Enter Text");

			driver.findElement(By.id("lst-ib")).sendKeys("Toyota");
		
		} else {

			System.out.println("Element not Found");
		}

	}
}
