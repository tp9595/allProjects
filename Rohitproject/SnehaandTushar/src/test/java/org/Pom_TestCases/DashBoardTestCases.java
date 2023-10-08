package org.Pom_TestCases;

import org.Pom_Pages.DashBoardPage;
import org.Pom_Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.selenium_01utilities.BaseUtilityUpdated;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashBoardTestCases {
	WebDriver driver;
	BaseUtilityUpdated bu;
	DashBoardPage dbpg;
	LoginPage lpg;
	@BeforeMethod
	public void doLogin() {
		bu= new BaseUtilityUpdated();
		driver=bu.startup("CH","https://online.actitime.com/own1/login.do");
		dbpg=new DashBoardPage(driver);
		lpg=new LoginPage(driver);
		lpg.doLogin();
		
	}
	
	@Test
	public void verifyDashBoard() {
		
		Assert.assertTrue(dbpg.verifyLogoutButton());
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
