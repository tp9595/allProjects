package org.selenium_02basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.selenium_01utilities.BaseUtilityUpdated;

public class LocateByDependentIndependant {
////div[a[div[div[div[@class='_4rR01T']]]]]/a/div/div[2]/div/span
	public static void main(String[] args) {
		
		BaseUtilityUpdated bu = new BaseUtilityUpdated();
		WebDriver driver=bu.startup("ch","https://www.flipkart.com/search?q=samsung+m32&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&as-pos=1&as-type=HISTORY");
//		WebElement checkBox=driver.findElement(By.xpath("//div[a[div[div[div[@class='_4rR01T']]]]]/a/div/div[2]/div/span/label/input)[1]"));
//		bu.waitForVisibilityofElement(driver, 30, By.xpath("(//div[a[div[div[div[@class='_4rR01T']]]]]/a/div/div[2]/div/label/span[text()='Add to Compare']"));
		driver.findElement(By.xpath("(//div[a[div[div[div[@class='_4rR01T']]]]]/a/div/div[2]/div/label/span[text()='Add to Compare'])[1]")).click();
		//WebElement checkbox1= driver.findElement(By.xpath("(//a/div/div[2]/div/span/label/input)[1]"));
		//WebElement checkboxlabel=driver.findElement(By.xpath("(//a/div/div[2]/div/label/span[text()='Add to Compare'])[1]"));	
		//checkboxlabel.click();
		//bu.clickByJs(driver, checkboxlabel);
		//Actions act =new Actions(driver);
		//act.moveToElement(checkbox1).click();
		
		
	}
	

}
