package com.websystique.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestDataBase {
	
//	@BeforeSuite
//	public void extrsuite() {
//		System.out.println("extra suite");
//	}
//	
//	@AfterSuite
//	public void aftersuite() {
//		System.out.println("extra  after suite");
//	}
	TestBackendConfig tb=new TestBackendConfig();
	@Test(groups= "database")
	public void testInsert(){
		
		//System.out.println(tb.url);
		System.out.println("testInsert()");
	}

	@Test(groups= "database")
	public void testUpdate(){
		System.out.println("testUpdate()");
	}

	@Test(groups= "database")
	public void testDelete(){
		System.out.println("testDelete()");

	}
}
