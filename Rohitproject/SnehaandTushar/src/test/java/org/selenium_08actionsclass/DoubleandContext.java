package org.selenium_08actionsclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.selenium_01utilities.BaseUtilityUpdated;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleandContext {

	public static void main(String[] args) throws AWTException, InterruptedException {
		BaseUtilityUpdated bu = new BaseUtilityUpdated();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		//WebDriver driver=bu.startup("CH","https://demoqa.com/buttons");
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		WebElement dBtn=driver.findElement(By.cssSelector("#doubleClickBtn"));
		
		Actions act =new  Actions(driver);
		
//		act.doubleClick(dBtn).perform();
//		
//		WebElement rightClick=driver.findElement(By.id("rightClickBtn"));
//		act.contextClick(rightClick).perform();
		
		WebElement rightClickOnClick=driver.findElement(By.xpath("//button[text()='Click Me']"));
		act.contextClick(rightClickOnClick).perform();
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);
		
	}////div[@class='col-12 mt-4 col-md-6']//div//button 

}
