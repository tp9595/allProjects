package org.testNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium_01utilities.BaseUtilityUpdated;
import org.selenium_01utilities.ConfigReader;
import org.testng.annotations.Test;

public class VerifyActiTimeLogin {

	@Test
	public void actiLogin() {
		
		ConfigReader cr =new ConfigReader();
		String capurl=cr.getPropertyValue("url","./PropertiesFile/Actitime.properties");
		String capbName=cr.getPropertyValue("browserName", "./PropertiesFile/Actitime.properties");
		String capuName=cr.getPropertyValue("userName","./PropertiesFile/Actitime.properties");
		String cappassword=cr.getPropertyValue("password","./PropertiesFile/Actitime.properties");
		
		BaseUtilityUpdated bu = new BaseUtilityUpdated();
		WebDriver driver=bu.startup(capbName, capurl);
		
		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get(capurl);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#username")).sendKeys(capuName);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(cappassword);
		driver.findElement(By.cssSelector("#loginButton")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
	}
}
