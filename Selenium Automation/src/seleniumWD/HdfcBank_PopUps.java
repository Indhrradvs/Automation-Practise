package seleniumWD;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcBank_PopUps {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Softwares\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hdfcbank.com/");

		/* Finding Window Name */

		String Homepage = driver.getWindowHandle();

		System.out.println(Homepage);

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		driver.findElement(By.xpath("//a[@id='loginsubmit']")).click();

		// String popup_Page = driver.getWindowHandle();

		// System.out.println(popup_Page);

		/* getWindowHandles --> Returns set of window Handles */

		Set<String> windows = driver.getWindowHandles();

		System.out.println(windows.size());

		/* Iterating each window using Iterator */

		Iterator iterator = windows.iterator();

		String currentwindowID;

		// hasNext(): Returns TRUE if iteration has more elements

		while (iterator.hasNext()) {

			currentwindowID = iterator.next().toString();
			System.out.println(currentwindowID);

			if (!currentwindowID.equals(Homepage)) {

				driver.switchTo().window(currentwindowID);

				// driver.close();

				Thread.sleep(3000);

				driver.findElement(By.xpath("(//a[@class='btn btn-default redBtn'])[2]")).click();

			}
		}

	}

}
