package org.tetrunner;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class getscreen {
	
	
	void takescreenshot (WebDriver driver)
	{
		String url ="https://www.saucedemo.com/";
	       driver.get(url);
		    driver.manage().window().maximize();
	}
	
	
	void screnshot(WebDriver driver) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File ght = new File(".\\scree\\redbus.jpg");
		FileHandler.copy(src, ght);
				
	}
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/Users/akshay/Downloads/chromedriver_win32/chromedriver.exe");
		   // System.setProperty("webdriver.chrome.driver", "D:/java software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		getscreen bj = new getscreen();
	   bj.screnshot(driver);
	   bj.takescreenshot(driver);
	   
		
		
	}

}
