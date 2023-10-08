package org.testNgITestListnerStore;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class AppListners implements ITestListener  {
	

		public void onTestStart(ITestResult result) {
			System.out.println("onTestStart :"+result.getName());
			Reporter.log("on Test Start :"+result.getName());
			
		}

		public void onTestSuccess(ITestResult result) {
			System.out.println("on Test Success : "+result.getName());
			Reporter.log("on Test Success : "+result.getName());
			
		}

		public void onTestFailure(ITestResult result) {
			System.out.println("on Test Failure : "+result.getName());
			Reporter.log("on Test Failure :"+result.getName());
			
		}

		public void onTestSkipped(ITestResult result) {
			System.out.println("on Test Skipped : "+result.getName());
			Reporter.log("on Test Skipped :"+result.getName());
			
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			System.out.println("on Test Failed But Within Success Percentage : "+result.getName());
			Reporter.log("on Test Skipped :"+result.getName());	
			
		}

		public void onStart(ITestContext context) {
			System.out.println("******on Start*******");
			Reporter.log("******on Start*******");	
			
		}

		public void onFinish(ITestContext context) {
			System.out.println("******on Finish*******");
			Reporter.log("******on Finish*******");
			
		}
}
		
		

