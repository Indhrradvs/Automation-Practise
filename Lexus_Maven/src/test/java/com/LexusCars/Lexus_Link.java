package com.LexusCars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Lexus_Link {

	@Test
	public void LX_003() {
		
		// Explicit wait 

		WebElement MyDynamicElement = (new WebDriverWait(Lexus_Search.driver, 30)).until(ExpectedConditions.presenceOfElementLocated((By.xpath("(//div[@class='r']/a/h3)[1]"))));
		
		MyDynamicElement.click();

	}

	// Assert.assertEquals("hi", "Hello"); 

}

