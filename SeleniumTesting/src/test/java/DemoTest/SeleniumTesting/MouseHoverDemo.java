package DemoTest.SeleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		
		// Mouse Hover ==> MoveToElement methods used 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandip Patil\\eclipse-workspace\\SeleniumTesting\\Driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Driver.get("https://www.flipkart.com/");
		
		WebElement btn = Driver.findElement(By.xpath("//span[normalize-space()='Login']"));
		
		Actions act = new Actions(Driver);
		
		act.moveToElement(btn).perform();
		
		Thread.sleep(5000);
		
		
		
		
	}

}
