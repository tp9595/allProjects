package org.selenium_09linkAnkaerTag;


import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.selenium_01utilities.BaseUtilityUpdated;

public class LinkLocate {

	public static void main(String[] args) throws InterruptedException {

		BaseUtilityUpdated bu =new BaseUtilityUpdated();
		String hurl="https://demoqa";
		int respCode=200;
		WebDriver driver =bu.startup("CH","https://demoqa.com/links");
		//Thread.sleep(60000);
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		for(int i=0;i<allLinks.size();i++) {
			String url=allLinks.get(i).getAttribute("href");
			//Check if URL is null or Empty and skip the remaining steps if the condition is satisfied.
			if(url == null || url.isEmpty()){
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}
			//Check whether URL belongs to a main domain or third party. 
			//Skip the remaining steps if it belongs to third party domain.
			if(!url.startsWith(hurl)){
				System.out.println("URL belongs to another domain, skipping it.");
				continue;
			}

			//HttpURLConnection class has methods to send HTTP request and capture HTTP response code.
			// So, output of openConnection() method (URLConnection) is type casted to HttpURLConnection.
			try {
				URL ur =new URL(url);
				ur.openConnection();//return object of URL Connection
				
				HttpURLConnection huc = (HttpURLConnection)ur.openConnection();
				//We can set Request type as “HEAD” instead of “GET”. So that only headers are returned and not document body.
				huc.setRequestMethod("HEAD");
				//On invoking connect() method, actual connection to url is established and the request is sent.
				huc.connect();
				//Using getResponseCode() method we can get response code for the request
				respCode = huc.getResponseCode();
				if(respCode>=400) {
					System.out.println(url+" is a broken link");
				}else {
					System.out.println(url+" is a valid link");
				}



			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}



}
