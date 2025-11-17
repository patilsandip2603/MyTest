package DemoTest.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_selector 
{

	public static void main(String[] args) throws InterruptedException 
	{
	   //Launch Chrome Driver 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandip Patil\\eclipse-workspace\\SeleniumTesting\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       
        //Launch swaglab 
        driver.get("https://www.saucedemo.com/v1/");
        
        // Username : standard_user
        //Password : secret_sauce
        
      
        // locate with tagname#value
        
    driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
    
        
        // locate with tagname[attribute = value]
    
    driver.findElement(By.cssSelector("input[id=password]")).sendKeys("secret_sauce");
    
    
    // locate with tagname.valueofclass
    
    driver.findElement(By.cssSelector("input.btn_action")).click();
    
    String currentwindowhandle = driver.getWindowHandle();
    
    driver.switchTo().window(currentwindowhandle);
    
   // driver.findElement(By.partialLinkText("Backpack")).click();
  //   driver.findElement(By.cssSelector(""))
        
        // locate with tagname.value
        
   // Thread.sleep(5000);
       
   //  driver.quit();
        
        
        
	}

}
