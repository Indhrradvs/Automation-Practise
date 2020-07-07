package seleniumWD;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB_FindElementsExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","D:\\Selenium Softwares\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		List<WebElement> txtboxs = driver.findElements(By.className("inputtext"));
		
		System.out.println(txtboxs.size()); // Finding the total Input text boxes
		
		for(WebElement e:txtboxs)
		{
			e.sendKeys("hello");  // Send to only 5 Text boxes
		}

	}

}
