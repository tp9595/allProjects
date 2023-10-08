package org.testNgITestListnerStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium_01utilities.BaseUtilityUpdated;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(AppListners.class)
public class ListnerAppliedOnclass {

	BaseUtilityUpdated bu;
	WebDriver driver;
	@Test(priority=0)
	public void closeBrowser() {
		driver.close();
	}
	@Test(priority=1)
	public void enterUsername() {
		driver.findElement(By.id("username")).sendKeys("Rohit");
	}
	@Test(priority=2,dependsOnMethods="enterUsername")
	public void enterPassword() {
		driver.findElement(By.id("username")).sendKeys("Rohit");
	}
	private static int i=0;
	@Test(priority=4,successPercentage=90, invocationCount=5)
	public void forPercentageCount() {
		if(i<=3) {//0,1,2,3
			Assert.assertTrue(i<=2);//0,1,2
		}i++;
	}
	@BeforeClass
	public void startBrowser() {
		bu=new BaseUtilityUpdated();
		driver=bu.startup("CH","https://online.actitime.com/own1/login.do");  

	}




}
