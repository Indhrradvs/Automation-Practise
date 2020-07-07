package com.bmw;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class bmw_HomePage {

	@Test
	public void bmw_TC3() throws InterruptedException {

		bmw_searchpage.bmw.findElement(By.xpath("//input[@id='zip-banner__input']")).sendKeys("22031");

		bmw_searchpage.bmw.findElement(By.xpath("//button[@name='submit']")).click();

		Thread.sleep(3000);
		
		bmw_searchpage.bmw.findElement(By.xpath("//a[@href='/college-graduate-program.html']")).click();
	}

}
