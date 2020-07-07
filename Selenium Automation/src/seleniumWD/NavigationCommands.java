package seleniumWD;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	WebDriver driver;

	public void invokeBrowser() {

		try {
			System.setProperty("webdriver.chrome.driver", "G:\\Selenium Softwares\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void navigation() throws InterruptedException {
		
		try {
			driver.navigate().to("https://www.expedia.com/");
			
			driver.findElement(By.id("primary-header-cruise")).click();
			
			Thread.sleep(2000);  //Not Recommended at All
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			driver.navigate().forward();
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		NavigationCommands NC =  new NavigationCommands();
		NC.invokeBrowser();
		NC.navigation();

	}

}
