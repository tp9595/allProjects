package org.testNG2;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.selenium_01utilities.BaseUtilityUpdated;

public class ScrollByJsInsideTheWindow {

	
	public static void main (String[] args) throws InterruptedException {
		BaseUtilityUpdated bobj = new BaseUtilityUpdated();
		WebDriver driver;
	
		String ar[] = new String[15];
		int k=0;
		driver = bobj.startup("CH","https://online.actitime.com/own1/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rohitmahaj2480@gmail.com");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("Rohit@2410");
		driver.findElement(By.cssSelector("#loginButton")).click();
		driver.findElement(By.cssSelector("#container_tasks")).click();
		WebElement scrollBar=driver.findElement(By.xpath("(//div[@class='iScrollIndicator'])[1]"));
		List<WebElement> allEle=driver.findElements(By.xpath("//div[@class='node customerNode notSelected editable']/div[3]/div[@class='text']"));
		for(int i=0;i<allEle.size();i++) {
		//System.out.println(allEle.get(i).getText());
		ar[k]=(allEle.get(i).getText());
		k++;
		//System.out.println(ar[0]);
		}
		Actions act = new Actions(driver);
		act.dragAndDropBy(scrollBar, 0, 112).perform();
		List<WebElement> allEle2=driver.findElements(By.xpath("//div[@class='node customerNode notSelected editable']/div[3]/div[@class='text']"));
		for(int i=0;i<allEle.size();i++) {
			ar[k]=(allEle.get(i).getText());

			}
		act.dragAndDropBy(scrollBar, 0, 112).perform();
		List<WebElement> allEle3=driver.findElements(By.xpath("//div[@class='node customerNode notSelected editable']/div[3]/div[@class='text']"));
		for(int i=0;i<allEle.size();i++) {
			ar[k]=(allEle.get(i).getText());
		
			}
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}

		}
		
		
}
