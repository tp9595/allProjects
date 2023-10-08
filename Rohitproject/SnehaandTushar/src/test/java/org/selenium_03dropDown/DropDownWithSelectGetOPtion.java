package org.selenium_03dropDown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.selenium_01utilities.BaseUtilityUpdated;

public class DropDownWithSelectGetOPtion {
	public static void main(String[] args) {
		BaseUtilityUpdated bObj= new BaseUtilityUpdated();

		WebDriver driver =bObj.startup("CH","https://demoqa.com/select-menu");

		WebElement ddMenu =driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));

		Select se = new Select(ddMenu);
		List<WebElement> allEle=se.getOptions();
		System.out.println("Size of allEle :"+allEle.size());
		System.out.println(allEle);
		System.out.println(se.getOptions().get(1));
		for(int i =0;i<allEle.size();i++) {
			System.out.println(allEle.get(i).getText());
			//se.selectByIndex(i);//to select all
		}
		System.out.println("By Using Generic Method");
		System.out.println(bObj.getAllTextfromDDL(ddMenu));

		System.out.println(bObj.getNumberofOption(ddMenu));

		System.out.println(bObj.getAlloptionsFromDDL(ddMenu));

	}

}
