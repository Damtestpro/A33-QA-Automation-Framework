import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import java.time.Duration;


public class BaseTest {

    @BeforeSuite
    static void setupClass() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

    @BeforeMethod
        public  void launchBrowser; ChromeDriver driver;
        {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            @AfterMethod
            public static void closeBrowser(){
            driver.quit();
        }

        protected static void navigateToPage() {

            String url = "https://apps.testpro.io/";
            driver.get(url);

        }
        public static void provideEmail(String email){
            WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
            emailField.clear();
            emailField.sendKeys("damascus.dotson@testpro.io");
        }
        public static void providePassword(String password){
                WebElement passwordField = driver.findElement(By.cssSelector("[type='passowrd']"));
                passwordField.clear();
                passwordField.sendKeys("Destro808");
        }
        public static void clickSubmit() {
                WebElement submitButton = driver.findElement(By.cssSelector(button"[type='submit']"));
                submitButton.click();
                Thread.sleep(2000);
        }




    }

}
