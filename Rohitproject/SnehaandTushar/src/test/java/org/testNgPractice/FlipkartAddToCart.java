package org.testNgPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenium_01utilities.BaseUtilityUpdated;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlipkartAddToCart {
	WebDriver driver;
	WebDriverWait wt;
	BaseUtilityUpdated bu;
	@BeforeTest
	public void initiReqData() {
		bu=new BaseUtilityUpdated();
		driver=bu.startup("FF","https://www.flipkart.com/");
		wt=new WebDriverWait(driver,Duration.ofSeconds(20));

	}
	@BeforeMethod
	public void loginFlipkart() {

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9594623769");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Rohit@241095");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	}
	@Test
	public void addItemsToCart(){
		wt=new WebDriverWait(driver,Duration.ofSeconds(30));
		wt.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")));
		WebElement searchText = driver.findElement(By.name("q"));
		searchText.sendKeys("Wing of Fire");
		searchText.sendKeys(Keys.ENTER);
//		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-id='RBKG6KJ3HEABZAZF']")));
//		String parentWindow = driver.getWindowHandle();
//		bu.windowSwitch(driver,By.xpath("//div[@data-id='RBKG6KJ3HEABZAZF']"),By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
//
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
//		driver.switchTo().window(parentWindow);
		System.out.println("Flipkart Allocated Thread"+Thread.currentThread().getId());
	}
	@AfterMethod
	public void flipkartLogout() {
		WebElement rohit=driver.findElement(By.cssSelector("[class='exehdJ']"));
		Actions act=new Actions(driver);
		act.moveToElement(rohit).perform();
		driver.findElement(By.xpath(("//a[@href='#']"))).click();
	}
	@AfterTest
	public void closeDriver() {
		driver.quit();
	}
}