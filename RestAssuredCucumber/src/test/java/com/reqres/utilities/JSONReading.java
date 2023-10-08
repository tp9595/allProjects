package com.reqres.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONReading {

	public String getJSONData(String key, String JSONFilePath) throws FileNotFoundException {
		String jsonData = "";
		JSONParser parser = new JSONParser();
		FileReader fr=new FileReader(JSONFilePath);
		try {
			Object obj = parser.parse(fr);
			JSONObject jsonObject = (JSONObject) obj;
			jsonData = (String) jsonObject.get(key);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return jsonData;
	}

//	public static void main(String[] args) {
//		JSONReading obj = new JSONReading();
//		try {
//			System.out.println(obj.getJSONData("name",
//					"./src/test/resources/CreateUserData.json"));
//		} catch (Exception e) {
//			System.out.println("Not data found" + e);
//		}
//	}
	
	public String getJsonDataString(String key, String JSONFilePath)
	{
		Object obj = null;
		try {
			obj=new JSONParser().parse(new FileReader (JSONFilePath));
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//typecasting the object jsonobject
		JSONObject jo=(JSONObject) obj ;
		String jsondata = (String) jo.get(key);
		return  jsondata;
	}

}
