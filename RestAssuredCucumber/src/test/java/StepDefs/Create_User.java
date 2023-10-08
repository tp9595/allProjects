package StepDefs;

import com.POJO.Address;
import com.POJO.Company;
import com.POJO.Geo;
import com.POJO.Root;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;

import java.util.List;

import org.AppHooks.AppHooks;


public class Create_User {
	
	@Given("Create User with the help of POJO")
	public void create_user_with_the_help_of_pojo(DataTable dataTable) throws JsonProcessingException {
		
		List<List<String>> data=dataTable.cells();
		
		Root rt=new Root();
		Address ad =new Address();
		ad.setCity(data.get(5).get(1));
		ad.setStreet(data.get(3).get(1));
		ad.setSuite(data.get(4).get(1));
		ad.setZipcode(data.get(6).get(1));
		Geo ge =new Geo();
		ge.setLat(data.get(7).get(1));
		ge.setLng(data.get(8).get(1));
		rt.setAddress(ad);
		ad.setGeo(ge);
		Company cm = new Company();
		cm.setBs(data.get(13).get(1));
		cm.setCatchPhrase(data.get(12).get(1));
		cm.setName(data.get(11).get(1));
		rt.setCompany(cm);
		rt.setEmail(data.get(12).get(1));
		rt.setName(data.get(0).get(1));
		rt.setPhone(data.get(9).get(1));
		rt.setUsername(data.get(1).get(1));
		rt.setWebsite(data.get(10).get(1));
		String payload =new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(rt); 
		AppHooks.repo=
		RestAssured.given()
		//.baseUri()
		.body(payload)
		.when()
		.post("https://jsonplaceholder.typicode.com/users")
		.then().extract().response();
		
	}

}
