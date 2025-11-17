package demoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe 
{
   WebDriver driver;
	@Test
	 public void statrup()
	 {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://patilsandip73-trials719.orangehrmlive.com/");
		 
		
		 
     }
	@Test
	public void windup() throws InterruptedException
	{
	    Thread.sleep(5000);
		driver.quit();
	}

} 
