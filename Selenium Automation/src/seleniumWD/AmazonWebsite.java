package seleniumWD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AmazonWebsite {

	 WebDriver driver;

	public void invokeBrowser() {

		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium Softwares\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getCommands() {

		try {
			driver.get("https://www.amazon.com");
			// Title of the Page
			String Titleofthepage = driver.getTitle();
			System.out.println("Title of the page is     " + Titleofthepage);

			// Finding Element
			driver.findElement(By.linkText("Today's Deals")).click();

			// URL of the Page
			String currentURL = driver.getCurrentUrl();
			System.out.println("Current URL is   " + currentURL);

			/*
			 * Page Source --> It will Return the complete Page code, to check undo Comments
			 * and TRY. System.out.println("Page Source is  "+driver.getPageSource());
			 */

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		AmazonWebsite AW = new AmazonWebsite();
		AW.invokeBrowser();
		AW.getCommands();

	}

}
