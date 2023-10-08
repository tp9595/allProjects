package org.AppHooks;


import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.reqres.utilities.ExcelUtiltyByMe;
import com.reqres.utilities.RestUtils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.response.Response;

public class AppHooks {
	
	public static RestUtils reu;
	public static Logger logger;
	public static Response repo;
	
	
	public static ExcelUtiltyByMe exutil;
	@Before
	public  void preequi(Scenario scn) {	
	exutil=new ExcelUtiltyByMe("./forPayLoad.xlsx","Data");
	reu=new RestUtils();
	logger = Logger.getLogger("ReqresAPITesting");//Initiate the logger class
	PropertyConfigurator.configure("Log4j.properties");//Used internally to keep track of configured appenders
	logger.setLevel(Level.DEBUG);//SET LOGGER
	logger.info(scn.getName()+" Is started");
	}

	@After
	public  void tearDown(Scenario scn) {
			
		if(scn.isFailed()) {
		logger.error(scn.getName()+" Is Failed");
		System.out.println(scn.getName()+"Is falied");
		}
		reu =null;
	}
}
