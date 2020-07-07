package SeleniumPractise;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RentalCars {

		public WebDriver driver;
		
		public void OpenURL()
		{
			System.setProperty("webdriver.chrome.driver","G:\\Selenium Softwares\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.carrentals.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}
	
	public void Pickup() {
		
	try {
		// Pickup Location	
			driver.findElement(By.id("pickup-location-ess")).sendKeys("IAD");
			driver.findElement(By.xpath("//div[contains(@class,'tt-suggestion tt-selectable') and contains(text(),'Washington, DC (IAD-Washington Dulles Intl.)')]")).click();
			
		// Pickup date

			driver.findElement(By.xpath("//input[@name='pickup-date']")).click();

		// Aug 24 -2018	
driver.findElement(By.xpath("(//button[@class='pika-button pika-day' and text()='24'])[2]")).click();
			
				//Pickup Time

				WebElement PickupTime = driver.findElement(By.xpath("//select[@name='pickup-time']"));
				Select timeSelect = new Select(PickupTime );
				timeSelect.selectByVisibleText("07:30 AM");  // 7.30 am selected
				
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	}

	public void DropOff() {
	
		try {
			// Drop-Off Date
			driver.findElement(By.xpath("//input[@name='dropoff-date']")).click();
			
			driver.findElement(By.xpath("(//button[@data-pika-month='7' and text()='29'])[2]")).click();
		
			
			//Drop Off Time
			
			WebElement droptime = driver.findElement(By.xpath("//select[@name='dropoff-time']"));
			Select Dtime = new Select(droptime);
			Dtime.selectByVisibleText("07:30 AM"); //7.30Am selected
			
			//Search Button
			driver.findElement(By.xpath("//button[@id='submit-farefinder']")).click();	
			driver.quit();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		}

	public static void main(String[] args) {
		
		RentalCars RC  = new RentalCars();
		RC.OpenURL();
		RC.Pickup();
		RC.DropOff();
			
	}

}
