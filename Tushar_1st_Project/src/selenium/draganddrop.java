package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	void firstmethod1(WebDriver driver)
	{
		String url = "https://jqueryui.com/selectable/";
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
void draganddrop2(WebDriver driver)
{
	WebElement frame =driver.findElement(By.xpath("//*[contains(@class,'demo-frame')]"));
	driver.switchTo().frame(frame);
	
	WebElement drag = driver.findElement(By.xpath("//*[text()='Item 1']"));
			
	WebElement drop = driver.findElement(By.xpath("//*[text()='Item 7']"));
	
	Actions act = new Actions(driver);
	act.dragAndDrop(drag, drop).build().perform();
	
	
}
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/akshay/Downloads/CHROME/chromedriver.exe");
		   // System.setProperty("webdriver.chrome.driver", "D:/java software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			  draganddrop obj = new draganddrop();
			  obj.firstmethod1(driver);
			  obj.draganddrop2(driver);
			  
	
	
	
	}

}
