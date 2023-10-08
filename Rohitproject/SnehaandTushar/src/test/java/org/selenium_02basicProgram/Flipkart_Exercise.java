package org.selenium_02basicProgram;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenium_01utilities.BaseUtilityUpdated;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart_Exercise {

	static WebDriver driver;
	static WebDriverWait wt;
	public static void main(String[] args) throws InterruptedException  {
		BaseUtilityUpdated bObj = new BaseUtilityUpdated();
	
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String url="https://www.flipkart.com/";
		
		
		System.out.println();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(url);
		String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9594623769");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rohit@241095");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']/span")).click();
		bObj.waitForInvisibilityofElement(driver, 30,By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']/span" ));
		//wt=new WebDriverWait(driver,Duration.ofSeconds(20));
		//bObj.waitForVisibilityofElement(driver, 60,By.name("//form[@action='/search']/div/div/input"));
		//wt.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@action='/search']/div/div/input"))));
		WebElement searchtab =driver.findElement(By.xpath("//form[@action='/search']/div/div/input"));
		//searchtab.click();
		searchtab.sendKeys("Galaxy m32");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']/*[local-name()='svg']")).click();
		bObj.waitForVisibilityofElement(driver,30,By.xpath("//div[@class='_4rR01T']"));
		//driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
		List <WebElement> mobileName =driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		System.out.println("Check list empty or not :"+mobileName.isEmpty());
		System.out.println("size ="+mobileName.size());

		List <WebElement> mobilePrice =driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		System.out.println("Check list empty or not :"+mobilePrice.isEmpty());
		System.out.println("size ="+mobilePrice.size());
		for (int i = 0,j=0; i<mobileName.size();i++) {

			System.out.println("Mobile Name is "+mobileName.get(i).getText());
			System.out.println("Mobile Price is "+mobilePrice.get(j).getText());
		}
		String str ="";
		List <WebElement> allPageNo=driver.findElements(By.xpath("//a[starts-with(@class,'ge-49M')]"));
		for(int i = 0;i<allPageNo.size();i++) {
			str=allPageNo.get(i).getAttribute("class");
			if(str.endsWith("_2Kfbh8")) {
				System.out.println("Selected Page No Is :"+allPageNo.get(i).getText());
			}
		}


	}

}


