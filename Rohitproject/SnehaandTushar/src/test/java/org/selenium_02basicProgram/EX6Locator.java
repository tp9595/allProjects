package org.selenium_02basicProgram;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenium_01utilities.BaseUtilityUpdated;

public class EX6Locator {

	public static void main(String[] args) {
		
		BaseUtilityUpdated obj = new BaseUtilityUpdated();
		
		//Return the driver so capture it first 
		WebDriver driver =obj.startup("ff","https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("#txtUsername"));//Return type of findElement method is web_element 
		//Therefore stored in WebElement 
		WebElement userName =	driver.findElement(By.id("txtUsername"));
		//.sendkeys is method belongs to Webelement 
		userName.sendKeys("Admin");
		
		WebElement password= driver.findElement(By.cssSelector("#txtPassword"));
		password.sendKeys("admin123");
		
//		WebElement loginButton=driver.findElement(By.className("button"));
//		loginButton.click();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//upto selenium 3
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//selenium 4 
		//every time we need wait method therefore its written in Baseutility.
		driver.findElement(By.className("button")).click();
		//We can directly use it no need to stored it in WebElement.
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wt.until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(By.xpath("//a[@id='menu_admin_viewAdminModule']"),By.xpath("//a[@id='menu_admin_UserManagement']")));
		
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		
		
		System.out.println("Program End");
	}
}