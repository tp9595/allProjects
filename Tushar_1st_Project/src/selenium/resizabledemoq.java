package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class resizabledemoq {
	
	public void opendemoq( WebDriver driver)
	{
		String url = "https://demoqa.com/resizable";
		driver.get(url);
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	
	public void resizable(WebDriver driver)
	{
		WebElement div = driver.findElement(By.xpath("//*[@class='react-resizable-handle react-resizable-handle-se']"));
		
		Actions  act = new Actions(driver) ;
		
		act.clickAndHold(div).moveByOffset(200, 100).release(div).perform();
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver","C:/Users/akshay/Downloads/CHROME/chromedriver.exe");
		   // System.setProperty("webdriver.chrome.driver", "D:/java software/chromedriver.exe");
		 System.setProperty("webdriver.chrome.driver","D:/Users/akshay/Downloads/chromedriver_win32/chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    resizabledemoq obj = new resizabledemoq();
		    obj.opendemoq(driver);
		    obj.resizable(driver);
		    
	}

}
