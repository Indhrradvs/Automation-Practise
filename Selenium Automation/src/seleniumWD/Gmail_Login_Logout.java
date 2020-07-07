package seleniumWD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login_Logout {
	
		public static WebDriver driver;
		
		public void OpenURL()
		{
			System.setProperty("webdriver.chrome.driver", "G:\\Selenium Softwares\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://www.gmail.com");
			String AT = driver.getTitle();  // AT- Actual Title
			
			String ET ="gmail";   //ET- Expected Title
			
			if(AT.equalsIgnoreCase(ET))
			{
				System.out.println("Test Successful");
			}
			else
			{
				System.out.println("Test Failed");
			}
	}
	
		public void Login() throws InterruptedException
		{
			driver.findElement(By.id("identifierId")).sendKeys("venkat.djr");
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys("venkat_djr");
			driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
			
			Thread.sleep(8000);
		}
		
		public void LogOut() throws InterruptedException
		{
		
			driver.findElement(By.xpath("//span[@class='gb_8a gbii']")).click();
			
			Thread.sleep(4000);
			
			driver.findElement(By.linkText("Sign out")).click();					
		}
	
		public static void main(String[] args) throws InterruptedException {
		
			Gmail_Login_Logout G = new Gmail_Login_Logout();
			G.OpenURL();
			G.Login();
			G.LogOut();
	}

}
