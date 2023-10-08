package utilitypackag;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
Properties pro;
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");
		try {
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
		}catch(Exception e)
		{
			System.out.println("exception");
		}
	}
	
	public String getapplicationurl()
	{
		String urle = pro.getProperty("url");
		return urle;
	}
	
	public String getusername()
	{
		String username = pro.getProperty("userName");
		return username;
	}
	
	public String getpassword()
	{
		String Password = pro.getProperty("Password");
		return Password;
	}
	public String getchromepath()
	{
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
}
