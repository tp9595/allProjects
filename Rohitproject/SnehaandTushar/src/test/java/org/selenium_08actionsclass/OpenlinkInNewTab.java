
package org.selenium_08actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.selenium_01utilities.BaseUtilityUpdated;

public class OpenlinkInNewTab {

	public static void main(String[] args) {
		 BaseUtilityUpdated bu = new BaseUtilityUpdated();
		 
		 WebDriver driver =bu.startup("CH","https://demoqa.com/links");
		 
		 driver.findElement(By.xpath("//a[text()='Home']")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));

	}

}
