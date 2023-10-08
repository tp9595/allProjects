package Hooks;

import java.util.Properties;

import org.baseutilities.ConfigReader;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.qa.factory.DriverFactory;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hookssaucedemo {
	
	
	@Before(order =0)
	public void getProperty()
	{
		System.out.println("1 st before hooks");
		
		
	}
	
	@Before(order =1)
	public void launchBrowser() 
	{
		System.out.println("2 nd  before hooks");
		
	}
	
	@After(order =0)
	public void quitbroswer()
	{
		System.out.println("1 st after hooks");
		//driver.quit();
	}
	
	@After(order =1)
	public void teardown (Scenario sc)
	{
		System.out.println("2nd  after hooks");
	}
}
