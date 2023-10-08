package selenium;

import java.awt.event.WindowEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bookmyshow {
	    
	void bookmy(WebDriver driver) 
	{
		String url  ="https://in.bookmyshow.com/explore/home/pune";
		driver.get(url);
		driver.manage().window().maximize();
		
		
	}
	
	void bkm(WebDriver driver) throws Exception
	{
		//WebElement book = driver.findElement(By.xpath("//*[contains(@class,'sc-kaNhvL jlISnX ellipsis')]"));
		//book.click();
		WebElement book = driver.findElement(By.xpath("//input[contains(@class,'sc-jWojfa eTcNgn')"));
		Thread.sleep(3000);
		book.click();
		book.sendKeys("inox");
	
	
	}
	
	

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/akshay/Downloads/CHROME/chromedriver.exe");
		   // System.setProperty("webdriver.chrome.driver", "D:/java software/chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    Bookmyshow obj = new Bookmyshow ();
		    obj.bookmy(driver);
		    obj.bkm(driver);
		    
		    
	}

}
