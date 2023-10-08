package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tryandcatchpractice {
	   void openwebpage( WebDriver driver) 
	   {
		   try
		   {
			   String url ="https://rahulshettyacademy.com/AutomationPractice/";
			   driver.get(url);
			   driver.manage().window().maximize();
			   
		   }catch(Exception e)
		   {
			   System.out.println(e);
		   }
	   }
	   void radio1(WebDriver driver)
	   {
		   try
		   {
			  WebElement radione = driver.findElement(By.xpath("//input[@value='radio1']"));
			  radione.click();
			   
		   }catch(Exception e)
		   {
			   System.out.println(e);
		 }
	   }
	   void radio2(WebDriver driver)
	   {
		   try
		   {
			   WebElement radione = driver.findElement(By.xpath("//*[contains(@value,'radio2')]"));
				  radione.click();
			   
		   }catch(Exception e)
		   {
			   System.out.println(e);
		   }
	   }
	   void radio3(WebDriver driver)
	   {
		   try
		   {
			   WebElement radiothree = driver.findElement(By.xpath("//*[starts-with(@value,'radio3')]"));
			   radiothree.click();
			   
			   
		   }catch(Exception e)
		   {
			   System.out.println(e);
		   }
	   }
	  
	   
	   
	void closewebpage(WebDriver driver)
	{
		 try
		   {
			  driver.close();
			   
		   }catch(Exception e)
		   {
			   System.out.println(e);
           }
	}
	
	
	

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		   System.setProperty("webdriver.chrome.driver","C:/Users/akshay/Downloads/CHROME/chromedriver.exe");
		   // System.setProperty("webdriver.chrome.driver", "D:/java software/chromedriver.exe");
		  //we have created object of web which is used to control the browser
		   WebDriver driver = new ChromeDriver();
		    tryandcatchpractice obj = new tryandcatchpractice();
		    obj.openwebpage(driver);
		    obj.radio1(driver);
		    Thread.sleep(2000);  //to take apause in script
     	    obj.radio2(driver);
     	   Thread.sleep(2000); 
	        obj.radio3(driver);
		    obj.closewebpage(driver);
	}

}
