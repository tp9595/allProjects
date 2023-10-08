package org.selenium_02basicProgram;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX1 {

	public static void main(String[] args) {
		
		System.out.println("Program Strat");
		
		
		//System.setProperty("webdriver.webdriver_name.driver,"webdriver_path")
		//Chrome
		System.setProperty("webdriver.chrome.driver","C:\\Acceleartion\\New Workpace\\Feb_13_17_Selenium\\driver\\chromedriver.exe");
		ChromeDriver objCH  = new ChromeDriver(); //ctrl+shift+o to import class
		
		//FF
		System.setProperty("webdriver.gecko.driver","C:\\Acceleartion\\New Workpace\\Feb_13_17_Selenium\\driver\\geckodriver.exe");
		
		FirefoxDriver objFF = new FirefoxDriver();
		//Edge
		System.setProperty("webdriver.edge.driver","C:\\Acceleartion\\New Workpace\\Feb_13_17_Selenium\\driver\\msedgedriver.exe");
		EdgeDriver objED = new EdgeDriver();
		
		System.out.println("Program Ends");
		

	}
	
}
