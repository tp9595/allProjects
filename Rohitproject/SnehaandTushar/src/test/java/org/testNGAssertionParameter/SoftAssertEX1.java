package org.testNGAssertionParameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.selenium_01utilities.BaseUtilityUpdated;
import org.selenium_01utilities.Configwithconstr;
import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEX1 {

	WebDriver driver;

	private String bName;
	private String url;
	private String uName;
	private String pwd;
	BaseUtilityUpdated bu;
	Configwithconstr ctr;
	SoftAssert sa;

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
		//WebDriverWait wt =new WebDriverWait(driver,Duration.ofSeconds(20));
		//wt.until(ExpectedConditions.urlToBe(exptUrl));
		sa.assertEquals(driver.getCurrentUrl(), exptUrl);
		
		System.out.println(driver.getCurrentUrl());
		sa.assertAll();
	}


	@Test
	public void actiLogout() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rohitmahaj2480@gmail.com");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("Rohit@2410");
		driver.findElement(By.cssSelector("#loginButton")).click();
		//hard assert
		String exptUrl="https://online.actitime.com/own1/timetrack/enter.do";
		//WebDriverWait wt =new WebDriverWait(driver,Duration.ofSeconds(20));
		//wt.until(ExpectedConditions.urlToBe(exptUrl));
		//sa.assertEquals(driver.getCurrentUrl(), exptUrl);
		
		WebElement logOutBtn=driver.findElement(By.xpath("//a[@href='/own1/logout.do']"));
		
		//It will stop execution 
		sa.assertFalse(logOutBtn.isDisplayed(), "LGTBTN Dispalyaed");
		
		System.out.println("LogOut");
		
		driver.findElement(By.xpath("//a[@href='/own1/logout.do']")).click();
		sa.assertAll();
//		Assert.assertTrue(logOutBtn.isDisplayed(), "LGTBTN Dispalyaed");
//		driver.findElement(By.xpath("//a[@href='/own1/logout.do']")).click();
		//sa.assertAll();
		

	}
	@AfterMethod
	public void closeDriver() {
	//driver.close();	
	}

	@BeforeClass
	public void beforeClass() {
		bu=new BaseUtilityUpdated();  
		ctr=new Configwithconstr("./PropertiesFile/Actitime.properties");
		sa=new SoftAssert();
		
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
