package org.APPHOOKS;

import java.util.Properties;

import org.baseutilities.ConfigReader;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.qa.factory.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;



public class Apphook {

	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader; 
	Properties prop;
	@Before(order =0)
	public void getProperty()
	{
		configReader = new ConfigReader();
		//prop =((ConfigReader) configReader).initprop();
		prop =configReader.initprop();
		
	}
	
	@Before(order =1)
	public void launchBrowser() 
	{
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver =driverFactory.initdriver(browserName);
		
	}
	
//	@After(order =0)
//	public void quitbroswer()
//	{
//		//driver.quit();
//	}
//	
//	@After(order =1)
//	public void teardown (Scenario sc)
//	{
//		if(sc.isFailed()) {
//			//take screenshot
//			String screenshotname =sc.getName().replaceAll("", "_");
//			byte [] sourcePath =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//			//sc.embed(sourcePath, screenshotname);
//			sc.attach(sourcePath, "image/png", screenshotname);
//					
//		}
//	}
}
