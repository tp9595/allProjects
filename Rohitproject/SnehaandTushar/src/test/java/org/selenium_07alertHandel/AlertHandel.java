package org.selenium_07alertHandel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenium_01utilities.BaseUtilityUpdated;

import dev.failsafe.internal.util.Assert;

public class AlertHandel {

	public static void main(String[] args) throws InterruptedException {
		BaseUtilityUpdated bu = new BaseUtilityUpdated ();
		
		WebDriver driver =bu.startup("ch","https://demoqa.com/alerts");
		WebElement firstAlert= driver.findElement(By.xpath("//div[@id='javascriptAlertsWrapper']/div[1]//button[@class='btn btn-primary']"));	
		firstAlert.click();
		System.out.println("First Button Text :"+driver.switchTo().alert().getText());
		System.out.println(driver.switchTo().alert().getClass());//for checking
		driver.switchTo().alert().accept();
		
		WebElement secondAlert= driver.findElement(By.xpath("//div[@id='javascriptAlertsWrapper']/div[2]//button[@class='btn btn-primary']"));	
		secondAlert.click();
		
		WebDriverWait wt =new  WebDriverWait(driver,Duration.ofSeconds(50));
		wt.until(ExpectedConditions.alertIsPresent());
		System.out.println("Second Button Text :"+driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		WebElement thirdAlert= driver.findElement(By.xpath("//div[@id='javascriptAlertsWrapper']/div[3]//button[@class='btn btn-primary']"));
		thirdAlert.click();
		System.out.println("Third Button Text :"+driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		WebElement fourthAlert= driver.findElement(By.xpath("//div[@id='javascriptAlertsWrapper']/div[4]//button[@class='btn btn-primary']"));
		fourthAlert.click();
		driver.switchTo().alert().sendKeys("Sunny Bhai");
		System.out.println("Fourth Button Text :"+driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
	}public void WaitForAlertIsPresent(WebDriver driver,int time) {
		WebDriverWait wt =new WebDriverWait(driver,Duration.ofSeconds(time));
		wt.until(ExpectedConditions.alertIsPresent());
	}
	

}
