package seleniumWD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/* To Execute same program in TestNG, please reffer same program in TestNG*/

public class Spicejet_PopUp {

	public  WebDriver driver;
	
	public void OpenURL()    //Opening Browser and Page
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Softwares\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		driver.manage().window().maximize();
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
	public static void main(String[] args) throws InterruptedException {
		
		Spicejet_PopUp P = new Spicejet_PopUp();
		P.OpenURL();
		P.verifyOneWaySearch();
		P.Currency_PopUp();
		
	}

}
