package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();   // Obj created
		
	
		driver.get("https://www.lufthansa.com/online/portal/lh/us/homepage");
		
		driver.manage().window().maximize();   // Maximize Window
		
		Thread.sleep(3000);
		
		
       driver.findElement(By.xpath("//input[@id='flightmanagerFlightsFormOrigin']")).sendKeys("IAD");

       Thread.sleep(2000);
		
       driver.findElement(By.xpath("//input[@id='flightmanagerFlightsFormDestination']")).sendKeys("HYD");
       
       Thread.sleep(2000);
       
       
    //   driver.findElement(By.xpath("//span[text()='One-way']")).click();
       
       driver.findElement(By.xpath("(//input[@class='form-control datepicker'])[1]")).click(); //selecting Calendar Tab
       driver.findElement(By.xpath("//button[text()='03']")).click();
              
       //Thread.sleep(2000);
            
       driver.findElement(By.xpath("(//div[@class='month-head'])[4]")).click();
       
       driver.findElement(By.xpath("(//input[@class='form-control datepicker'])[2]")).click();
       driver.findElement(By.xpath("(//button[text()='17'])[2]")).click();
		
		//driver.findElement(By.xpath("//span[text()='Continue']")).click();
	}

}
