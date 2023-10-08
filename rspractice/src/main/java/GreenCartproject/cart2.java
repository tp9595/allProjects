package GreenCartproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cart2 {
	WebDriver driver;
	 public cart2(WebDriver driver)
	{
		  this.driver = driver;
	}
	By country = By.xpath("//option[@value='India'");
	public WebElement country ()
	  {
		  return driver.findElement(By.xpath("//div[@style='width: 360px; margin: 10px auto;']"));
	    
	 }
	public WebElement india()
	  {
		  return driver.findElement(By.xpath("//option[@value='India']"));
	    
	 }
	public WebElement agree()
	  {
		  return driver.findElement(By.xpath("//input[@class='chkAgree']"));
	    
	 }
	public WebElement proceed() throws Exception
	  {
		Thread.sleep(3000);
		  return driver.findElement(By.xpath("//button[text()='Proceed']"));
	    
	 }
	
}
