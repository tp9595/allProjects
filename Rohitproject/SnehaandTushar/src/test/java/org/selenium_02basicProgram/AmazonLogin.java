package org.selenium_02basicProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenium_01utilities.Generic_Method;

public class AmazonLogin {
	static WebDriver driver;//null
	static WebDriverWait wt;
	
		public static void main(String[] args) throws InterruptedException {
		AmazonLogin AObj =new  AmazonLogin();
		Generic_Method gObj = new Generic_Method ();
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver= new ChromeDriver();//upcasting 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String url ="https://www.amazon.in/";
		driver.get(url);
		//gObj.waitForVisibilityOfElement(driver,5,(By.xpath("//div[@id='nav-signin-tooltip']//span")));
		driver.findElement(By.xpath("//div[@id='nav-signin-tooltip']//span")).click();		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rohitmahaj24@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Rohit@2410");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		WebElement frLGT=driver.findElement(By.xpath("//a[@href='https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn']"));
		
		Actions act =new Actions(driver);
		act.moveToElement(frLGT).perform();
		
		//wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='nav_prefetch_yourorders']/span\")")));
		driver.findElement(By.xpath("//a[@id='nav_prefetch_yourorders']/span")).click();
		driver.findElement(By.xpath("//a[@id='a-autoid-2-announce']")).click();
		driver.findElement(By.xpath("//a[text()='See all updates']")).click();
		wt=new WebDriverWait(driver,Duration.ofSeconds(20));
		wt.ignoring(TimeoutException.class).until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='a-icon a-icon-close']")));
		wt.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='a-icon a-icon-close']"))));
		driver.findElement(By.xpath("//i[@class='a-icon a-icon-close']")).click();
	
		driver.findElement(By.xpath("//a[@href='/ref=nav_logo']")).click();
		//gObj.waitForVisibilityOfElement(driver,40,(By.xpath("//a[@href='https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn']")));
		
		WebElement signOut = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		act.moveToElement(signOut).perform();
		driver.findElement(By.xpath("//a[@id='nav-item-signout']")).click();
	
	}
}