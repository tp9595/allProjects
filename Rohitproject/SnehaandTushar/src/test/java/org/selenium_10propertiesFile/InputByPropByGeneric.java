package org.selenium_10propertiesFile;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.selenium_01utilities.BaseUtilityUpdated;
import org.selenium_01utilities.Configwithconstr;

public class InputByPropByGeneric {


	public static void main(String[] args) {
		BaseUtilityUpdated bObj = new BaseUtilityUpdated();
//		FileInputStream fis=null;
//		Properties prop =null;
//		try {
//			//To get the file  
//			 fis = new FileInputStream("./PropertiesFile/Config.properties");
//			//To perform Read write operation on file
//			prop =new Properties();
//			//To load the file in propby using fileinputstream object
//			prop.load(fis);
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}//Capturing data from properties file in local variable
//		String bName=prop.getProperty("browser_Name");
//		String url=prop.getProperty("url");
//		String uName=prop.getProperty("userName");
//		String passw=prop.getProperty("password");
//		
//		WebDriver driver=bObj.startup(bName,url);
//		//or we can directly pass it into the code without capuring in variable
//
//		//WebDriver driver=bObj.startup("","");
//		driver.switchTo().activeElement().sendKeys(prop.getProperty("userName"));
//		driver.switchTo().activeElement().sendKeys(Keys.TAB);
//		driver.switchTo().activeElement().sendKeys(prop.getProperty("password"));
//		driver.switchTo().activeElement().sendKeys(Keys.ENTER);

		//With Generic method
		//ConfigReader cfd=new ConfigReader();
		Configwithconstr cfdctr =new Configwithconstr("./PropertiesFile/Config.properties");
//		String bName=cfd.getPropertyValue("browser_Name","./PropertiesFile/Actitime.properties");
//		System.out.println(bName);
//		
//		String url =cfd.getPropertyValue("url","./PropertiesFile/Config.properties");
//		System.out.println(url);
		String bName = cfdctr.getPropertyValue("browser_Name");
		String url =cfdctr.getPropertyValue("url");
		
		WebDriver driver=bObj.startup(bName,url);
		driver.switchTo().activeElement().sendKeys(cfdctr.getPropertyValue("userName"));
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(cfdctr.getPropertyValue("password"));
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		
		
		
		
	}



}