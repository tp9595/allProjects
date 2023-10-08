package org.testNG1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ActTimeLoginLogoutUsingSuit {
	WebDriver driver;
	String url;
	String bName;
	String userName;
	String password;
	@BeforeSuite
	public void readData() throws IOException {
		FileInputStream fis = new FileInputStream("./PropertiesFile/Actitime.properties");
		Properties prop=new Properties();
		prop.load(fis);
		url=prop.getProperty("url");
		bName=prop.getProperty("browserName");
		userName=prop.getProperty("userName");
		password =prop.getProperty("password");
	}
	@Test
	public void actiLogin() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver ();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#username")).sendKeys(userName);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(password);
		driver.findElement(By.cssSelector("#loginButton")).click();
		
		
	}
	@Test
	public void actiLogout() {
	WebDriverWait wt =new WebDriverWait(driver,Duration.ofSeconds(10));	
	wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/own1/logout.do']")));
	driver.findElement(By.xpath("//a[@href='/own1/logout.do']")).click();
	}
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}