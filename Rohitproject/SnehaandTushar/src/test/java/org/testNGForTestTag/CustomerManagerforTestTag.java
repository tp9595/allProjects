package org.testNGForTestTag;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.selenium_01utilities.BaseUtilityUpdated;
import org.selenium_01utilities.Configwithconstr;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CustomerManagerforTestTag {

	WebDriver driver=null;
	Configwithconstr crread;
	BaseUtilityUpdated bobj;
	String description1;
	String name;
	Object name1;
	String url;
	String bName;
	String uName;
	String pwd;
	
	@BeforeTest
	public void getBrowserDetails() {
		crread = new Configwithconstr("./PropertiesFile/Actitime.properties");
		bName = crread.getPropertyValue("browserNameCH");
		
	}
	
	@BeforeClass
	public void getCustomerData() throws EncryptedDocumentException, IOException {
		crread = new Configwithconstr("./PropertiesFile/Actitime.properties");
		bobj = new BaseUtilityUpdated();
		url = crread.getPropertyValue("url");
		//bName = crread.getPropertyValue("browserName");
		//Declared in @BeforeTest Here we need run suite on two different browser
		uName = crread.getPropertyValue("userName");
		pwd = crread.getPropertyValue("password");
	}

	@BeforeMethod
	public void loginActitime() {
		BaseUtilityUpdated bobj = new BaseUtilityUpdated();
		driver = bobj.startup(bName,url);
		//username
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uName);
		//password
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pwd);
		//login button
		driver.findElement(By.cssSelector("#loginButton")).click();

	}
	@Test
	public void createCusomer() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.findElement(By.cssSelector("#container_tasks")).click();
		for(int i=1; i<=4; i++) {

			WebElement newBtn = driver.findElement(By.xpath("//div[text()='Add New']"));
			bobj.clickByJs(driver, newBtn);
			
			bobj.waitForVisibilityofElement(driver, 20, By.xpath("//div[@class='item createNewCustomer']"));
			driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();

			name =	(String) bobj.returnDataOfAnyCellWithRespectToTableHeading("C:\\Acceleartion\\New Workpace\\Feb_13_17_Selenium\\ExcelFile\\TestData.xlsx","CustomerData","CustomerName",i);
			description1 = (String) bobj.returnDataOfAnyCellWithRespectToTableHeading("C:\\Acceleartion\\New Workpace\\Feb_13_17_Selenium\\ExcelFile\\TestData.xlsx","CustomerData","Description",i);


			driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(name);
			driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(description1);
			driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
			Thread.sleep(10000);
		}
	}

	@Test
	public void deleteCusomer() {
		
		driver.findElement(By.cssSelector("#container_tasks")).click();
		WebElement editbtn=driver.findElement(By.cssSelector("div[class='itemsContainer']>div:nth-child(6)>:last-child"));
		//Actions act = new Actions(driver);
		//act.moveToElement(editbtn).perform();
		//driver.findElement(By.cssSelector("div[class='itemsContainer']>div:nth-child(6)>:last-child"));
		bobj.scrollByJs(driver, editbtn);
		bobj.clickByJs(driver, editbtn);
		WebElement actionBtn=driver.findElement(By.xpath("(//div[@class='action'])[1]"));
		bobj.waitForVisibilityofElement(driver, 20, By.xpath("(//div[@class='action'])[1]"));
	//	bobj.scrollByJs(driver, actionBtn);
		bobj.clickByJs(driver, actionBtn);
		
		driver.findElement(By.cssSelector("[class='deleteButton']>div")).click();
		//bobj.waitForVisibilityofElement(driver,20,By.xpath("(//div[@class='buttonIcon']//span)[2]"));
		WebElement finalDelete=driver.findElement(By.xpath("(//div[@class='buttonIcon']//span)[2]"));
		bobj.clickByJs(driver,finalDelete);
		
	}

	@AfterMethod
	public void actiLogout() {
		bobj.waitForVisibilityofElement(driver, 20, By.xpath("//a[@href='/own1/logout.do']"));
		driver.findElement(By.xpath("//a[@href='/own1/logout.do']")).click();
	}
}
	




