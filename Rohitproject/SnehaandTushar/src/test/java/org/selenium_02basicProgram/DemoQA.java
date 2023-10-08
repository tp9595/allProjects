package org.selenium_02basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.selenium_01utilities.Generic_Method;

public class DemoQA {

	public static void main(String[] args) {
		
		Generic_Method gObj =new  Generic_Method();
		WebDriver driver =gObj.startup("https://demoqa.com/radio-button","CH",30);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement radiobtn = driver.findElement(By.cssSelector("input[id='yesRadio']"));
		System.out.println("isEnable : "+radiobtn.isEnabled());
		System.out.println("isSelected :"+radiobtn.isSelected());
		WebElement title = driver.findElement(By.cssSelector("label[for='yesRadio']"));
		if(radiobtn.isEnabled()) {
			js.executeScript("arguments[0].click()",radiobtn);
			//title.click();
			System.out.println("isSelected : "+radiobtn.isSelected());
		}
		
		
	}

}
