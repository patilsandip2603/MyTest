package ConfigurationFileDemo.ConfigurationFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader 
{
	Properties prop;
	File path = new File("C:\\Users\\Swami\\eclipse-workspace\\ConfigurationFile\\config.properties"); 
	
	ConfigFileReader() throws IOException
	{
		prop=new Properties();
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		
	}
	
	public String getUrl()
	{
		String url = prop.getProperty("url");
		return url;
		
	}
	public String username()
	{
		String username = prop.getProperty("username");
		return username;
		
	}
	public String password()
	{
		String password = prop.getProperty("password");
		return password;
		
	}
	
	

}

