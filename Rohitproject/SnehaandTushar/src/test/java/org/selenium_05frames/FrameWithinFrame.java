package org.selenium_05frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameWithinFrame {
	  static WebDriver driver;
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		WebElement parentFram=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(parentFram);
		WebElement childFrame=driver.findElement(By.xpath("//div[@class='row']/iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(childFrame);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Rohit");
		driver.switchTo().defaultContent();///root html
	}

}
