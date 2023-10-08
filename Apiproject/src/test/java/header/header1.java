package header;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class header1 {

	
@Test
	public void header1() {
		// TODO Auto-generated method stub

		RestAssured
		.given()
		.log()
		.all()
		.header("Header1","value1")
		.header("Header2","value1", "value2", "value3")
		.when()
		.get();
		
		
		
		
	}


@Test
public void header2() {
	// TODO Auto-generated method stub

	RestAssured
	.given()
	.log()
	.all()
	.header("Header1","value1") //same header but value will be differnt
	.header("Header1","value2")
	.when()
	.get();
	
	
	
	
}
}
