package seleniumWD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AllBrowsers {
	
	public void Firefox()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Softwares\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
	}
	
	public void Chrome()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		System.out.println(driver.getTitle());
	}
	public static void main(String[] args) {
		
			AllBrowsers  A = new  AllBrowsers();
			
			A.Firefox();
			A.Chrome();
	}

}
