package SeleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtables {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Softwares\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Obj created

		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");

		driver.manage().window().maximize(); // Maximize Window

		Thread.sleep(3000);

		/* Finding NO.OF colums */
		List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th[1]"));
		System.out.println("No.of cols are:" + col.size()); // Prints all the cols in the table

		/* Finding No.of Rows */

		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
		System.out.println("No.of Rows are" + rows.size());
	}

}
