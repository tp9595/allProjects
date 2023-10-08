package org.testNG1;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenium_01utilities.BaseUtilityUpdated;
import org.selenium_01utilities.Configwithconstr;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActiTimeLoginWithAssertion {
	String bName;
	String url;
	String uName;
	String password;
	Configwithconstr cfc;
	BaseUtilityUpdated bu ;
	WebDriver driver;
	@Test
	public void verifyTitle() {
		System.out.println("Veryfying Title....");
		String expetitle="actiTIME - Enter Time-Track";
		
		//Assert.assertEquals(actualtitle, expetitle);
		WebDriverWait wt =new WebDriverWait(driver,Duration.ofSeconds(5));
		wt.until(ExpectedConditions.titleIs(expetitle));
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle,expetitle);	
	}
	@Test
	public void verifyUrl() {
		System.out.println("Veryfying Url");
		String expectedUrl="https://online.actitime.com/own1/timetrack/enter.do";
		
		WebDriverWait wt =new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wt.until(ExpectedConditions.urlToBe(expectedUrl));
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl,expectedUrl);
		
	}
	@BeforeMethod
	public void beforeMethod() {
		bu=new BaseUtilityUpdated(); 
		driver=bu.startup(bName, url);
		driver.findElement(By.cssSelector("#username")).sendKeys(uName);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(password);
		driver.findElement(By.cssSelector("#loginButton")).click();
	}

	@AfterMethod
	public void afterMethod() {
		driver.findElement(By.xpath("//a[@href='/own1/logout.do']")).click();
		driver.close();
	}

	@BeforeClass
	public void getDataAndLaunchBrowser() {

		cfc=new Configwithconstr("./PropertiesFile/Actitime.properties");
		bName=cfc.getPropertyValue("browserName");
		url=cfc.getPropertyValue("url");
		uName=cfc.getPropertyValue("userName");
		password=cfc.getPropertyValue("password");
	}

	@AfterClass
	public void afterClass() {

		
	}

}
