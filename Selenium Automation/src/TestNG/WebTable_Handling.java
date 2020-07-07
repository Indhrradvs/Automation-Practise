package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class WebTable_Handling {
	public WebDriver driver;
  
	@Test
  public void f() {
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		// retrieving Values from "Origin"
		
		String str = driver.findElement(By.xpath("//div[@id='ctl00_mainContent_"
				+ "ddl_originStation1_CTNR']")).getText();
		System.out.println(str);
		
		String []  s = str.split("\n");  // string values are stored in ARRAY 
		
		System.out.println(s.length); // Print the TOTAL Count (60) of values in Array 
		
		
		// we are  checking   VTZ or DXB or DEL is there in entire List. 
		
		for(int i=0;i<s.length;i++)   /* i<s.length = i<60 */
		{
			if(s[i].equalsIgnoreCase("Vishakhapatnam (VTZ)"))  // If VTZ is there it'll print
				System.out.println(s[i]);
			
			else if (s[i].equalsIgnoreCase("Dubai (DXB)") )  //  If DXB is there it'll print
				System.out.println(s[i]);
			
			else if(s[i].equalsIgnoreCase("Delhi (DEL)"))  // If DEL is there it'll print
				System.out.println(s[i]);
			
		}	
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium Softwares\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.spicejet.com/");
	  driver.manage().window().maximize();
	  
  }

}
