package org.baseutilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
/*
 * this method is used to load the properties from property files
 * @return it returns Properties prop object
 */
	private Properties prop;
	public  Properties initprop()
	{
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("./src/test/Resource/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
}
