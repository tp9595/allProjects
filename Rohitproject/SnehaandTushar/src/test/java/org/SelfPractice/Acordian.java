package org.SelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium_01utilities.BaseUtilityUpdated;

public class Acordian {

	public static void main(String[] args) throws InterruptedException {
		BaseUtilityUpdated bu =new BaseUtilityUpdated();
		WebDriver driver=bu.startup("CH","https://demoqa.com/accordian");
		driver.findElement(By.cssSelector("#section1Heading")).click();
		driver.findElement(By.cssSelector("#section2Heading")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#section2Heading")).click();
	}

}
