package org.testNG1;

import java.io.PrintStream;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenium_01utilities.BaseUtilityUpdated;
import org.selenium_01utilities.ConfigReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ActiTimeLoginLogoutUsingMethodAndSuite {
	private WebDriver driver;
	String bName;
	String url;
	String uName;
	String password;
	WebDriverWait wt;

	@BeforeSuite
	public void readData() {

		ConfigReader cf = new ConfigReader();
		url=cf.getPropertyValue("url","./PropertiesFile/Actitime.properties");
		bName=cf.getPropertyValue("browserName","./PropertiesFile/Actitime.properties");
		uName=cf.getPropertyValue("userName","./PropertiesFile/Actitime.properties");
		password=cf.getPropertyValue("password","./PropertiesFile/Actitime.properties");
	}
	@BeforeMethod
	public void actiLogin() {

		BaseUtilityUpdated bu = new BaseUtilityUpdated();
		//driver=bu.startup(bName, url);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.cssSelector("#username")).sendKeys(uName);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(password);
		driver.findElement(By.cssSelector("#loginButton")).click();
		//System.out.println(driver.getTitle());


	}
	@Test
	public void verifyUrl() throws InterruptedException {
		System.out.println("Veryfying URL....");
		String expeurl="https://online.actitime.com/own1/administration/manage_licenses.do";
		wt = new WebDriverWait(driver,Duration.ofSeconds(5));
		if(wt.until(ExpectedConditions.urlToBe(expeurl))) {
			System.out.println("URL is mathced");
		}else {
			System.out.println("URl is not matched");
		}
	}
	@Test
	public void verifyTitle() throws InterruptedException {
		System.out.println("Veryfying Title....");
		String expetitle="actiTIME - Licenses";
		//		
		//		wt.until(ExpectedConditions.titleIs(title));
		//		//Thread.sleep(10000);
		//		System.out.println(driver.getTitle());
		//		if(title.equals(driver.getTitle())) {
		//			System.out.println("Title Matched");
		//		}else {
		//			System.out.println("Title not matched");
		//		}
		wt=new WebDriverWait(driver,Duration.ofSeconds(5));
		if(wt.until(ExpectedConditions.titleContains(expetitle))){

			System.out.println("Title Matched");
		}else {
			System.out.println("Title not matched");
		}

	}
	@AfterMethod
	public void actiLogout() {
		driver.findElement(By.xpath("//a[@href='/own1/logout.do']")).click();
		//driver.quit();
	}
	@AfterSuite
	public void tearDown() {
		System.out.println("After Suite is Executing");
		//Its closing only one browser
		driver.quit();
		//((PrintStream) driver).flush();not workin
		
	}

}