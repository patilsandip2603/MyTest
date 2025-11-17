package DemoTest.SeleniumTesting;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_selector_automate 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Launch a chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandip Patil\\eclipse-workspace\\SeleniumTesting\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //Open a Swag Lab web page
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
        
        // inspect username 
         driver.findElement(By.id("user-name")).sendKeys("standard_user");
         
         // inspect password 
         driver.findElement(By.id("password")).sendKeys("secret_sauce");
         
         //Inspect login button 
         driver.findElement(By.id("login-button")).click();
        
         Thread.sleep(2000);
         
         // Current window handle 
         
         String currentwindow = driver.getWindowHandle();
         driver.switchTo().window(currentwindow);
         
        // driver.findElement(By.linkText("Sauce Labs Backpack")).click();
        
        // driver.findElement(By.linkText("ADD TO CART")).click();
         //driver.quit();
         
         // List of webElements 
         	java.util.List<WebElement> elementsList = driver.findElements(By.partialLinkText("Sauce"));
         	System.out.println("size of webelements : " +elementsList.size());
	}

}
