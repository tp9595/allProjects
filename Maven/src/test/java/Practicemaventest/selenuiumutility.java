package Practicemaventest;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class selenuiumutility {

	WebDriver driver;
	public static WebDriver setUp(String browser,String url)
	
	{
		WebDriver driver= null;
		if(browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		
		}
		
		driver.manage().window().maximize();
		
		driver.get(url);
		return  driver;
	}
	
	
	
}
