package Practicemaventest;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown1 {
	WebDriver  driver;
@Test	
public void drop() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	
			
			driver.get("https://www.myntra.com/");
	      WebElement search=driver.findElement(By.className("desktop-searchBar"));
	      //Thread.sleep(1000);
	      search.sendKeys("Shoes");
	     // Thread.sleep(1000);
	      search.sendKeys(Keys.ENTER);
//	      Alert alert = driver.switchTo().alert();
//	      alert.accept();
	      String pwindow = driver.getWindowHandle();
	      WebElement click1 = driver.findElement(By.xpath("(//img[@class='img-responsive'])[5]"));
	      click1.click();
	      Set<String> cwindow = driver.getWindowHandles();
	     // driver.switchTo().window(cwindow);
	      List <String> hlist = new ArrayList<String>(cwindow);
	    String childwindow=  hlist.get(1);
	    driver.switchTo().window(childwindow);
	      
	  
//			for(String e : hlist)
//			{
//				System.out.println(e);
//				String title =driver.switchTo().window(e).getTitle();
//				System.out.println(title);
//				
//			}
	    //  WebElement searchs= driver.findElement(By.xpath("(//span[@class='desktop-superscriptTag'])[1]"));
	     // searchs.click();
	      WebElement size =driver.findElement(By.xpath("(//div[@class='size-buttons-buttonContainer'])[2]"));
	      
	      size.click();
	      WebElement searc= driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']"));
	      searc.click();
	      WebElement icon=driver.findElement(By.xpath("(//span[@class='desktop-userTitle'])[3]"));
	      icon.click();                                
	      WebElement sear= driver.findElement(By.xpath("//button[@class='inlinebuttonV2-base-actionButton bulkActionStrip-desktopBulkRemove']"));
	      sear.click();
		 
		 
		
}
}
