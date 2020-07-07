package seleniumWD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");  //Get Command
		
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.youtube.com/"); // TO command
		
		driver.manage().window().maximize(); //Maximize command
		
		System.out.println(driver.getTitle());
		
	   driver.navigate().back();   // Back Command
		
		driver.navigate().forward(); //Forward command
		
		driver.navigate().refresh();   //Refresh command
		
		driver.close();   //Close command
		
		System.out.println("Everything is Perfectly Executed");
		
	}

}
