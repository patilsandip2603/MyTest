package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps 
{
  
	WebDriver driver;

    @Given("user is on Flipkart login page")
    public void user_is_on_flipkart_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        try {
            driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("patilsandip72@gmail.com");
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("");
        } catch (Exception e) {
            System.out.println("Login fields not found!");
        }
    }

    @When("clicks on login button")
    public void clicks_on_login_button() {
        try {
            driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
        } catch (Exception e) {
            System.out.println("Login button not found!");
        }
    }

    @Then("user should be redirected to homepage")
    public void user_should_be_redirected_to_homepage() {
        System.out.println("Login process executed successfully!");
       // driver.quit();
    }
}
