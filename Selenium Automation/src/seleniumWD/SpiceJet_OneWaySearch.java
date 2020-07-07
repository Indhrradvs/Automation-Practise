package seleniumWD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet_OneWaySearch {

	public  WebDriver driver;
	
	public void OpenURL()    //Opening Browser and Page
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Softwares\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		driver.manage().window().maximize();
	}
	
	public  void verifyOneWaySearch()
	{
	
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); //Selected *FROM
 	driver.findElement(By.linkText("Hyderabad (HYD)")).click();
	driver.findElement(By.linkText("Bengaluru (BLR)")).click();
	driver.findElement(By.linkText("19")).click();
	
	//Selecting "Currency" Values from the DropDown
		new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).selectByVisibleText("USD");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();  // Search Button
		
		driver.close();
	}
		
	public static void main(String[] args) {
		
		SpiceJet_OneWaySearch s = new SpiceJet_OneWaySearch();
		s.OpenURL();
		s.verifyOneWaySearch();
	}

}
