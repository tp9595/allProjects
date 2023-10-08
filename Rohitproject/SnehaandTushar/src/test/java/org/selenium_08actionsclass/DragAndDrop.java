package org.selenium_08actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.selenium_01utilities.BaseUtilityUpdated;

public class DragAndDrop {

	public static void main(String[] args) {
		
		BaseUtilityUpdated bu =new BaseUtilityUpdated();
		String url ="https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager";
		WebDriver driver =bu.startup("CH",url);
		WebElement childframe =driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(childframe);
		WebElement source1=driver.findElement(By.xpath("//img[contains(@alt,'The peaks')]"));
		WebElement source2=driver.findElement(By.xpath("//img[contains(@alt,'On top')]"));
		WebElement source3=driver.findElement(By.xpath("//img[contains(@alt,'The chalet')]"));
		WebElement source4=driver.findElement(By.xpath("//img[contains(@alt,'Planning the ascent')]"));
		
		WebElement desti=driver.findElement(By.id("trash"));
		
		Actions act = new Actions (driver);
		//recomanded method
		act.dragAndDrop(source1, desti).perform();
		//try n error method 
		act.dragAndDropBy(source2, 500,-100).perform();
		//when drag and drop method not working that time we can use this method.
		act.clickAndHold(source3).release(desti).build().perform();
		//or
		act.moveToElement(source4).clickAndHold().moveToElement(desti).release().build().perform();
		

	}

}
