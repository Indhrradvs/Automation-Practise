package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class Verify_Alerts {
	
	public WebDriver driver;
 
@Test
  public void f() throws InterruptedException {
	
	driver.findElement(By.linkText("Hotels")).click();  //Click on Hotel
	Thread.sleep(3000);
	
	driver.findElement(By.id("ctl00_mainContent_txtOriginStation1_MST")).sendKeys("visakhapatnam"); //Selected *FROM
	
	Thread.sleep(3000);
	
	driver.findElement(By.linkText("Visakhapatnam")).click();
	
	Thread.sleep(5000);
	
	//check-in 
	driver.findElement(By.id("ctl00_mainContent_txt_Fromdate_MST")).click(); 
	driver.findElement(By.linkText("30")).click();  // August 30 selected.
	
	Thread.sleep(3000);
	
	//check out
	driver.findElement(By.id("ctl00_mainContent_txt_Todate_MST")).click();
	driver.findElement(By.linkText("4")).click();
	
	Thread.sleep(3000);
	new Select(driver.findElement(By.id("ddl_Infant_MST"))).selectByVisibleText("4"); //Selecting Infant
	
	Thread.sleep(3000);
	
	driver.findElement(By.id("ctl00_mainContent_ButtonSubmit_MST")).click();
	
	Thread.sleep(5000);
  }

@Test
public void verify_Alerts() throws InterruptedException
{
	
	// Way-1
	/* String str =  driver. switchTo(). alert(). getText();  // Capturing Alert data and storing into "str"
	
	 System.out.println(str);  //printing String value
	
	 Thread.sleep(2000);
	driver . switchTo() . alert(). accept();// OK

	//driver.switchTo().alert().dismiss(); //Cancel */
	
	// Way -2
	String str = driver.switchTo().alert().getText();
	System.out.println(str);
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
}

@BeforeTest
  public void beforeTest() {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Softwares\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.spicejet.com/");
	driver.manage().window().maximize();
}

}
