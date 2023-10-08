package org.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.qa.factory.DriverFactory;

public class Homepage1 {

	private WebDriver driver;
	
	
	private By clickontshirt =By.id("add-to-cart-sauce-labs-backpack");
	
	private By clickonsecondtshirt =By.id("add-to-cart-sauce-labs-bolt-t-shirt");
	
	public Homepage1(WebDriver driver)
	{
		this.driver= driver;
	}
	
	
	public String gethomepagetitle()
	{
		return driver.getTitle();
	}
	
	public void getclickontshirt()
	{
		driver.findElement(clickonsecondtshirt).click();;
	}
	
	public void getclickonsecondtshirt()
	{
		driver.findElement(clickonsecondtshirt).click();;
	}
	
	
}
