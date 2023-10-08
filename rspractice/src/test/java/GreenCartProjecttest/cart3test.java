package GreenCartProjecttest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import GreenCartproject.cart2;

public class cart3test {

	void country(	cart2 obj1,WebDriver driver) throws Exception
	{

        obj1.country().click();
	}
	void india(	cart2 obj1,WebDriver driver) throws Exception
	{

        obj1.india().click();
	}
	void agree(	cart2 obj1,WebDriver driver) throws Exception
	{

        obj1.agree().click();
	}
	//@Test(priority=1)
	void proceed(	cart2 obj1,WebDriver driver) throws Exception
	{

        obj1.proceed().click();
	}
	
	public static void main(String[] args) throws Exception {
	
	  System.setProperty("webdriver.chrome.driver","D:/Users/akshay/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cart3test obj = new cart3test();
	//	obj.opengreencart(driver);
		
		cart2 obj1 = new cart2(driver);
		//obj.addtocart(obj1, driver);
		
		obj.country(obj1, driver);
		obj.india(obj1, driver);
		obj.agree(obj1, driver);
		obj.proceed(obj1, driver);
		
		
		
	}	
  
	
	
	
	
	
	
}
