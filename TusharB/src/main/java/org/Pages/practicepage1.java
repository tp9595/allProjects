package org.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class practicepage1 {

	private WebDriver driver;
	
	private By mobile = By.xpath("//li[@class='level0 nav-1 first']");
	
	
	
	
	
	public	practicepage1 ( WebDriver driver)
	{
		this.driver = driver;
	}
	//li[@class='level0 nav-1 first']
	
	public void clickonmobile()
	{
		driver.findElement(  mobile ).click();
	}
	
	public String gettitle()
	{
		return driver.getTitle();
	}
}
