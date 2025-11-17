package DemoTest.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_webpage 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Sandip Patil\\eclipse-workspace\\SeleniumTesting\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(9000);
		
		String currentwindowhandle = driver.getWindowHandle();
		driver.switchTo().window(currentwindowhandle);
		//driver.findElement(null)
		
		
		//driver.close();
	}

}
