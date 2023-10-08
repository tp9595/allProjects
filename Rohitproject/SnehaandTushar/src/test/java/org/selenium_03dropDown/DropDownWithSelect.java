package org.selenium_03dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.selenium_01utilities.BaseUtilityUpdated;

public class DropDownWithSelect {
	
	
	public static void main(String[] args) {
		
		BaseUtilityUpdated bObj= new BaseUtilityUpdated();
		
		WebDriver driver =bObj.startup("CH","https://demoqa.com/select-menu");
		
		//1.Identify and locate dropdown
		//WebElement oldstyle =driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		
		//2.Create object of select class need to pass WebEelement (default constructor is not present)
		//Select se = new Select(oldstyle);
		
		//3.Select data by 3 ways
		//3.1 visiblebyText.
		//se.selectByVisibleText("Yellow");
		
		//3.2  SelectbyValue
		//se.selectByValue("9");
		
		//3.3  Select by Index
		//se.selectByIndex(10);
		//se.deselectByValue("10");
		
		WebElement car =driver.findElement(By.xpath("//select[@name='cars']"));
		bObj.scrollByJs(driver,car);
		
		Select sel = new Select(car);
		sel.selectByIndex(0);
		sel.selectByIndex(1);
		sel.selectByIndex(2);
		
		sel.deselectByIndex(1);
		sel.selectByVisibleText("Audi");
		sel.selectByValue("saab");
		
		
		
		
	}

}
