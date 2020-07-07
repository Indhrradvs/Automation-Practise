package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PHPtravels {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();   // Obj created
		
		driver.get("https://www.phptravels.net/");  // Accessing URL
		
		driver.manage().window().maximize();   // Maximize Window
		
		Thread.sleep(3000);
		
		/* Click on FLIGHTS */
	
		WebElement Flights;  //Creating Object
		
		Flights = driver.findElement(By.xpath("//span[text()='Flights']"));
		
		Flights.click();
		
		Thread.sleep(3000);
		
		
	
	
	}

}
