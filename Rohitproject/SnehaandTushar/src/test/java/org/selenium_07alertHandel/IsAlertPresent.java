package org.selenium_07alertHandel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.selenium_01utilities.BaseUtilityUpdated;

public class IsAlertPresent {

	public static void main(String[] args) {
		
		BaseUtilityUpdated bu = new BaseUtilityUpdated ();
		
		WebDriver driver =bu.startup("ch","https://demoqa.com/alerts");
		WebElement secondAlert= driver.findElement(By.xpath("//div[@id='javascriptAlertsWrapper']/div[2]//button[@class='btn btn-primary']"));	
		secondAlert.click();
		
		if(bu.isAlertPresent(driver, 10)) {
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
		}else {
			//System.out.println(driver.switchTo().alert().getText());
			System.out.println("Alert is not present");
		}
		
	}//Exception Name-NoAlertPresentException
	//Exception Message-no such alert/no alert open
	//ExpectedConditions.alertIsPresent
}
