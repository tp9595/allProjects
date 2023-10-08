package Apitesting.Apiproject;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

//import io.cucumber.java.en.Then;

public class Httpmethod {
	
	void getMethod()
	{
		String url ="https://reqres.in/";//"https://rahulshettyacademy.com";
		String resource ="/api/users?page=2" ;//"/maps/api/place/add/json";
		RestAssured.baseURI=url;
	given().log().all().
	when().get(resource).
	then().statusCode(200).log().all().statusLine("HTTP/1.1 200 OK").body("", null);
	      
	
	}

	
	
	public static void main(String[] args) {
		Httpmethod obj = new Httpmethod();
		obj.getMethod();
	}
}
