package DemoTest.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_demo {

	public static void main(String[] args) throws InterruptedException 
	{
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandip Patil\\eclipse-workspace\\SeleniumTesting\\Driver\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   
	   driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	   
	   WebElement dropdown = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
	   
	   Select s = new Select(dropdown);
	   
	   //s.selectByIndex(5);
	   //s.selectByValue("IND");
	   s.selectByVisibleText("India");
	   Thread.sleep(5000);
	   driver.close();

	}

}
