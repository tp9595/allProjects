package Objectrepo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRe.Loginpage;

public class saucedemotest {
 
	void opensaucedemo(WebDriver driver)
	{
		String url ="https://www.saucedemo.com/";
	       driver.get(url);
		    driver.manage().window().maximize();
		//    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
  
	void testusername(Loginpage objElement,WebDriver driver)
	{
		objElement.userName().sendKeys("test");
	}
	
	
	void passwordtest(Loginpage objElement,WebDriver driver)
	{
		objElement.Password().sendKeys("test");
	}
	
	void login(Loginpage objElement,WebDriver driver)
	{
		objElement.login().click();
	}
	
	
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:/Users/akshay/Downloads/chromedriver_win32/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			saucedemotest obj = new saucedemotest();
			obj.opensaucedemo(driver);
			Loginpage objElement = new Loginpage(driver);
			obj.testusername(objElement, driver);
			obj.passwordtest(objElement, driver);
			obj.login(objElement, driver); 
	}
	
	
}
