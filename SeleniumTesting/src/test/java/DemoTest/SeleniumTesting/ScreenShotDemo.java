package DemoTest.SeleniumTesting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotDemo {

	public static void main(String[] args) throws IOException 
	{
	   System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Sandip Patil\\\\eclipse-workspace\\\\SeleniumTesting\\\\Driver\\\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   
	   driver.get("https://in.linkedin.com/");
	   
	   //
           TakesScreenshot ts = ((TakesScreenshot)driver);
           
           File src = ts.getScreenshotAs(OutputType.FILE);
           
           File dest = new File("C:\\Users\\Sandip Patil\\eclipse-workspace\\SeleniumTesting\\ScreenshotsFolder\\SssdS.jpg");
           
           FileHandler.copy(src, dest);
           
           driver.close();
           
		/*
		 * TakesScreenshot ts = ((TakesScreenshot) driver); File src =
		 * ts.getScreenshotAs(OutputType.FILE); File dest = new
		 * File("C:\\Users\\Sandip Patil\\eclipse-workspace\\SeleniumTesting\\ScreenshotsFolder\\SS.jpg"
		 * ); FileUtils.copyFile(src,dest);
		 */
	   
	   
	   
	}

}
