package Apitesting.Apiproject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class extrctresponceasstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String responcebody =	RestAssured.given()
		
		.baseUri("https://reqres.in/")
		.basePath("api/users")
		.body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\",\r\n"
				+ "    \"id\": \"305\",\r\n"
				+ "    \"createdAt\": \"2022-10-11T05:15:32.020Z\"\r\n"
				+ "}")
		.contentType(ContentType.JSON)
		//hit the request and get the responce
		.post()
		//validate the response
		.then()
		.extract()
		.body()
		.asString();
	 System.out.println(responcebody);
		
	}

}
