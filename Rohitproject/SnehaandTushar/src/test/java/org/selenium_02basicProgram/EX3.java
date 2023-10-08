package org.selenium_02basicProgram;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX3 {

	public static void main(String[] args) {
		
		EX3 obj =new EX3();
		obj.startup("ch","https://web.whatsapp.com/");

	}
	
	public  void startup(String bName,String url) {
		if(bName.equalsIgnoreCase("ch")||bName.equalsIgnoreCase("Chrome")) {
				
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");//Here ./ is root path 
			ChromeDriver objCH  = new ChromeDriver(); //ctrl+shift+o to import class
			objCH.get(url);
			}
			
			else if (bName.equalsIgnoreCase("ff")||bName.equalsIgnoreCase("FireFox")) {
			//FF
			System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
			
			FirefoxDriver objFF = new FirefoxDriver();
			objFF.get(url);
			
			}
			else if (bName.equalsIgnoreCase("Ed")||bName.equalsIgnoreCase("Edge")) {
			//Ed
			System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
			EdgeDriver objED = new EdgeDriver();
			objED.get(url);
			}
			else {
				System.out.println("Browser Name is Invalid");
			}
	}

}
