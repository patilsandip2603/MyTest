package DemoTest.SeleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConfirmDemo {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandip Patil\\eclipse-workspace\\SeleniumTesting\\Driver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     
	     // URL to Open 
	     driver.get("https://vinothqaacademy.com/alert-and-popup/");
	     
	     driver.findElement(By.xpath("//button[normalize-space()='Confirm Alert Box']")).click();
	     
	     
	     //Alert access 
	     Thread.sleep(5);
	     //driver.switchTo().alert().accept();    // Accpet 
	     driver.switchTo().alert().dismiss();	  // Dismiss	
		 
	}

}
