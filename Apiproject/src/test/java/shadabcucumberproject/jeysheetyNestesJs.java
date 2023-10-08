package shadabcucumberproject;



import io.restassured.path.json.JsonPath;
public class jeysheetyNestesJs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	String payload =" {\r\n"
			+ "  \"dashboard\": {\r\n"
			+ "    \"purchaseAmount\": 910,\r\n"
			+ "    \"website\": \"rahulshettyacademy.com\"\r\n"
			+ "  },\r\n"
			+ "  \"courses\": [\r\n"
			+ "    {\r\n"
			+ "      \"title\": \"Selenium Python\",\r\n"
			+ "      \"price\": 50,\r\n"
			+ "      \"copies\": 6\r\n"
			+ "    },\r\n"
			+ "    {\r\n"
			+ "      \"title\": \"Cypress\",\r\n"
			+ "      \"price\": 40,\r\n"
			+ "      \"copies\": 4\r\n"
			+ "    },\r\n"
			+ "    {\r\n"
			+ "      \"title\": \"RPA\",\r\n"
			+ "      \"price\": 45,\r\n"
			+ "      \"copies\": 10\r\n"
			+ "    }\r\n"
			+ "  ]\r\n"
			+ "}";
	
	JsonPath js = new JsonPath(payload);
	int count =js.getInt("courses.size()");
	System.out.println(count);
	
	String titile=js.getString("courses[0].title");
	System.out.println(titile);
	
	for(int i=0;i<count;i++)
	{
		String allcouses=js.get("courses["+i+"].title");
		System.out.println(js.get("courses["+i+"].price"));
		System.out.println( allcouses);
	}
	
	System.out.println("print rpa copies");
    
	for(int i=0;i<count;i++)
	{
		String allcouses=js.get("courses["+i+"].title");
		if(allcouses.equalsIgnoreCase("RPA"))
		{
			System.out.println( js.get("courses["+i+"].copies"));
			
		}
	}
	System.out.println("total purchasamount");
	for(int i=0;i<count;i++)
	{
		String allcouses=js.get("courses["+i+"].title");
	int price =js.get("courses["+i+"].price");
	int copies =js.get("courses["+i+"].copies");
	int amount = price*copies;
	System.out.println(amount);
	
		
	}
}}
