package Guru99BankProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99BankLogin {

	public WebDriver driver;
	
	public void URL() {
		
		System.setProperty("webdriver.chrome.driver","G:\\Selenium Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
	}
	
	
	public void Login( String username,String Password) throws InterruptedException {
		
		driver.findElement(By.name("uid")).sendKeys(username);   //user ID
		driver.findElement(By.name("password")).sendKeys(Password); //Password
		
		driver.findElement(By.name("btnLogin")).submit();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
	
		Guru99BankLogin Login = new Guru99BankLogin();
		Login.URL();
		Login.Login("mngr143532", "adUpezY");
		

	}

}
