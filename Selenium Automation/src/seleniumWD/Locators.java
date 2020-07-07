package seleniumWD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://startingwithseleniumwebdriver.blogspot.com/2013/12/frmset1.html");
		driver.manage().window().maximize();     //Maximize Window

		WebElement objLoc; //creating object
		
		//Using name-Text Box
		objLoc = driver.findElement(By.xpath("//*[@name=\"txtbox1\"]"));
		objLoc.sendKeys("Test successFul");
		System.out.println("Test Success");
	
		// Radio Button
		objLoc = driver.findElement(By.xpath("//input[@name ='radioGroup1']//parent::td[1]"));
		objLoc.click();
		System.out.println("Radiobutton Selected"); 
		
		
		//Check Box
		
		objLoc = driver.findElement(By.xpath(" //input[@name ='chkbox']//parent::td[1]"));
		objLoc.click();
		System.out.println("Check Box selected");  //Capturing Text 
		
		//Drop Downs
		
		objLoc = driver.findElement(By.name("dropdownlist"));
		Select Objselect = new Select(objLoc);  //Selecting Dropdown
		
		Objselect.selectByIndex(0); //select By index
		Objselect.selectByVisibleText("Item 4");		 // select By visible Text
		
		
	
	}

}
