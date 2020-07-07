package TestNG;

import org.testng.annotations.Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class StaleElement {

	public static WebDriver driver;

	@Test
	public void FindingLinks() {

		int count = 0; // Count for printing visible links out of all links in Webpage

		// Printing Total Links

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());

		// Printing the LInks Names

		for (int i = 0; i < links.size(); i++) {
			if (!links.get(i).getText().isEmpty()) // removing spaces between Links(NON-Empty Links)
			{
				count = count + 1;
				System.out.println(links.get(i).getText());

				links = driver.findElements(By.tagName("a")); // solving STALE Element Exception
			}
		}
		System.out.println("Visible Links are:   " + count); // Answer: Visible Links are: 35
	}

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Softwares\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://hdfcbank.com");
		driver.manage().window().maximize();
	}

}
