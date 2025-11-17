package DemoTest.SeleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class imgLink {

	public static void main(String[] args) throws InterruptedException 
	{
	
		//System.setProperty("https://www.opencart.com/index.php?route=cms/demo", "C:\\Users\\Sandip Patil\\eclipse-workspace\\SeleniumTesting\\Driver\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   
	   //Maximize the Window
	   driver.manage().window().maximize();
	   
	   //implicit wait
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   
	   // Launch URL 
	   driver.get("https://www.opencart.com/index.php?route=cms/demo");	 
	   
	   // Find X-path to click on "ImageLink" : We will click on Operncart img which will load the Home Page
	   driver.findElement(By.xpath("//img[@title='OpenCart - Demo']")).click();
	   
	   String title = driver.getTitle();
	   
	  // if( driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution"))
		   if(title.equals("OpenCart - Open Source Shopping Cart Solution"))
	   {    
		   System.out.println("Test Passed");
	   }
	   else 
	   {
		   System.out.println("Test Not Passed");   
	   }
	   
	   Thread.sleep(2000);
	   driver.close();
	   
	   
	}

}
