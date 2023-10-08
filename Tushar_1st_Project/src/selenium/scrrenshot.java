package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


//
//import java.io.File;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.io.FileHandler;


public class scrrenshot {
	
	void takescreenshot (WebDriver driver)
	{
		String url ="https://rahulshettyacademy.com/seleniumPractise/#/";
	       driver.get(url);
		    driver.manage().window().maximize();
	}
	
	
	void screnshot(WebDriver driver) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File ght = new File(".\\screensh\\tusharaa.png");
		FileHandler.copy(src, ght);
				
	}
	
	void scrrenshotmethod(WebDriver driver)
	{//source
		int i =10;
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try
		{
			//FileUtils.copyFile();  we used it till java 8 but now we dont use it.
			FileHandler.copy(f, new File("C:/Users/akshay/Desktop/myscreeshot/failTestCase"+i+"i.jpg"));
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/Users/akshay/Downloads/chromedriver_win32/chromedriver.exe");
		   // System.setProperty("webdriver.chrome.driver", "D:/java software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		 scrrenshot  obj = new  scrrenshot();
		 obj.takescreenshot(driver);
		// obj.scrrenshotmethod(driver);
	
	
	
	
	}

}
