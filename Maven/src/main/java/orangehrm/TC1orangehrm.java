package orangehrm;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC1orangehrm {
	WebDriver driver;
	
	@BeforeTest
	void setup() {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
   }
	@Test
	public WebElement lunch()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement gh =driver.switchTo().activeElement().sendKeys("Admin");
		Actions act = new Actions(driver);
		act.sendKeys(element,message).perform(); 
		driver.switchTo().activeElement().sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	}
//	@Test
//	public void login()
//	{
//		driver.switchTo().activeElement().sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//input[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
//		
//	}
	@Test
	public void getturl()
	{
		String url =driver.getCurrentUrl();
	}
	
	@Test
	public void gettitle()
	{
		String gh=driver.getTitle();
	}
	
	
	
}
