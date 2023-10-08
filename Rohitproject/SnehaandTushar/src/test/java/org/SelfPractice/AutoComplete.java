package org.SelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.selenium_01utilities.BaseUtilityUpdated;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		
		BaseUtilityUpdated bu =new BaseUtilityUpdated();
		WebDriver driver=bu.startup("CH","https://demoqa.com/auto-complete");
//		driver.findElement(By.xpath("(//div[@class='auto-complete__control css-yk16xz-control'])[1]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("(//div[@class='auto-complete__control css-yk16xz-control'])[1]")).sendKeys("a");
		WebElement forSend=driver.findElement(By.xpath("(//div[@class='auto-complete__control css-yk16xz-control'])[1]"));
		bu.sendKeysByActionClass(driver, forSend,"a");
		driver.findElement(By.xpath("//*[text()='Black']")).click();
		bu.sendKeysByActionClass(driver, forSend,"n");
		driver.findElement(By.xpath("//*[text()='Indigo']")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'remove')])[2]")).click();
	}

}
