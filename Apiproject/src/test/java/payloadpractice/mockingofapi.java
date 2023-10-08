package payloadpractice;

import io.restassured.RestAssured;

public class mockingofapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 RestAssured
		   .given()
		   .log()
		   .all()
		   .get("https://run.mocky.io/v3/19fe0518-4aee-4d3a-9bdb-0039621f0da0");
		
		
		
		
	}

}
