package org.selenium_08actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.selenium_01utilities.BaseUtilityUpdated;

public class SendKeysByAction {

	public static void main(String[] args) {
		
		BaseUtilityUpdated bu =new BaseUtilityUpdated();
		String url ="https://www.google.com/";
		WebDriver driver =bu.startup("CH",url);
		WebElement frame=driver.findElement(By.xpath("//iframe[@role='presentation']"));
		driver.switchTo().frame(frame);
		WebElement nothanksBtn=driver.findElement(By.xpath("//button[text()='No thanks']"));
		Actions act = new Actions(driver);
		//We can use both methods
		//act.moveToElement(nothanksBtn).click().perform();
		act.click(nothanksBtn).perform();
		driver.switchTo().defaultContent();
		WebElement search = driver.findElement(By.cssSelector("input[title='Search']"));
		
		act.sendKeys(search,"Pune").perform();
	}

}
