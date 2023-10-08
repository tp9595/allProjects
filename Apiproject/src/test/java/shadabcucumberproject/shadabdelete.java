package shadabcucumberproject;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class shadabdelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	         Response responcebody=     	given()
				.baseUri("https://reqres.in/")
				
				.log().all()
				.when().delete("api/users/2").then().assertThat()
				.statusCode(204).extract()
				.response();
	       String serverHeader = responcebody.header("server");
	         System.out.println(serverHeader);
		
		
		
	}

}
