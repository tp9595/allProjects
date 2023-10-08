package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newwindow3 {
	
	
	void openwebpage(WebDriver driver)
	{
		String url ="https://demoqa.com/browser-windows";
		//String url = "https://rahulshettyacademy.com/AutomationPractice/";
		 driver.get(url);
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   // driver.switchTo()
	}
	
	
	void opennewwindow(WebDriver driver)
	{
		String mainwindow =driver.getWindowHandle();
		WebElement btn =driver.findElement(By.id("windowButton"));
		btn.click();
		 Set<String> windows =driver.getWindowHandles();
//		 for(String s : windows)
//		 {
//			 System.out.println(s);
//		 }
		 
		 Iterator itr =windows.iterator();	
		 
		 while(itr.hasNext())
		 {
			 String nextwindow= (String) itr.next();
			 if(!mainwindow.equalsIgnoreCase(nextwindow))
			 {
				 driver.switchTo().window(nextwindow);
				 WebElement txt = driver.findElement(By.id("sampleHeading"));
						 String grabText = txt.getText();
				 System.out.println(grabText);
			 }
		 }
	//driver.switchTo().defaultContent();
	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:/Users/akshay/Downloads/CHROME/chromedriver.exe");
		   // System.setProperty("webdriver.chrome.driver", "D:/java software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			Newwindow3 obj = new Newwindow3();
			obj.openwebpage(driver);
			obj.opennewwindow(driver);
			
	}

}
