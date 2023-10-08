package GreenCartproject;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cart1 {
WebDriver driver;

public cart1(WebDriver driver)
{
	  this.driver = driver;
}

By clickon = By.xpath("(//button[@type='button'])[2]");
	public WebElement  clickon  ()
	  {
		  return driver.findElement( clickon );
	  }
	By cart = By.xpath("//*[@class ='cart-icon']");
	public WebElement cart ()
	  {
		  return driver.findElement(cart);
	  }
	By checkout = By.xpath("//button[(text()='PROCEED TO CHECKOUT')]");
	public WebElement checkout ()
	  {
		  return driver.findElement(checkout);
	  }
	
	

	
	//By placeorder = By.xpath("//button[(text()='Place Order')]");
	
	public  WebElement   placeorder() throws Exception
	  {
		Thread.sleep(3000);
//         WebDriverWait et = new WebDriverWait(driver,Duration.ofSeconds(30));
//         et.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[(text()='Place Order')]")));
		  return driver.findElement(By.xpath("//*[(text()='Place Order')]"));
	  }

	//By country = By.xpath("//div[@style='width: 360px; margin: 10px auto;']");
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
	
	
	
}//button[@xpath='1']
