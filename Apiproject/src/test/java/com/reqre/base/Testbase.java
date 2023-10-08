package com.reqre.base;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Testbase {
 public static RequestSpecification httepreq;
 public static Response response;
	
	
	public Logger logger;
	
	
	public void setup()
	{
		logger= Logger.getLogger("ApiTesting");
		PropertyConfigurator.configure("Log4j.properties");
		logger.setLevel(Level.DEBUG);
		
	}
}
