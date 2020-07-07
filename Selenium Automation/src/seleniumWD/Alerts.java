package seleniumWD;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Softwares\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");

		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']")).click();

		Thread.sleep(3000);

		Alert alert = driver.switchTo().alert();

		alert.accept();
		
	//	alert.sendKeys("");
		
	//	alert.getText();
		
	//	alert.dismiss();
	
	}

}
