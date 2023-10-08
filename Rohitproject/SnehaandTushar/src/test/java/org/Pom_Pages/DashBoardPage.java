package org.Pom_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.selenium_01utilities.BaseUtilityUpdated;

public class DashBoardPage {
	WebDriver driver;
	BaseUtilityUpdated bu;
	//WebEelemet
	@FindBy(css="#logoutLink")
	private WebElement logoutButton;

	public DashBoardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public boolean verifyLogoutButton() {
		return logoutButton.isDisplayed();
	}
	public void doLogout() {
		logoutButton.click();
	}

}
