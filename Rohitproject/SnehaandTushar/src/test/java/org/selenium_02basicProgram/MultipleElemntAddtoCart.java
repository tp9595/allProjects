package org.selenium_02basicProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenium_01utilities.Generic_Method;

public class MultipleElemntAddtoCart {
		
	static WebDriver driver;
	static WebDriverWait wt;
	public static void main(String[] args) throws InterruptedException {
		Generic_Method gObj = new Generic_Method ();
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().setSize(new Dimension (638,384));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String url = "https://www.flipkart.com/";
		driver.get(url);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9594623769");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Rohit@241095");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		wt=new WebDriverWait(driver,Duration.ofSeconds(30));
		wt.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")));
		
		WebElement searchText = driver.findElement(By.name("q"));
		searchText.sendKeys("Wing of Fire");
		searchText.sendKeys(Keys.ENTER);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Winged Fire: A Celebration of Indian Birds']")));
		
		String currentWindow =driver.getWindowHandle();//To strore Current window
		driver.findElement(By.xpath("//a[@title='Winged Fire: A Celebration of Indian Birds']")).click();
		
		//To strore and switch to new window 
		for(String newWindow : driver.getWindowHandles()){
			if (!newWindow.equals(currentWindow)){
		    driver.switchTo().window(newWindow);
		
			}
		}   
		wt=new WebDriverWait(driver,Duration.ofSeconds(30));
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
		//driver.close();//to close new window when this window no longer to use
		
		Thread.sleep(10000);
		//Move to Home Page by clicking on flipkart button
		driver.findElement(By.xpath("//img[@src='//static-assets-web.flixcart.com/www/linchpin/fk-cp-zion/img/fk-plus_3b0baa.png']")).click();
		
		WebElement appliances = driver.findElement(By.xpath("//img[@alt='Appliances']"));
		Actions act = new Actions(driver);
		act.moveToElement(appliances).perform();
		
		//gObj.waitForInvisibilityOfElement(driver,30,(By.xpath("//a[@class='_6WOcW9 _2-k99T']")));
		//gObj.waitForVisibilityOfElement(driver,30,(By.xpath("//div/a[@class='_6WOcW9'][1]")));
		WebElement washingMachine = driver.findElement(By.xpath("//div/a[@class='_6WOcW9'][1]"));
		act.moveToElement(washingMachine).perform();
		
		driver.findElement(By.xpath("//a[text()='All']")).click();
		
		driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']/div[@class='_1AtVbE col-12-12'][2]//div[@class='_2QcLo-']")).click();
		
		for(String thirdWindow : driver.getWindowHandles()){
		    driver.switchTo().window(thirdWindow);
		    }
		driver.findElement(By.cssSelector("svg[class='_1KOMV2']")).click();
		WebElement saveForLater =driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg col-12-12']/div[@class='_1AtVbE col-12-12'][1]//div[text()='Save for later']"));
		WebElement remove = driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg col-12-12']/div[@class='_1AtVbE col-12-12'][1]/div[@class='zab8Yh _10k93p']//div[text()='Remove']"));
		//gObj.waitForInvisibilityOfElement(driver,30,By.xpath("//div[@class='VUS-tD eBV0fb']"));
		
		//gObj.waitForElementToBeClickable(driver,30,By.xpath("//div[@class='_1YokD2 _3Mn1Gg col-12-12']/div[@class='_1AtVbE col-12-12'][1]//div[text()='Save for later']"));
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()",saveForLater,remove);
	//saveForLater.click();
		
	}

}
