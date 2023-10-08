package org.selenium_02basicProgram;

import org.selenium_01utilities.BaseUtility;
import org.selenium_01utilities.BaseUtilityUpdated;

public class EX4 {

	public static void main(String[] args) {
		//String browserName = "CH";
		//String url ="https://id.atlassian.com/login";
		//We can provide declared variable or hard coded value also.
		BaseUtility obj = new BaseUtility ();
		//obj.startup(browserName, url);
		//BaseUtilityUpdated obj =new BaseUtilityUpdated();
		obj.startup("CH","https://id.atlassian.com/login");
		obj.startup("ff","https://id.atlassian.com/login");
		obj.startup("ed","https://id.atlassian.com/login");
		
		//

	}

}
