package org.Pom_Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.selenium_01utilities.BaseUtilityUpdated;

public class LoginPage {
	WebDriver driver;
	BaseUtilityUpdated bu;
	//WebElements
	@FindBy(xpath="//input[@name='username']")
	private WebElement userNameInputField; 

	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pwdInputField;

	@FindBy(css="#loginButton")
	private WebElement loginButton;

	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepMeLoginChBox;

	@FindBy(css="#logoContainer>div>div")
	private List <WebElement> logosOnloginPg;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		//PageFactory.initElements(driver,LoginPage.class);
		PageFactory.initElements(driver,this);
	}
	public boolean verifyuserNameInputFieldIsPresent() {
		boolean flag=userNameInputField.isDisplayed();
		return flag;
	}
	
	public boolean verifypwdInputFieldIsPresent() {
		return pwdInputField.isDisplayed();
		// boolean flag=userNameInputField.isDisplayed();
		//return flag;
	}
	public boolean verifloginButtonIsPresent() {
		return loginButton.isDisplayed();
		
	}
	public boolean verifykeepMeLoginChBoxIsPresent() {
		return keepMeLoginChBox.isDisplayed();
		
	}
	public boolean verifykeepMeLoginChBoxIsEnabled() {
		return userNameInputField.isEnabled();
		
	}
	public boolean verifylogosPresentonloginPg() {
		
		if(logosOnloginPg.size()==2) {
			return true;
		}
		return false;
		}
	public void enterUserName() {
		userNameInputField.sendKeys("rohitmahaj2480@gmail.com");
	}
	public void enterPassword() {
		pwdInputField.sendKeys("Rohit@2410");
	}
	public void clickOnLoginBtn() {
		loginButton.click();
	}
	
	public void doLogin() {
//		userNameInputField.sendKeys("rohitmahaj2480@gmail.com");
//		pwdInputField.sendKeys("Rohit@2410");
//		loginButton.click();
		enterUserName();
		enterPassword();
		clickOnLoginBtn();
		
	}
	
}
