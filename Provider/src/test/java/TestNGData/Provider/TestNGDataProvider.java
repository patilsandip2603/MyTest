package TestNGData.Provider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDataProvider 
{

	WebDriver driver;
	@BeforeMethod
	public void startup()
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	}
	@Test(dataProvider="data")
	public void giveinput(String keyword)
	{
		WebElement searchbox = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		searchbox.sendKeys(keyword);
		searchbox.sendKeys(Keys.ENTER);
	}
	@DataProvider(name="data")
	public Object[][] searchDataProviderMethod()
	{
	    Object[]	[] searchdata = new Object[2][1];
	    searchdata[0][0]="Samsung Mobiles";
	    searchdata[1][0]="Realmi Mobiles";
	    
		return searchdata;
	    
	}
	@AfterMethod
	public void windup() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
		
	}
	
}
