package TestcasePack;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import studyglobaltest.studypageobject;

public class Testcase1 extends Baseclass1 {
	
    @Test
	public void logintest1()
	{
		driver.get(urlee);
//	logger.info("url is opened");
		studypageobject rtus = new studypageobject(driver);
	   rtus.setusename(userName);
	   rtus.setpassword(Password);
	   rtus.loginbuttton();
	  // rtus.loginbut();
	 //  javautlilclass.clickelement(rtus, driver);
	  // rtus.loginbut();
//	   Actions act = new Actions(driver);
//	  
//	act.moveToElement(rtus.loginbuttton()).perform();
//	   
	   
	   
	   if (driver.getTitle().equals("Swag Labs")) 
	   {
		   
		   Assert.assertTrue(true);
			//logger.info("url is opened");
	   }else
	   {
		   Assert.assertTrue(false);
	   }
	}
	
	
}
