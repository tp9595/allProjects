package org.selenium_08actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClasEx {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver   driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/tool-tips");
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		//button tooltip
		WebElement btn1=driver.findElement(By.cssSelector("#toolTipButton"));
		act.moveToElement(btn1).perform();
		String buttonText=driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText();
		System.out.println(buttonText);
		
		//Text Field Tooltip
		WebElement textField=driver.findElement(By.xpath("//input[@placeholder='Hover me to see']"));
		act.moveToElement(textField).perform();
		String textfieldText=driver.findElement(By.xpath("//div[contains(text(),'text field')]")).getText();
		System.out.println(textfieldText);
		
		//link Hover1
		WebElement linkHover1=driver.findElement(By.xpath("//a[text()='Contrary']"));
		act.moveToElement(linkHover1).perform();
	
		String linkHoverText1 =driver.findElement(By.xpath("//div[contains(text(),'Contrary')]")).getText();
		System.out.println(linkHoverText1);
		//link Hover2
		WebElement linkHover2=driver.findElement(By.xpath("(//a[@href='javascript:void(0)'])[2]"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", linkHover2);
		act.moveToElement(linkHover2).perform();
		String linkHoverText2 =driver.findElement(By.xpath("//div[contains(text(),'the 1.10.32')]")).getText();
		System.out.println(linkHoverText2);
		
	
	}
}		
