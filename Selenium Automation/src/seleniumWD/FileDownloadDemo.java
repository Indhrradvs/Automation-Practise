package seleniumWD;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Downloading File In FIREFOX Browser and Handling Windows POP-UP
 * 
 */

public class FileDownloadDemo {

	public static WebDriver driver;

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Softwares\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.get("https://www.google.com");

		driver.manage().window().maximize();

		// Sending text to Text Box

		driver.findElement(By.name("q")).sendKeys("Java Download");

		// Click on Search Button

		driver.findElement(By.name("btnK")).submit();

		// Providing Implicit wait

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Opening JAVA Download Link

		driver.findElement(By.xpath("(//h3[@class='LC20lb'])[1]")).click();

		// Providing Implicit wait

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Click on " FREE JAVA DOWNLOAD " Button

		driver.findElement(By.xpath("//div[@class='jvdl0 jvdl0v0']/a/span")).click();

		// Providing Implicit wait

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Click on " Agree and Start Free Download"

		driver.findElement(By.xpath("//div[@class='jvdl0 jvdl0v0']/a/span")).click();

		// Handling Window Based POP-UP using ROBOT API

		Robot robotObj = new Robot();

		// Providing Implicit wait

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Click on TAB Operation

		robotObj.keyPress(KeyEvent.VK_TAB);
 
		// Providing Implicit wait

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Click on Enter Operation

		robotObj.keyPress(KeyEvent.VK_ENTER);

	}

}
