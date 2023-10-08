package org.selenium_05frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selenium_01utilities.BaseUtilityUpdated;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiFrames {

	public static void main(String[] args) {
		
		BaseUtilityUpdated bu = new BaseUtilityUpdated();
		
		//bu.startup("CH","https://demoqa.com/frames");
		
		//WebDriver driver =bu.startup("CH","https://demoqa.com/frames");
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demoqa.com/frames");
		 driver.manage().window().maximize();
		WebElement firstFrame = driver.findElement(By.xpath("(//iframe[@src='/sample'])[1]"));
		driver.switchTo().frame(firstFrame);//switch to first frame
		WebElement toBorder=driver.findElement(By.xpath("(//h1[@id='sampleHeading'])[1]"));
		bu.drawBorder(toBorder, driver);
		driver.switchTo().defaultContent();//switch to root frame
		
		WebElement secondFrame=driver.findElement(By.xpath("(//iframe[@src='/sample'])[2]"));
		driver.switchTo().frame(secondFrame);//Switch to second frame 
		String str1 =driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		System.out.println(str1);
		
	}

}
