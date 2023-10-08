package myreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class genicreport {

  static ExtentReports report;
  static ExtentTest test;
  
  @BeforeClass
  public void start()
  {
	  report = new ExtentReports(System.getProperty("user.dir")+"mytusharreport.html");
	  test = report.startTest("Demo");
	  
  }
@Test
  void driverinvoke()
  {
	  System.setProperty("webdriver.chrome.driver","D:/Users/akshay/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://www.google.co.in/");
		String titlr = driver.getTitle();
		if(titlr.equalsIgnoreCase("google"))
		{
			test.log(LogStatus.PASS, "title is matched and test case is pass");
		}
		else 
		{
			test.log(LogStatus.FAIL, "title is unmatched and test case is fail");
	
		}
  }
   @AfterClass
   void end()
   {
	report.endTest(test);
	report.flush();
   }
}
//Exception in thread "main" java.lang.UnsupportedClassVersionError: org/testng/TestNGException has been compiled by a more recent version of the Java Runtime (class file version 55.0), this version of the Java Runtime only recognizes class file versions up to 52.0
//at java.lang.ClassLoader.defineClass1(Native Method)
//at java.lang.ClassLoader.defineClass(ClassLoader.java:756)
//at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:142)
//at java.net.URLClassLoader.defineClass(URLClassLoader.java:473)
//at java.net.URLClassLoader.access$100(URLClassLoader.java:74)
//at java.net.URLClassLoader$1.run(URLClassLoader.java:369)
//at java.net.URLClassLoader$1.run(URLClassLoader.java:363)
//at java.security.AccessController.doPrivileged(Native Method)
//at java.net.URLClassLoader.findClass(URLClassLoader.java:362)
//at java.lang.ClassLoader.loadClass(ClassLoader.java:418)
//at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:355)
//at java.lang.ClassLoader.loadClass(ClassLoader.java:351)
//at java.lang.Class.getDeclaredMethods0(Native Method)
//at java.lang.Class.privateGetDeclaredMethods(Class.java:2701)
//at java.lang.Class.privateGetMethodRecursive(Class.java:3048)
//at java.lang.Class.getMethod0(Class.java:3018)
//at java.lang.Class.getMethod(Class.java:1784)
//at sun.launcher.LauncherHelper.validateMainClass(LauncherHelper.java:650)
//at sun.launcher.LauncherHelper.checkAndLoadMain(LauncherHelper.java:632)

