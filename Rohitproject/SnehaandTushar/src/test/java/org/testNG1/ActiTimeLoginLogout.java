package org.testNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selenium_01utilities.BaseUtilityUpdated;
import org.selenium_01utilities.ConfigReader;
import org.testng.annotations.Test;

public class ActiTimeLoginLogout {
	WebDriver driver;
	@Test
	public void actiLogin() {
		
		ConfigReader cr =new ConfigReader();
		String capurl=cr.getPropertyValue("url","./PropertiesFile/Actitime.properties");
		String capbName=cr.getPropertyValue("browserName", "./PropertiesFile/Actitime.properties");
		String capuName=cr.getPropertyValue("userName","./PropertiesFile/Actitime.properties");
		String cappassword=cr.getPropertyValue("password","./PropertiesFile/Actitime.properties");
		
		BaseUtilityUpdated bu = new BaseUtilityUpdated();
		//driver=bu.startup(capbName, capurl);
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(capurl);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#username")).sendKeys(capuName);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(cappassword);
		driver.findElement(By.cssSelector("#loginButton")).click();
	
		}
	@Test
	public void actiLogout() {
		driver.findElement(By.xpath("//a[@href='/own1/logout.do']")).click();
	}

}
