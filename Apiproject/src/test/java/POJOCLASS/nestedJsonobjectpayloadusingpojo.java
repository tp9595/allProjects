package POJOCLASS;

import io.restassured.RestAssured;

public class nestedJsonobjectpayloadusingpojo {

	public static void main(String[] args) {
		employee emp = new employee();
		emp.setFirstname("tushar");
		emp.setLastname("padalkar");
		emp.setAge("25");
		emp.setSalery("2500");
		
		Address  obj = new Address();
		obj.setBuildname("shrikupa");
		obj.setCity("banglore");
		obj.setCountry("india");
		obj.setFlatno("121");
		obj.setState("karnata");
		emp.setAddress(obj);
		
		 RestAssured
		   .given()
		   .log()
		   .all()
		   .body(emp)
		   .post();
		
		
		
		
	}
	
	
}
