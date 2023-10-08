package org.Pom_TestCases;

import org.Pom_Pages.DashBoardPage;
import org.Pom_Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.selenium_01utilities.BaseUtilityUpdated;
import org.selenium_01utilities.Configwithconstr;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTestCases {
	BaseUtilityUpdated bu;
	Configwithconstr cr;
	WebDriver driver;
	private String bName; 
	private String url;
	private String uName;
	private String pwd; 
	DashBoardPage db_pg;
	LoginPage ln_pg;
	@BeforeSuite
	public void beforeSuite() {
		
		bu=new BaseUtilityUpdated();
		cr=new Configwithconstr("./PropertiesFile/Actitime.properties");
		bName=cr.getPropertyValue("browserNameCH");
		url=cr.getPropertyValue("url");
		uName=cr.getPropertyValue("userName");
		pwd=cr.getPropertyValue("password");
		

	}
	@BeforeMethod
	public void beforeMethod() {
		driver=bu.startup(bName, url);
		db_pg=new DashBoardPage(driver);
		ln_pg=new LoginPage(driver);	
	}
	@Test
	public void validateLogin() {
		ln_pg.doLogin();
		Assert.assertTrue(db_pg.verifyLogoutButton());
		
		Reporter.log("Login Successfully Completed");
		//db_pg.doLogout();
		//Assert.assertTrue(ln_pg.verifyuserNameInputFieldIsPresent());
		
	}

	@Test
	public void verifyLoginFields() {
		Assert.assertTrue(ln_pg.verifyuserNameInputFieldIsPresent());
		Assert.assertTrue(ln_pg.verifypwdInputFieldIsPresent());
		Assert.assertTrue(ln_pg.verifykeepMeLoginChBoxIsPresent());
		Assert.assertTrue(ln_pg.verifykeepMeLoginChBoxIsEnabled());
		
		Reporter.log("Login fileds are Verified Successfully");
		//driver.switchTo().newWindow(WindowType.TAB);
		
	}//Successfully

	@AfterMethod
	public void afterMethod() throws InterruptedException {
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://google.com");
//		driver.close();
//		Thread.sleep(2000);
//		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.quit();
		boolean hasQuit=driver.toString().contains(("null"));
		System.out.println(hasQuit);
	}

	@AfterSuite
	public void afterSuite() {
	}

}
