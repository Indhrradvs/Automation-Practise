package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {

	WebDriver driver;

	Action mouseovr, mousedown, release, contextclk, sndkeys, keydwn, keyup;

	Actions baction;

	@BeforeTest
	public void setup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Softwares\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.seleniumhq.org");

		Thread.sleep(3000);

		baction = new Actions(driver);

		// mouseovr = baction.moveToElement(driver.findElement(By.id("q"))).build();

		/* Click and Hold */

		// mousedown =
		// baction.clickAndHold(driver.findElement(By.id("submit"))).build();

		/* Release Action */

		// release = baction.release(driver.findElement(By.id("submit"))).build();

		/* Context-click --> Right click */

		// contextclk = baction.contextClick(driver.findElement(By.id("q"))).build();

		/* Send Keys using Actions */

		// sndkeys = baction.sendKeys(driver.findElement(By.id("q")),
		// "webdriver").build();

	}

	@Test
	public void KeyBoard() {

		/* Key Board Actions - Key down */

		// keydwn = baction.keyDown(Keys.SHIFT).build(); // To Open in New Window
		// driver.findElement(By.linkText("Projects")).click();

		/* Key Board Actions - Key UP */

		keyup = baction.keyUp(Keys.SHIFT).build(); // To open in same Page

		driver.findElement(By.linkText("Projects")).click();

	}

	@Test
	public void mouseOver() {

		// mouseovr.perform(); // Performing Mouse Over Action

		// mousedown.perform(); // performing Mouse Down action

		// release.perform(); // Performing Release

		// contextclk.perform(); // Performing Right-click

		// sndkeys.perform(); // Performing Send keys

		// keydwn.perform(); // Open in new window

		keyup.perform(); // open in same window
	}

}
