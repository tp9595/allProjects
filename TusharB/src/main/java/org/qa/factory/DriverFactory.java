package org.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public static WebDriver driver;
    public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<>();
    //this method is used to initilaza the thradlocal driver on the basis of given driver
    //@param browser
    //@return this return tdriver
    public WebDriver initdriver(String browser)
    {
    	System.out.println("browser value is "+ browser);
    	if (browser.equals("chrome"))
    	{
    	 WebDriverManager.chromedriver().setup();
    	 //tdriver.set(new ChromeDriver());
    	 driver= new  ChromeDriver();
    	 
    	}else
    	{
    		System.out.println("please passmthe correct browser" +browser);
    	}
    
    	getDriver().manage().deleteAllCookies();
    	getDriver().manage().window().maximize();
    	return driver;
    	
   }
    //this is used to get the driver with threadlocal 
    //@return
    //
    public static synchronized WebDriver getDriver()
    {
    	return driver;
    }
}
