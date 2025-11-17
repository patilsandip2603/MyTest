package DemoTest.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipDemo {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Sandip Patil\\\\eclipse-workspace\\\\SeleniumTesting\\\\Driver\\\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 //
		 driver.get("https://www.facebook.com/");
		 String Actualtooltip  = driver.findElement(By.xpath("//a[normalize-space()='Sign Up']")).getAttribute("title");
		 String Expectedtooltip = "Sign up for Facebook";
		 
		 if(Expectedtooltip.equals(Actualtooltip))
		 {
			 System.out.println("Passed");
		 }
		 else
		 {
			 System.out.println("Failed");
				
		 }		 
		 
		 driver.close();
		 
		 
	}

}
