package DemoTest.SeleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions 
{

	public static void main(String[] args) throws InterruptedException 
	{
        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandip Patil\\eclipse-workspace\\SeleniumTesting\\Driver\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/ref=nav_logo");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        Actions a = new Actions(driver);
        
        // Hover 
        a.moveToElement(driver.findElement(By.xpath("//span[@class='nav-line-2 ']"))).build().perform();
        
       // Click  
        a.moveToElement(driver.findElement(By.xpath("//a[@href='/gp/css/homepage.html?ref_=nav_AccountFlyout_ya']"))).click().build().perform();
        driver.navigate().back();
       
        // Double click  
       a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().sendKeys("MemoryCard").doubleClick().build().perform();
        																											// a.doubleClick(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")));
       
       // Right Click           
       a.moveToElement(driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']"))).contextClick().build().perform();
       
       
        Thread.sleep(10000);
        driver.close();
        
           
		
	}

}
