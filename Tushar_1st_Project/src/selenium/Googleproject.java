package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googleproject {
	
	public void opendemoq( WebDriver driver)
	{
	String url = "https://www.google.co.in/";
	//	String url = "https://www.redbus.in/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	public void test(WebDriver driver) throws Exception
	{
		//WebElement dev = driver.findElement(By.xpath("//input[contains(@class,'gLFyf gsfi')]"));
		WebElement srstravel = driver.findElement(By.linkText("SRS Travels"));
		//dev.sendKeys("test");
	     // dev.submit();		
	      Thread.sleep(3000);
	//WebElement devi = driver.findElement(By.xpath("//*[contains(@class,'xSQxL HDOrGf')]"));
		
		
	     JavascriptExecutor js =(JavascriptExecutor)driver;
	     js.executeScript("arguments[0].scrollIntoView", srstravel);
	     Thread.sleep(3000);
	     srstravel.click();
	
		
	}
	
	void googleproject ( WebDriver driver) throws Exception
	{
		WebElement dev = driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
		dev.sendKeys("test");
	     dev.submit();	
	     Thread.sleep(3000);
	   WebElement devi = driver.findElement(By.xpath("//*[@class='xSQxL HDOrGf']"));
	     
	     JavascriptExecutor js =(JavascriptExecutor)driver;
	     js.executeScript("arguments[0].scrollIntoView", devi);
	     Thread.sleep(3000);
	     devi.click();
	    
	}
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","D:/Users/akshay/Downloads/chromedriver_win32/chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    Googleproject obj = new Googleproject();
		    obj.opendemoq(driver);
		  //  obj.test(driver);
		    obj.googleproject(driver);
		    
		    
	}

}
