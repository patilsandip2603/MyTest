package DemoTest.SeleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) throws InterruptedException 
	{
	
		// Mouse Right click ==> ContextClick() methods used 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandip Patil\\eclipse-workspace\\SeleniumTesting\\Driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Driver.get("https://demoqa.com/buttons");

		WebElement dblclick_btn = Driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		Actions a = new Actions(Driver);
		
		a.contextClick(dblclick_btn).perform();
		
		Thread.sleep(5000);
		
		Driver.close();
		
		
		
	}

}
