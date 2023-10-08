package Apitesting.Apiproject;

import java.util.List;

import io.restassured.path.json.JsonPath;

public class restass30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String jasonarrray = "[\r\n"
 		+ "  {\r\n"
 		+ "    \"firstName\": \"Harsha\",\r\n"
 		+ "    \"lastName\": \"Sapkal\",\r\n"
 		+ "    \"age\": 25,\r\n"
 		+ "   \"email\": \"jhjhh@gmail.com\",\r\n\""
 		+ "    \"address\":\"nadura \"\r\n"
 		+ "     \r\n"
 		+ "  },\r\n"
 		+ "  {\r\n"
 		+ "    \"firstName\": \"Amol\",\r\n"
 		+ "    \"lastName\": \"Sapk\",\r\n"
 		+"      \"email\": \"jhjhh@gmail.com\",\r\n\""
 		+ "    \"son age\": 15,\r\n"
 		+ "    \"address1\": \"hkjhkj\"\r\n"
 		+ "  }\r\n"
 		+ "]";
 
 JsonPath jsonpa = new JsonPath(jasonarrray);
 System.out.println(jsonpa.getString("[0].firstName"));
 List <String> allfirstnames =jsonpa.getList("firstName");
 System.out.println(allfirstnames);
 List <String> ssss =	jsonpa.getList("finaAll{it.gender =='female'}.firstName");
 System.out.println(ssss);
 String emailid =jsonpa.getString("find{it.firstName=='Harsha'& it.lastName =='Sakpak'}.email");
 System.out.println(emailid);
	}

}
