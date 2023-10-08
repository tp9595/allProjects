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
//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Parameter {

	WebDriver driver;

	private String bName;
	private String url;
//	private String uName;
//	private String pwd;
	BaseUtilityUpdated bu;
	Configwithconstr ctr;
	SoftAssert sa;

	@BeforeMethod
	public void actiLogin() {
		bName=ctr.getPropertyValue("browserNameCH");
		url=ctr.getPropertyValue("url");
		driver= bu.startup(bName, url); 

	}
	
	@Parameters({"userName","password"})
	@Test
	public void verifyLogin(String uName,String pwd) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uName);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pwd);
		driver.findElement(By.cssSelector("#loginButton")).click();
		//hard assert
		String exptUrl="https://online.actitime.com/own1/timetrack/enter.do";
		WebDriverWait wt =new WebDriverWait(driver,Duration.ofSeconds(20));
		wt.until(ExpectedConditions.urlToBe(exptUrl));
		sa.assertEquals(driver.getCurrentUrl(), exptUrl);
		
		System.out.println(driver.getCurrentUrl());
		sa.assertAll();
	}

	@Parameters({"userName","password"})
	@Test
	public void actiLogout(String uName,String pwd) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uName);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pwd);
		driver.findElement(By.cssSelector("#loginButton")).click();
		//hard assert
		String exptUrl="https://online.actitime.com/own1/timetrack/enter.do";
		WebDriverWait wt =new WebDriverWait(driver,Duration.ofSeconds(20));
		wt.until(ExpectedConditions.urlToBe(exptUrl));
		sa.assertEquals(driver.getCurrentUrl(), exptUrl);
		sa.assertAll();
		

	}
	@AfterMethod
	public void closeDriver() {
	driver.close();	
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
