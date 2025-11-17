package selenium_Package;

import org.openqa.selenium.chrome.ChromeDriver;

public class browser_launch_Demo 
{

	public static void main(String[] args) 
	{
         System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandip Patil\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
         ChromeDriver driver= new ChromeDriver();
        
         driver.get("https://www.google.com/");
        // driver.navigate().to("https://www.google.com/");
         
         //Print the title of the webpage 
         String title = driver.getTitle();
         System.out.println(title);
         
         //close the driver
         driver.close();
         
         
	}

}
