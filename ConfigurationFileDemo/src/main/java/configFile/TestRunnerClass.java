package configFile;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRunnerClass {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
	
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//ConfigFileReader class object needed to access the method and variable 
		ConfigFileReader config = new ConfigFileReader();
		//get url from config file 
		driver.get(config.getUrl());
		
		//get user-name from config file 
		driver.findElement(By.id("user-name")).sendKeys(config.username());;
		
		// get password from config file 
		driver.findElement(By.id("password")).sendKeys(config.password());;
		
		//Login Button click directly
		driver.findElement(By.id("login-button")).click();
				
		Thread.sleep(5000);
		driver.quit();
		
	}

}
