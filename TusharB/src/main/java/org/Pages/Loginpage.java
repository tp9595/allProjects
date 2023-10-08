package org.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
private WebDriver driver;


//By locator
private By username = By.id("user-name");
private By PASSWORD = By.id("password");
private By BUTTON = By.id("login-button");
//CONSTRUCTOR 
public	Loginpage( WebDriver driver)
	{
		this.driver = driver;
	}
//page actions
public String gettitle()
{
	return driver.getTitle();
}

public void isforgotpwdlinkexist()
{
	driver.getTitle();
}

public void enterusername(String userna)
{
	driver.findElement(username).sendKeys(userna);
}

public void enterpassword(String pwd)
{
	driver.findElement(PASSWORD ).sendKeys(pwd);
}
public void enterbutton()
{
	driver.findElement( BUTTON ).click();
}

public Homepage1 dologin(String un, String ped)
{
	driver.findElement(username).sendKeys(un);
	driver.findElement(PASSWORD ).sendKeys(ped);
	driver.findElement( BUTTON ).click();
	return new Homepage1(driver);
}
}