package org.testNGparallelTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.selenium_01utilities.BaseUtilityUpdated;
import org.selenium_01utilities.Configwithconstr;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ClassForparallel {
 
	BaseUtilityUpdated bu ;
	WebDriver driver;
	Configwithconstr cr;
	String bName;
	String url;
	String uName;
	String password;
	String description1;
	String name;
	String pwd;
	@BeforeClass
	public void getCustomerData() throws EncryptedDocumentException, IOException {
		cr = new Configwithconstr("./PropertiesFile/Actitime.properties");
		bu = new BaseUtilityUpdated();
		url = cr.getPropertyValue("url");
		bName = cr.getPropertyValue("browserNameCH");
		uName = cr.getPropertyValue("userName");
		pwd = cr.getPropertyValue("password");
	}
		
	@BeforeMethod
	public void beforeMethod() {	
//		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("headless");
//		driver = new ChromeDriver(options);
		driver=bu.startup(bName,url);
		//driver.get(url);
		//username
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uName);
		//password
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pwd);
		//login button
		driver.findElement(By.cssSelector("#loginButton")).click();
	}
	//to run the test case multiple time with multiple test data 
	@Test(dataProvider="getDataAndProvideData")
	public void createUser(String userName,String surNAme,String email) {
		driver.findElement(By.id("container_users")).click();
		driver.findElement(By.xpath("//div[text()='New User']")).click();
		System.out.println(userName);
		WebElement firstName=driver.findElement(By.xpath("(//input[@name='firstName'])[2]"));
		bu.waitForVisibilityofElement(driver, 10, By.id("createUserPanel_emailField"));
		firstName.click();
		bu.sendKeysByActionClass(driver, firstName, userName);
		
		//firstName.sendKeys(userName);
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
	public void createCusomer() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.findElement(By.cssSelector("#container_tasks")).click();
		for(int i=1; i<=4; i++) {			
			bu.waitForVisibilityofElement(driver, 20, By.xpath("//div[text()='Add New']"));
			WebElement newBtn = driver.findElement(By.xpath("//div[text()='Add New']"));
			bu.clickByJs(driver, newBtn);	
			bu.waitForVisibilityofElement(driver, 30, By.xpath("//div[@class='item createNewCustomer']"));
			WebElement newcust=driver.findElement(By.xpath("//div[@class='item createNewCustomer']"));
			bu.clickByJs(driver, newcust);
			name =	(String) bu.returnDataOfAnyCellWithRespectToTableHeading("C:\\Acceleartion\\New Workpace\\Feb_13_17_Selenium\\ExcelFile\\TestData.xlsx","CustomerData","CustomerName",i);
			description1 = (String) bu.returnDataOfAnyCellWithRespectToTableHeading("C:\\Acceleartion\\New Workpace\\Feb_13_17_Selenium\\ExcelFile\\TestData.xlsx","CustomerData","Description",i);
			bu.waitForVisibilityofElement(driver,30,By.id("customerLightBox_content"));
			bu.waitForVisibilityofElement(driver, 20, By.xpath("//textarea[@placeholder='Enter Customer Description']"));
			driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(name);
			driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(description1);
			WebElement createCust=driver.findElement(By.xpath("//div[text()='Create Customer']"));
			bu.clickByJs(driver, createCust);
			bu.waitForInvisibilityofElement(driver,30,By.id("customerLightBox_content"));
			System.out.println(Thread.currentThread().getId());
		}
	}

	@Test
	public void deleteCustomer() throws InterruptedException {
		System.out.println("delete customer");
		driver.findElement(By.cssSelector("#container_tasks")).click();

		WebElement editBtn1 = driver.findElement(By.xpath("//div[@class='itemsContainer']/div[6]/div[@class='editButton']"));
		bu.clickByJs(driver, editBtn1);
		
		//bu.waitForVisibilityOfElementLocated(driver,20, (By.xpath("(//div[@class='actions'])[1]")));
		WebElement actionBtn = driver.findElement(By.xpath("(//div[@class='actions'])[1]"));
		bu.scrollByJs(driver, actionBtn);  //scroll into view
		bu.clickByJs(driver, actionBtn);

		WebElement deleteBtn = driver.findElement(By.xpath("(//div[@class='dropdownContainer actionsMenu'])[1]//div[@class='deleteButton']"));
		bu.clickByJs(driver, deleteBtn);

		WebElement submitBtn = driver.findElement(By.xpath("//span[@class='submitTitle buttonTitle']"));
		bu.clickByJs(driver, submitBtn);
		System.out.println(Thread.currentThread().getId());
	}
	@AfterMethod
	public void actiLogout() {
		bu.waitForVisibilityofElement(driver, 20, By.xpath("//a[@href='/own1/logout.do']"));
		driver.findElement(By.xpath("//a[@href='/own1/logout.do']")).click();
		driver.close();
	}
}
