package Apitesting.Apiproject;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Postmethodcompayscernario extends Objecttojsonmethod 
{
void postrequest() throws Exception
{
	RestAssured.baseURI ="";
	given().body( payloadmethod()).log().all().
	when().post().
	then();
}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Postmethodcompayscernario obj = new Postmethodcompayscernario();
		obj.postrequest();
		
	}

}
