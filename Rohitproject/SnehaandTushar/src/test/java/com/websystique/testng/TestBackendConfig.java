package com.websystique.testng;

import org.selenium_01utilities.ConfigReader;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBackendConfig {
	static ConfigReader cr;
	//static String url;
	@BeforeSuite
    public void beforeSuite() {
		cr = new ConfigReader();
		//url=cr.getPropertyValue("url","./PropertiesFile/Actitime.properties" );
        System.out.println("@BeforeSuite\n");
    }
  
    @AfterSuite
    public void afterSuite() {
    	
        System.out.println("@AfterSuite");
    }
     
    @BeforeTest
    public void beforeTest() {
    	//url=cr.getPropertyValue("url","./PropertiesFile/Actitime.properties" );
        System.out.println("@BeforeTest");
    }
  
    @AfterTest
    public void afterTest() {
        System.out.println("@AfterTest\n");
    }

}
