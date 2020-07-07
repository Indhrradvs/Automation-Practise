package seleniumWD;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsBy_Demo {

	public static void main(String[] args) {		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automate-apps.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		
		List<WebElement> AList = driver.findElements(By.tagName("a"));
		System.out.println(AList.size());
		driver.quit();
	}

}
