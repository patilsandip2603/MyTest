package Common.Scenarios;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile 
{
	Properties prop;
	String path="C:\\Users\\Swami\\eclipse-workspace\\Scenarios\\src\\test\\java\\config.properties";
	
	ReadConfigFile() throws IOException
	{
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		
	}
	
	public String getUrl()
	{
		String url = prop.getProperty("url");
		
		  if(url != null )
	      return url;
		  else 
			  throw new RuntimeException("URL not found in config file");
		      
	}
	public String username()
	{
		String username = prop.getProperty("username");
		if(username!=null)
		   return username;
		else
		   throw new RuntimeException("username not found in config file");
		
	}
	public String password()
	{
		String password = prop.getProperty("password");
		if(password!= null)
			return password;
		else 
			throw new RuntimeException("password not found in config file");
	}

}
