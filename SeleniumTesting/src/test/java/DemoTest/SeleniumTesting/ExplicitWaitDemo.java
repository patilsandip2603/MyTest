package DemoTest.SeleniumTesting;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@SuppressWarnings("unused")
public class ExplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Sandip Patil\\\\eclipse-workspace\\\\SeleniumTesting\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.flipkart.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Mobiles & Tablets')]")));

		WebElement mobiles = driver.findElement(By.xpath("//span[contains(text(),'Mobiles & Tablets')]"));
		Actions a = new Actions(driver);
		a.moveToElement(mobiles);
		Thread.sleep(2000);
		
		mobiles.click();
		
		
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
