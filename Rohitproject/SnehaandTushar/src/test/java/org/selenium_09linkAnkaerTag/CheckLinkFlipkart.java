package org.selenium_09linkAnkaerTag;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selenium_01utilities.BaseUtilityUpdated;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckLinkFlipkart {

	public static void main(String[] args) throws IOException {

		BaseUtilityUpdated bu =new BaseUtilityUpdated();
		int respcode;
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=bu.startup("CH","https://www.flipkart.com/");
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9594368542");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Tushar@123");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));

		for(int i=0;i<allLinks.size();i++) {
			String url=allLinks.get(i).getAttribute("href");

			if(url==null) {
				System.out.println("href is not present");

			}else {

				URL ur =new URL(url);
				//ur.openConnection();
				HttpURLConnection huc = (HttpURLConnection)ur.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				respcode=huc.getResponseCode();
				if(respcode>=400) {
					System.out.println(url+" is a broken link");
				}else {
					//System.out.println(url+" is a valid link");
				}
			}
		}

	}

}
