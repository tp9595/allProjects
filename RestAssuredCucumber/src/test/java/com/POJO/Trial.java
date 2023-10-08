package com.POJO;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class Trial {
	static Response repo;
	public static void main(String[] args) throws JsonProcessingException{
			Root rt=new Root();
			Address ad =new Address();
			ad.setCity("Mumbai");
			ad.setStreet("Queen Neckless");
			ad.setSuite("Marine Drive");
			ad.setZipcode("4000001");
			
			Geo ge =new Geo();
			ge.setLat("10.36.20");
			ge.setLng("96.32.36");
			
			rt.setAddress(ad);
			ad.setGeo(ge);
			
			Company cm = new Company();
			cm.setBs("Pune");
			cm.setCatchPhrase("Caring");
			cm.setName("Nagarro");
			
			rt.setCompany(cm);
			rt.setEmail("abc.xyz@nrg.com");
			rt.setName("Manas");
			rt.setPhone("420");
			rt.setUsername("m420");
			rt.setWebsite("www.new.com");
			
			
			String payload =new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(rt); 
			
			repo=
			RestAssured.given()
			.baseUri("https://jsonplaceholder.typicode.com/users")
			.body(payload)
			.when()
			.post()
			.then().log().all().extract().response();
			
			System.out.println(repo.asPrettyString());
			
	}

}
