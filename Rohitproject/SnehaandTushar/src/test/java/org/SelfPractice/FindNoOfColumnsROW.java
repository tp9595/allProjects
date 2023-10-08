package org.SelfPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class FindNoOfColumnsROW {


	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php"); 
		List <WebElement> allRow=driver.findElements(By.xpath("//tr/th"));
		System.out.println("No. of Columns = "+allRow.size());
		
		List <WebElement> allCol=driver.findElements(By.xpath("//tr"));
		System.out.println("No. of Rows = "+allCol.size());
		
		driver.close();
		
	}

}


