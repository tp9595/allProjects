package org.testNGAssertionParameter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenium_01utilities.BaseUtilityUpdated;
import org.selenium_01utilities.Configwithconstr;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HardAssert {

	WebDriver driver;

	private String bName;
	private String url;
	private String uName;
	private String pwd;
	BaseUtilityUpdated bu;
	Configwithconstr ctr;


	@BeforeMethod
	public void actiLogin() {
		bName=ctr.getPropertyValue("browserNameCH");
		url=ctr.getPropertyValue("url");
		driver= bu.startup(bName, url); 

	}


	@Test
	public void verifyLogin() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rohitmahaj2480@gmail.com");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("Rohit@2410");
		driver.findElement(By.cssSelector("#loginButton")).click();
		//hard assert
		String exptUrl="https://online.actitime.com/own1/timetrack/enter.do";
		WebDriverWait wt =new WebDriverWait(driver,Duration.ofSeconds(20));
		wt.until(ExpectedConditions.urlToBe(exptUrl));
		Assert.assertEquals(driver.getCurrentUrl(),exptUrl);

	}


	@AfterMethod
	public void actiLogout() {
		WebElement logOutBtn=driver.findElement(By.xpath("//a[@href='/own1/logout.do']"));
		Assert.assertTrue(logOutBtn.isDisplayed(), "LGTBTN Dispalyaed");
		driver.findElement(By.xpath("//a[@href='/own1/logout.do']")).click();
		driver.close();
		//It will stop execution 
//		Assert.assertFalse(logOutBtn.isDisplayed(), "LGTBTN Dispalyaed");
//		driver.findElement(By.xpath("//a[@href='/own1/logout.do']")).click();
//		driver.close();

	}

	@BeforeClass
	public void beforeClass() {
		bu=new BaseUtilityUpdated();  
		ctr=new Configwithconstr("./PropertiesFile/Actitime.properties");

	}

	@AfterClass
	public void afterClass() {


	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
