package DemoTest.SeleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwait {

	public static void main(String[] args) 
	{
	     System.setProperty("webriver.chrome.driver", "C:\\Users\\Sandip Patil\\eclipse-workspace\\SeleniumTesting\\Driver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     
	     driver.manage().window().maximize();
	     driver.get("https://in.bookmyshow.com/explore/home/pune");
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     
	     driver.findElement(By.xpath("//img[@alt='Sunny Sanskari Ki Tulsi Kumari']")).click();
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     
	     driver.findElement(By.xpath("//div[@class='sc-qswwm9-8 fNtHgG']//span[contains(text(),'Book tickets')]")).click();
	    // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     driver.findElement(By.xpath("//div[@class='sc-zgl7vj-8 hpVUcY']")).click();
	     //driver.close();
	     
	     
	     
	}

}
