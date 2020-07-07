package Junit;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Gmail_Login_Logout_Junit {

	public WebDriver driver;

	@BeforeEach
	void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
	}

	@AfterEach
	void tearDown() throws Exception {

		driver.quit(); /* Post cond is not necessary if we want we can give it */

	}

	@Test
	void verify_Login() throws InterruptedException {
		driver.findElement(By.id("identifierId")).sendKeys("venkat.djr");
		driver.findElement(By.xpath("//span[text()='Next']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys("venkat_djr");
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();

		Thread.sleep(10000);
	}

	/*
	 * below Test case is going to be failed because Every Method Executes
	 * Independently. Continuous execution is won't happen. So, new browser will
	 * open.
	 */

	@Ignore
	@Test
	void verify_Logut() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class ='gb_db gbii']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@id='gb_71']")).click();
	}

	@Test
	void test1() {
		System.out.println("Welcome to Junit Testing");
	}

}
