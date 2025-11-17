package Common.Scenarios;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRunnerClass {

	public static void main(String[] args) throws IOException 
	{
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		ReadConfigFile configfile = new ReadConfigFile();
		
		driver.manage().window().maximize();
		driver.get(configfile.getUrl());
		
		driver.findElement(By.id("user-name")).sendKeys(configfile.username());
		
	    driver.findElement(By.id("password")).sendKeys(configfile.password());
	    
	    driver.findElement(By.id("login-button")).click();
	    
	    driver.quit();
		
		
	}

}
