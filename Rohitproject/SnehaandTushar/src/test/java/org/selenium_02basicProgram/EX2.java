package org.selenium_02basicProgram;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX2 {

	public static void main(String[] args) {
		
		System.out.println("Program Strat");
		String browserName ="ch";
		String url = "https://www.google.com/";
		
		if(browserName.equalsIgnoreCase("ch")||browserName.equalsIgnoreCase("Chrome")) {
		
		//System.setProperty("webdriver.webdriver_name.driver,"webdriver_path")
		//Chrome
		//String path =System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver",path+"/driver/chromedriver.exe");
		//we can use getProperty method to get root path.
			
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");//Here ./ is root path 
		ChromeDriver objCH  = new ChromeDriver(); //ctrl+shift+o to import class
		//objCH.get("https://www.google.com/");
		objCH.get(url);
		}
		
		else if (browserName.equalsIgnoreCase("ff")||browserName.equalsIgnoreCase("FireFox")) {
		//FF
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		
		FirefoxDriver objFF = new FirefoxDriver();
		objFF.get(url);
		
		}
		else if (browserName.equalsIgnoreCase("Ed")||browserName.equalsIgnoreCase("Edge")) {
		//Ed
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
		EdgeDriver objED = new EdgeDriver();
		objED.get(url);
		}
		else {
			System.out.println("Browser Name is Invalid");
		}
		
		System.out.println("Program Ends");
		

	}
	
}