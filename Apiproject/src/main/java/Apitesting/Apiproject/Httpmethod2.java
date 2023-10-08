package Apitesting.Apiproject;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Httpmethod2 {

	void postMethod()
	{
		String url ="https://rahulshettyacademy.com";
		String resource ="/maps/api/place/add/json";
		String payload ="{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"Frontline house\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"shoe park\",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n"
				+ "}\r\n"
				+ "";
		RestAssured.baseURI=url;
		
		
		
		given().queryParam(payload, "key","qaclick123").body(payload).log().all().///"key","qaclick123"
		when().post(resource).
		then().statusCode(200).log().all();
		
	}
		public static void main(String[] args) {
			Httpmethod2 obj = new Httpmethod2();
			obj.postMethod();
		}
	
}
