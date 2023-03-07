import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


public class BaseTest {

    @BeforeSuite
    static void setupClass() {
        WebDriverManager.chromedriver().setup();

        public void searchSong (songTitlekeyword) throws InterruptedException {
            WebElement searchField = driver.findElement(By.cssSelector("div#searchform input[type=search]"));
            searchField.sendkeys(songTitleKeyword);
            Thread.sleep(2000);
        }
        public void clickViewAllBtn () throws InterruptedException {
            WebElement veiwAllsearchResults = driver.findElement(By.cssSelector("div.results section.songs h1 button"));
            clickViewAllBtn.click();
            Thread.sleep(2000);
        }
        public void selectFirstSongResult() throws InterruptedException {
            WebElement firstSongResult = driver.findElement(By.cssSelector("section#songResultWrapper tr.song-item td.title"));
            firstSongResult.click();
            Thread.sleep(2000);
        }
        public void clickAddToBtn() throws InterruptedException {
            WebElement addToBtn = driver.findElement(By.cssSelector("button.btn-add-to"));
            addToBtn.click();
            Thread.sleep(2000);
        }
        public void choosePlaylist () throws InterruptedException {
             WebElement choosePlaylist = driver.findElement(By.xpath(//*[@id="playlists"]/ul/li[7]/a));
                     choosePlaylist.click();
                     Thread.sleep(2000);
        }
        public String getNotificationText(){
            WebElement notificationElement = driver.findElement(By.cssSelector("div.success.show"));
            return notificationElement.getText();
        }

    }

}
