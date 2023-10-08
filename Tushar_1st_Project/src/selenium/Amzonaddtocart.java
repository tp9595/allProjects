package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amzonaddtocart {
	
	
	void loginurl(WebDriver driver)
	{
		String url = "https://www.amazon.in/Allen-Solly-Regular-AMKP317G04241_Spinus-Yellow_X-Large/dp/B06Y2BHR2W/ref=sr_1_1_sspa?crid=2GK722IRRMNXL&keywords=t%2Bshirt%2Bfor%2Bmen&qid=1653476729&sprefix=t%2Caps%2C1756&sr=8-1-spons&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUFUVEJCTVRCRTNJRzQmZW5jcnlwdGVkSWQ9QTA0NTI0NTYxM1pJTFBFTEo2U0xLJmVuY3J5cHRlZEFkSWQ9QTAzODQyNjUyNDhVUU5ZOFlPRDRWJndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ&th=1&psc=1";
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	}
	
	void addtocart(WebDriver driver)
	{
		WebElement cart =driver.findElement(By.id("add-to-cart-button"));
		cart.click();
	    WebElement mart = driver.findElement(By.id("nav-cart-count"));
	    mart.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/akshay/Downloads/CHROME/chromedriver.exe");
		   // System.setProperty("webdriver.chrome.driver", "D:/java software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			Amzonaddtocart obj = new Amzonaddtocart();
			obj.loginurl(driver);
			obj.addtocart(driver);
			
		
		
	}

}
