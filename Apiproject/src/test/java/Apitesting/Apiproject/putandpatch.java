package Apitesting.Apiproject;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class putandpatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          given()
		.log()
		.all()
		.baseUri("https://reqres.in/")
		.basePath("api/users")
		.body("{\r\n"
				+ "    \"name\": \"morp\",\r\n"
				
				
				+ "}")
		.contentType(ContentType.JSON)
		//hit the request and get the responce
		.patch()
		//validate the response
		.then()
		.log()
		.all()
		.statusCode(201);
		
		
	}
		
		
		
		
		
	}


