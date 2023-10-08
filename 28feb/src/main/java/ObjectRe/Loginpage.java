package ObjectRe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumutil.Utilfiles;

public class Loginpage extends Utilfiles {
WebDriver driver;  //GLOBAL DRIVER
	public Loginpage (WebDriver driver)
	{
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-name")
	private WebElement userNameInputField;
	
	@FindBy(id="password")
	private WebElement pwdInputField;
	@FindBy(id="login-button")
	private WebElement loginButton;
	
	public void login(String userName, String pwd)
	{
		typeInput(userNameInputField ,userName);
		typeInput(userNameInputField ,pwd);
		clickonElement(loginButton);
	}
	
	
	
	
	
	
	
	
	
	By userName =By.id("user-name");
	
	 public WebElement userName()
	
	{
		return driver.findElement(userName);
	}
			
	 By Password =By.id("password");

	 public WebElement Password ()
		
		{
			return driver.findElement(Password);
		}

	 By login =By.id("login-button");

	 public WebElement login ()
		
		{
			return driver.findElement(login);
		}

}
