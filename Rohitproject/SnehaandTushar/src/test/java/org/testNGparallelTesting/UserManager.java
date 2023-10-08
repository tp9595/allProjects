package org.testNGparallelTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.selenium_01utilities.BaseUtilityUpdated;
import org.selenium_01utilities.Configwithconstr;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserManager {

	BaseUtilityUpdated bu ;
	WebDriver driver;
	Configwithconstr cr;
	String bName;
	String url;
	String uName;
	String password;
	
	//to run the test case multiple time with multiple test data 
	@Test(dataProvider="getDataAndProvideData")
	public void createUser(String userName,String surNAme,String email) {
		driver.findElement(By.id("container_users")).click();
		driver.findElement(By.xpath("//div[text()='New User']")).click();
		System.out.println(userName);
		WebElement firstName=driver.findElement(By.xpath("(//input[@name='firstName'])[2]"));
		bu.waitForVisibilityofElement(driver, 30, By.id("createUserPanel_emailField"));
		//bu.sendKeysByActionClass(driver, firstName, userName);
		firstName.click();
		firstName.sendKeys(userName);
		
		driver.findElement(By.id("createUserPanel_lastNameField")).sendKeys(surNAme);
		driver.findElement(By.id("createUserPanel_emailField")).sendKeys(email);
		driver.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
		bu.waitForVisibilityofElement(driver, 20, By.xpath("(//span[text()='Close'])[1]"));
		driver.findElement(By.xpath("(//span[text()='Close'])[1]")).click();
		System.out.println(Thread.currentThread().getId());
	}
	@DataProvider
	public Object[][] getDataAndProvideData() throws EncryptedDocumentException, IOException{
			
		int last_row=bu.getlastRowNumber("./ExcelFile/TestData.xlsx","userData");
		int last_cell=bu.getlastCellNumber("./ExcelFile/TestData.xlsx","userData");
		//System.out.println(last_row);
		//System.out.println(last_cell);
		
		Object ar[][]=new Object[last_row][last_cell];
		//i & j use for getting data from excel sheet.
		for (int i=1,k=0;i<=last_row;i++,k++) {
			for(int j = 0,l=0;j<last_cell;j++,l++) {
				//k and l use for storing the data in Object Array.
				ar[k][l]=bu.getObjectOfParticularCell("./ExcelFile/TestData.xlsx","userData",i,j);
				
				//System.out.println(ar[k][l]);			
			}
		}
		return ar;
	}
	
	@Test
	public void deleteUser() {
	System.out.println("delete user");
	driver.findElement(By.xpath("//a[@class='content users']")).click();

	driver.findElement(By.xpath("//span[text()='M, Rohit']")).click();

	bu.waitForVisibilityofElement(driver, 20,(By.xpath("//div[@class='deleteButton actionButton']")));
	WebElement deleteBtn1 = driver.findElement(By.xpath("//div[@class='deleteButton actionButton']"));
	bu.clickByJs(driver, deleteBtn1);

	driver.switchTo().alert().accept();
	System.out.println(Thread.currentThread().getId());
	}
	@BeforeMethod
	public void beforeMethod() {

		
		driver = bu.startup(bName,url);
		//username
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uName);
		//password
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
		//login button
		driver.findElement(By.cssSelector("#loginButton")).click();

	}

	@AfterMethod
	public void actiLogout() {
		driver.findElement(By.xpath("//a[@href='/own1/logout.do']")).click();
		driver.close();
	}
		

	@BeforeClass
	public void beforeClass() {
		bu =new BaseUtilityUpdated();
		cr = new Configwithconstr ("./PropertiesFile/Actitime.properties");
		bName=cr.getPropertyValue("browserNameCH");
		url=cr.getPropertyValue("url");
		uName= cr.getPropertyValue("userName");
		password=cr.getPropertyValue("password");
	}

	@AfterClass
	public void afterClass() {
	//flush the object
	bu=null;
	cr=null;
	driver=null;

	}

}
