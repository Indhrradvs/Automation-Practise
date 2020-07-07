package Guru99BankProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingNewCustomer {

		public WebDriver driver;
		
		public void URL() {
			
			System.setProperty("webdriver.chrome.driver","G:\\Selenium Softwares\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://demo.guru99.com/V4/manager/addcustomerpage.php");
		}
		
			public void CustomerInfo() throws InterruptedException 
		{
			
			driver.findElement(By.name("name")).sendKeys("Frank Martin");	//Customer name
			
			driver.findElement(By.id("dob")).sendKeys("07/13/1991");  // DOB
			
			driver.findElement(By.name("addr")).sendKeys("9355 Lee hwy"); //Address
			
			driver.findElement(By.name("city")).sendKeys("Fairfax");  //City
			
			driver.findElement(By.name("state")).sendKeys("Virginia");  // State
			
			driver.findElement(By.name("pinno")).sendKeys("123456"); //Pin
			
			driver.findElement(By.name("telephoneno")).sendKeys("9104449999"); //Phone
			
			driver.findElement(By.name("emailid")).sendKeys("Test1@gmail.com"); // Email
			
			driver.findElement(By.name("password")).sendKeys("123456");   // Password
			
			Thread.sleep(2000);
			
			driver.findElement(By.name("sub")).submit();  
		
		}
	public static void main(String[] args) throws InterruptedException {
		
		AddingNewCustomer ANC = new AddingNewCustomer();
		ANC.URL();
		ANC.CustomerInfo();
	}

}
