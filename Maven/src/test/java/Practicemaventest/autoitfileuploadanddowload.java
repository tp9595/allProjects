package Practicemaventest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class autoitfileuploadanddowload extends selenuiumutility {

	public static void main(String[] args) throws Exception {

		WebDriver driver = setUp("chrome", "https://www.ilovepdf.com/pdf_to_word");
		Thread.sleep(3000);
		WebElement uploadbtn = driver.findElement(By.id("pickfiles"));
		uploadbtn.click();
		uploadbtn.sendKeys("C:/Users/akshay/Downloads/Ketan satpute MM Certified.pdf");
		// Thread.sleep(3000);
		// driver.close();
		// by autoit
		// Runtime.getRuntime().exec("C:\\Users\\akshay\\Downloads\\ADVERTISE- STATE
		// BANK OF INDIA (1).pdf");

	}
}
