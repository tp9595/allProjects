package org.testNG2;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.selenium_01utilities.BaseUtilityUpdated;

public class ScrollByJsInsideTheWindow2 {


	public static void main (String[] args) throws InterruptedException {
		BaseUtilityUpdated bobj = new BaseUtilityUpdated();
		WebDriver driver;
		HashSet<String> s1=new HashSet<String> ();

		driver = bobj.startup("CH","https://online.actitime.com/own1/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rohitmahaj2480@gmail.com");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("Rohit@2410");
		driver.findElement(By.cssSelector("#loginButton")).click();
		driver.findElement(By.cssSelector("#container_tasks")).click();
		WebElement scrollBar=driver.findElement(By.xpath("(//div[@class='iScrollIndicator'])[1]"));

		for(int i=1;i<=2;i++) {
			List<WebElement> allEle=driver.findElements(By.xpath("//div[@class='node customerNode notSelected editable']/div[3]/div[@class='text']"));
			for(int j=0;j<allEle.size();j++) {
				//System.out.println(allEle.get(i).getText());
				s1.add(allEle.get(j).getText());
				for (String str :s1) {
					//if(str.equals("Moni")||str.equals("Rani")||str.equals("Comando")||str.equals("Robot")){
						System.out.println(str);	
					//}
				}
			}
			Actions act = new Actions(driver);
			act.dragAndDropBy(scrollBar, 0, 112).perform();
			Thread.sleep(10000);
		}


	}
}


