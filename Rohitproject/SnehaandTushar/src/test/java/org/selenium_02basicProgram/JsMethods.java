package org.selenium_02basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selenium_01utilities.BaseUtilityUpdated;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsMethods {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		BaseUtilityUpdated bObj = new BaseUtilityUpdated();
		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		String url = "https://www.twoplugs.com/";
		driver =new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement tryNow =driver.findElement(By.xpath("//button[@class='btn green']"));
		//System.out.println(tryNow.getCssValue("backgroundColor"));
		//bObj.flash(driver, tryNow);
		bObj.drawBorder(tryNow, driver);
		WebElement liveNow=driver.findElement(By.cssSelector("a[href='/newsearchserviceneed']"));
		bObj.drawBorder(liveNow, driver);
		WebElement btn = driver.findElement(By.cssSelector("a[class='btn white']"));
		bObj.drawBorder(btn, driver);
		//click on element by Js
		bObj.clickByJs(driver, btn);
		
		//To Refresh Browser
		bObj.refreshBrowserByJs(driver);
		//To Generate Alert
		bObj.generateAlert(driver,"You have Clicked on Lets Go");
		//To Handle Alert
		driver.switchTo().alert().accept();
		//To Scroll till End of the Page 
		bObj.scrollByJsTillEnd(driver);
		
		
	}

}
