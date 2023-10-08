package com.reqre.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.reqre.base.Testbase;
import com.reqre.utility.restutils;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class TC01_GetUser extends Testbase {

	@BeforeClass
	void getalluser() throws InterruptedException {
		
		setup();
		logger.info("-----Started  TC01_GetUser------");

		RestAssured.baseURI = "https://reqres.in/";
		httepreq = RestAssured.given();
		response = httepreq.request(Method.GET, "/api/users?page=2");
		Thread.sleep(3000);
	}

	@Test
	void checkResponcebody() {
		logger.info("-----check responce body ------");
		String responcebody = response.getBody().asPrettyString();
		logger.info("responce body==> " + responcebody);
		Assert.assertTrue(responcebody != null);

	}

	@Test
	void checkStatus() {
		logger.info("-----check status code ------");
		int statuscode = response.getStatusCode();
		logger.info("status code ==>" + statuscode);
		restutils.checkstatuscode(response);
	}

	@Test
	void Checkresponcetime() {
		logger.info("-----check Responce time ------");
		long responcetime = response.getTime();
		logger.info("responce time is  ==>" + responcetime);
		if (responcetime > 5000)
			logger.warn("responce time is greater than 500");
		Assert.assertTrue(responcetime < 5000);
	}

	@Test
	void Checkstatusline() {
		logger.info("-----check Responce line ------");
		String statusline = response.getStatusLine();
		logger.info("status line  is  ==>" + statusline);

		Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
	}
	
	@AfterClass
	void teardown()
	{
		logger.info("-----Finished  TC01_GetUser------- ");
	}

}
