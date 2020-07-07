package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Spicejet_Popup {

		public WebDriver driver;
		
		
		public void Currency_PopUp() throws InterruptedException
		{
			
			driver.findElement(By.linkText("Currency Converter")).click();  // clicking on Currency Converter
			Thread.sleep(3000);
				
			new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverter"
					+ "View_DropDownListBaseCurrency"))).selectByVisibleText("US Dollar(USD)"); // Selecting USD option
			
			new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverter"
					+ "View_DropDownListConversionCurrency"))).selectByVisibleText("Indian Rupee(INR)"); // SelectingINR

			// Entering $100 in text Box
			driver.findElement(By.id("CurrencyConverterCurrencyConverterView_TextBoxAmount")).sendKeys("100");
			
			Thread.sleep(3000);
			
			// Clicking on Convert
			driver.findElement(By.id("CurrencyConverterCurrencyConverterView_ButtonConvert")).click();
			
			Thread.sleep(7000);
			
			// Clicking on CLOSE- POPUP
			driver.findElement(By.id("ButtonCloseWindow")).click();
			
		}
				
	public void verifyOneWaySearch() throws InterruptedException
	{	
	/*	 String str;
		 str = driver.getWindowHandle(); */
			
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); //Selected *FROM
	 	driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		driver.findElement(By.linkText("19")).click();
		
		//Selecting "Currency" Values from the DropDown
			new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).selectByVisibleText("USD");
			System.out.println(driver.getTitle());
			
			driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();  // Search Button
			
			Thread.sleep(5000);
	}
		
	@Test
	public void f() throws InterruptedException {
		verifyOneWaySearch();
		Currency_PopUp();
	}
		
		@BeforeTest
  public void beforeTest(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Softwares\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}
