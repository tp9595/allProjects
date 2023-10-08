package Apitesting.Apiproject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class postrequest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

RestAssured
   .given()
		.log()
		.all()
		.baseUri("https://reqres.in/")
		.basePath("api/users")
		.body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\",\r\n"
				+ "    \"id\": \"305\",\r\n"
				+ "    \"createdAt\": \"2022-10-11T05:15:32.020Z\"\r\n"
				+ "}")
		.contentType(ContentType.JSON)
   .when()
		.post()
		.then().statusCode(201);
	}

}
