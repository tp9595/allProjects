package org.selenium_08actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenium_01utilities.BaseUtilityUpdated;

public class ClickByusingActiveElement {

	public static void main(String[] args) {
		BaseUtilityUpdated bObj = new BaseUtilityUpdated();
		
		WebDriver driver=bObj.startup("CH","https://www.flipkart.com/");
		driver.switchTo().activeElement().sendKeys("9594623769");
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Rohit@241095");
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);

	}

}
