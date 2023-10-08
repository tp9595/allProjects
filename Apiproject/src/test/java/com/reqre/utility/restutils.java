package com.reqre.utility;

import org.testng.Assert;

import io.restassured.response.Response;

public class restutils {

	
	
	public static void checkstatuscode(Response res)	
	{
		Assert.assertEquals(res.getStatusCode(),200,"status checked failed");
	}
	
	public static void checkstatuscode(int code ,Response res)	
	{
		Assert.assertEquals(res.getStatusCode(),code,"status checked failed");
	}
	
	public static void checkcontenttype(String contentType ,Response res)	
	{
		Assert.assertEquals(res.header("content-Type"),contentType,"status checked failed");
	}

	public static  void checkServer(String server, Response res) {
		Assert.assertEquals(res.header("Server"), server);
	}

	public  void checkContentEncoding(String contentEncoding, Response res) {
		Assert.assertEquals(res.header("Content-Encoding"), contentEncoding);
	}

	public static  void checkStatusLine(String statusLine, Response res) {
		Assert.assertEquals(res.getStatusLine(), statusLine);
	}
	public static void checkResponseTime(long time, Response res) {
		Assert.assertTrue(res.getTime() < time);
	}
}    


