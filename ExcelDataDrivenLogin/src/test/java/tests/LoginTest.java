package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ExcelUtils;

public class LoginTest {

    public static void main(String[] args) throws Exception {

        // Excel file path
        String excelPath = "src/test/resources/TestData.xlsx";

        // Read username & password from Excel
        String username = ExcelUtils.getCellData(excelPath, "Sheet1", 1, 0);
        String password = ExcelUtils.getCellData(excelPath, "Sheet1", 1, 1);

        // Setup browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.expandtesting.com/login");  // sample login page
     

        // Enter credentials
        driver.findElement(By.id("username")).sendKeys("practice");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.name("submit-login")).click();

        driver.quit();
    }
}