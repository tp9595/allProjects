package org.testNgPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
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

public class AmzonTrackOrder {
	WebDriver driver;
	BaseUtilityUpdated bu;
	WebDriverWait wt;
	@BeforeTest
	public void initiReqData() {
		System.out.println("Amazon Allocated Thread"+Thread.currentThread().getId());
		bu=new BaseUtilityUpdated();
		driver=bu.startup("CH","https://www.amazon.in/");
		wt=new WebDriverWait(driver,Duration.ofSeconds(20));
		}
	@BeforeMethod 
	public void amazonLogin(){
		//driver.findElement(By.xpath("//div[@id='nav-signin-tooltip']//span")).click();		
		WebElement signIn=driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]"));
		Actions act =new Actions(driver);
		act.moveToElement(signIn).perform();
		driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9579042230");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Harshu@56");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
	}
	
	@Test
  public void  trackOrder(){
		WebElement frLGT=driver.findElement(By.xpath("//a[@href='https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn']"));
		
		Actions act =new Actions(driver);
		act.moveToElement(frLGT).perform();
		driver.findElement(By.xpath("//a[@id='nav_prefetch_yourorders']/span")).click();
		driver.findElement(By.xpath("//a[@id='a-autoid-2-announce']")).click();
		driver.findElement(By.xpath("//a[text()='See all updates']")).click();
		wt.ignoring(TimeoutException.class).until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='a-icon a-icon-close']")));
		wt.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='a-icon a-icon-close']"))));
		driver.findElement(By.xpath("//i[@class='a-icon a-icon-close']")).click();
		driver.findElement(By.xpath("//a[@href='/ref=nav_logo']")).click();
		//gObj.waitForVisibilityOfElement(driver,40,(By.xpath("//a[@href='https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn']")));
		
		WebElement signOut = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		act.moveToElement(signOut).perform();
		System.out.println("Amazon Allocated Thread"+Thread.currentThread().getId());
  }
	@AfterMethod
	public void amazonLogout() {
		driver.findElement(By.xpath("//a[@id='nav-item-signout']")).click();
	}
	@AfterTest
	public void amazon() {
		driver.close();
		
	}
	
}
