package org.selenium_02basicProgram;

import org.openqa.selenium.WebDriver;
import org.selenium_01utilities.BaseUtilityUpdated;

public class EX5 {

	public static void main(String[] args) {
		System.out.println("program start");
		BaseUtilityUpdated obj = new BaseUtilityUpdated();
		//obj.startup("ch","https://www.scientecheasy.com/");
		
		
		WebDriver driver =obj.startup("ed","https://www.scientecheasy.com/");//driver captured
		String expecteTitle = "Scientech Easy - Tutorials for Beginners";
		String actTitle = driver.getTitle();
		
		String actUrl = driver.getCurrentUrl();
		String expectUrl ="https://www.scientecheasy.com/";
		
		
		if(expecteTitle.equals(actTitle)){
			System.out.println("Title Mathced");
		}else{
			System.out.println("Title Not mathced");
		}
		
		if(expectUrl.equals(actUrl)) {
			System.out.println("URL Mathced");
		}else{
			System.out.println("URL Not mathced");
		}	
		
		System.out.println(driver.getPageSource());
		
		System.out.println("Program Ends");
	}
	

}
