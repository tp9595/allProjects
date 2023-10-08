package org.selenium_06browserOperation;

import org.openqa.selenium.WebDriver;
import org.selenium_01utilities.BaseUtilityUpdated;

public class BrowserOPearionsAllInOne {

	public static void main(String[] args) throws InterruptedException {
		BaseUtilityUpdated bu = new BaseUtilityUpdated();
		
		WebDriver driver =bu.startup("CH","https://demoqa.com/frames");
		Thread.sleep(2000);//not necessary use here to just watch changes 
		 driver.navigate().to("https://www.hotstar.com/in");
		 Thread.sleep(2000);//not necessary use here to just watch changes  
		 driver.navigate().back();
		 Thread.sleep(2000);//not necessary use here to just watch changes 
		 driver.navigate().forward();
		 Thread.sleep(2000);//not necessary use here to just watch changes 
		 driver.navigate().refresh();
	}

}
