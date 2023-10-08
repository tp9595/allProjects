package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {
	
	
	void firstmethod(WebDriver driver)
	{
		String url = "https://demoqa.com/browser-windows";
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	
	void nextmethod(WebDriver driver)
	{ 
		WebElement frameone =driver.findElement(By.id("frame"));
	  driver.switchTo().frame(frameone);
		WebElement title  = driver.findElement(By.id("sampleHeading"));
		String PresentText = title.getText();
		System.out.println(PresentText);
		
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/akshay/Downloads/CHROME/chromedriver.exe");
		   // System.setProperty("webdriver.chrome.driver", "D:/java software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			frame obj = new frame();
			obj.firstmethod(driver);
	}

}
