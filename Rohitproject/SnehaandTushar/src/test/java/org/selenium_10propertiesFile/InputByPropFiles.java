package org.selenium_10propertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selenium_01utilities.BaseUtilityUpdated;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputByPropFiles {


	public static void main(String[] args) {
		BaseUtilityUpdated bObj = new BaseUtilityUpdated();
		FileInputStream fis=null;
		Properties prop =null;
		try {
			//To get the file  
			 fis = new FileInputStream("./PropertiesFile/Config.properties");
			//To perform Read write operation on file
			prop =new Properties();
			//To load the file in propby using fileinputstream object
			prop.load(fis);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Capturing data from properties file in local variable
		//String bName=prop.getProperty("browser_Name");
		String url=(String) prop.get("url");
		//int a =(int) prop.get("ukk");
		String uName=prop.getProperty("userName");
		String passw=prop.getProperty("password");
		
	//	WebDriver driver=bObj.startup(bName,url);
		//or we can directly pass it into the code without capuring in variable
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		//WebDriver driver=bObj.startup("","");
		driver.switchTo().activeElement().sendKeys(prop.getProperty("userName"));
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(prop.getProperty("password"));
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);

	}



}


