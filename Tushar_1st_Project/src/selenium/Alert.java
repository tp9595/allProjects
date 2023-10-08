package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
    void alert1(WebDriver driver)
    {
    	//String url ="https://rahulshettyacademy.com/AutomationPractice/";
    	String url ="https://demoqa.com/alerts";
    	driver.navigate().to(url);
    	
    }
	void alert2 (WebDriver driver) throws InterruptedException
	{
		WebElement alt = driver.findElement(By.id("alertbtn"));
		//WebElement alt = driver.findElement(By.id("timerAlertButton"));
		alt.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		//driver.switchTo().defaultContent()
		Thread.sleep(3000);
		
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","D:/Users/akshay/Downloads/chromedriver_win32/chromedriver.exe");
		   // System.setProperty("webdriver.chrome.driver", "D:/java software/chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    Alert obj = new  Alert();
		    obj.alert1(driver);
		    obj.alert2(driver);
	}

}
