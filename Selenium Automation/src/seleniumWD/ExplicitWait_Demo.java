package seleniumWD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Demo {

	public static void main(String[] args) {
		
         System.setProperty("webdriver.chrome.driver", "G:\\Selenium Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaautomated.com"); 
		
		System.out.println(driver.getTitle());
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //implicit wait
		
		
		/*Explicit Wait*/
		
		WebElement MyElement = (new WebDriverWait(driver, 20))
				.until(ExpectedConditions.presenceOfElementLocated(By.linkText("About Me")));
		
		MyElement.click();
		
		driver.quit();
				
		
	}

}
