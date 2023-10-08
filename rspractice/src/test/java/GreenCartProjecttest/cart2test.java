package GreenCartProjecttest;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GreenCartproject.cart1;

public class cart2test {

	
	//@Test(priority=2)
	void opengreencart(WebDriver driver)
	{
		try 
		{
			
		String url ="https://rahulshettyacademy.com/seleniumPractise/#/";
	       driver.get(url);
		    driver.manage().window().maximize();
		    
	//    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}catch(Exception e)
		{
		  System.out.println(e);
		}
	}
//	void addtocart(	cart1 obj1,WebDriver driver)
//	{
//        obj1.name().click();
//	}
	
	//@Test(priority=3)
	void clickbrocolli(	cart1 obj1,WebDriver driver)
	{
        obj1. clickon().click();
	}
	//@Test(priority=4)
	void clickoncart(	cart1 obj1,WebDriver driver)
	{
        obj1.cart().click();
	}
	//@Test(priority=5)
	void checkout(	cart1 obj1,WebDriver driver)
	{
        obj1.checkout().click();
	}
	//@Test(priority=6)
	void order(	cart1 obj1,WebDriver driver) throws Exception
	{

        obj1.placeorder().click();
	}
	void country(	cart1 obj1,WebDriver driver) throws Exception
	{

        obj1.country().click();
	}
	void india(	cart1 obj1,WebDriver driver) throws Exception
	{

        obj1.india().click();
	}
	void agree(	cart1 obj1,WebDriver driver) throws Exception
	{

        obj1.agree().click();
	}
	//@Test(priority=1)
	void proceed(	cart1 obj1,WebDriver driver) throws Exception
	{

        obj1.proceed().click();
	}
	
	public static void main(String[] args) throws Exception {
	
	  System.setProperty("webdriver.chrome.driver","D:/Users/akshay/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cart2test obj = new cart2test();
		obj.opengreencart(driver);
		
		cart1 obj1 = new cart1(driver);
		//obj.addtocart(obj1, driver);
		obj.clickbrocolli(obj1, driver);
		obj.clickoncart(obj1, driver);
		obj.checkout(obj1, driver);
		obj.order(obj1, driver);
		obj.country(obj1, driver);
		obj.india(obj1, driver);
		obj.agree(obj1, driver);
		obj.proceed(obj1, driver);
		
		
		
	}	
  
  
  }







