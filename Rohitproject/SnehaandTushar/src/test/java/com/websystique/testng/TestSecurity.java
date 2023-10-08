package com.websystique.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSecurity {
	
	TestBackendConfig tb =new TestBackendConfig();
	String url;
	@BeforeClass 
	public void get_data() {
		url=tb.cr.getPropertyValue("url","./PropertiesFile/Actitime.properties");
	}
	
	
	@Test(groups= "security")
	public void accessHomePage() {
		
		System.out.println(url);
		System.out.println("accessHomePage()");
	}

	@Test(groups= "security")
	public void accessAdminPage() {
		System.out.println("accessAdminPage()");
	}

}
