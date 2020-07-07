package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Handling_PopUp {
		
	public WebDriver driver;
	
	@Test
  public void f() throws InterruptedException {
	  
		//Alert
				driver.findElement(By.id("searchBtn")).click();  // search Button
				String str =  driver.switchTo().alert().getText();
				System.out.println(str);
				Thread.sleep(2000);
				driver.switchTo().alert().accept();// OK
			
				// Origin and Destination
				
				driver.findElement(By.id("fromPlaceName")).sendKeys("Bengaluru");
				Thread.sleep(2000);
				driver.findElement(By.linkText("BENGALURU INTERNATION AIPORT"));
				
				driver.findElement(By.xpath("//input[@id='toPlaceName']")).sendKeys("vijaya");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//a[text()='VIJAYAWADA']"));
				System.out.println("Vijayawada selected");
			
				
				// Date of Travel
				
		driver.findElement(By.xpath("//input[@id='txtJourneyDate']")).sendKeys(Keys.ENTER);
		System.out.println("Date of Departure Selected");
		
		driver.findElement(By.xpath("//a[text()='20']")).click();
		System.out.println("july 20 selected");

		driver.findElement(By.xpath("//input[@id='txtReturnJourneyDate']")).sendKeys(Keys.ENTER);
		System.out.println("Return Journey selected");
		
		driver.findElement(By.xpath("//a[text()='26']")).click(); 
		System.out.println("Return Date Selected"); 
		
		// Check Box
		driver.findElement(By.xpath("//input[@name='singleLady']")).sendKeys(Keys.ENTER);
		
		// search Button
		driver.findElement(By.id("searchBtn")).click();  
				
			}
	
  @BeforeTest
  public void beforeTest() {
	  
	   System.setProperty("webdriver.chrome.driver", "D:\\Selenium Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
  
  
  }

}
