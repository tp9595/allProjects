package org.SelfPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SliderBar {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/slider");
		Actions act = new Actions(driver);
		
		WebElement at25=driver.findElement(By.xpath("(//input[@value='25'])[1]"));
		//WebElement at29=driver.findElement(By.xpath("//input[@value='29'][1]"));
		act.moveToElement(at25).clickAndHold().moveByOffset(-950,100).release().perform();
	
		
		
		//WebElement at25=driver.findElement(By.xpath("//input[@value='25']"));
		

	}

}
