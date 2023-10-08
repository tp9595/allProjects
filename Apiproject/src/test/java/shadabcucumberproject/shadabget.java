package shadabcucumberproject;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;

public class shadabget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String responcebody =	given()
	
	.baseUri("https://reqres.in/")
	.queryParam("page", "2")
	.log()
	.all().when().get("api/users").then()
	.assertThat()
	.statusCode(200).extract().response().asPrettyString();
System.out.println(responcebody);
		
		
		
		
		
		
		
	}

}
