import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.time.Duration;

public class LoginTests extends BaseTest {

    @Test
    public static void LoginTest() {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
<<<<<<< Updated upstream

        String url = "https://bbb.testpro.io/";
        driver.get(url);




        Assert.assertEquals(driver.getCurrentUrl(), url);
=======
//load page
        String url = "https://testpro.io/";
        driver.get(url);
        //email field
        WebElement emailfield = driver.findElement(By.cssSelector("[type='email']"));
        WebElement.click();
        emailfield.sendKeys("damascus.dotson@testpro.io");

        WebElement passwordfield = driver.findElement(By.cssSelector("[type='password']"));
        WebElement.click();
        passwordfield.sendKeys("Destro808");

        WebElement usersAvatar = driver.findElement(By.xpath(("[alt='Avatar of student]")));
        Assert.assertTrue(usersAvatar.isDisplayed());
>>>>>>> Stashed changes
        driver.quit();


    }
}
