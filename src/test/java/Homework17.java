import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework17 extends BaseTest{

    @Test
    public void addSongToPlaylist throws interruptedException {

        String newSongAddedNotificationText = "Added 1 song into";

        navigateToPage();
        provideEmail("damascus.dotson@testpro.io");
        providePassword("Destro808");
        clickSubmit();
        searchSong(songTitleKeyword"BossStatus");
        clickViewAllBtn();
        selectFirstSongResult();
        clickAddToBtn();
        choosePlaylst();
        Assert.assertTrue(getNotificationTest().contains(newSongAddedNotificationText);

        public void searchSong Object songTitlekeyword;
        (songTitlekeyword) throws InterruptedException {
            WebElement searchField = driver.findElement(By.cssSelector("div#searchform input[type=search]"));
            searchField.sendkeys(songTitleKeyword("Pluto"));
            Thread.sleep(2000);
        }
        public void clickViewAllBtn () throws InterruptedException {
            WebElement veiwAllsearchResults = driver.findElement(By.cssSelector("div.results section.songs h1 button"));
            clickViewAllBtn.click();
            Thread.sleep(2000);
        }
        public void selectFirstSongResult () throws InterruptedException {
            WebElement firstSongResult = driver.findElement(By.cssSelector("section#songResultWrapper tr.song-item td.title"));
            firstSongResult.click();
            Thread.sleep(2000);
        }
        public void clickAddToBtn () throws InterruptedException {
            WebElement addToBtn = driver.findElement(By.cssSelector("button.btn-add-to"));
            addToBtn.click();
            Thread.sleep(2000);
        }
        public void choosingPlaylist () throws InterruptedException {
            WebElement choosePlaylist = driver.findElement(By.xpath("//*[@id=playlists]/ul/li[7]/a"));
            choosePlaylist.click();
            Thread.sleep(2000);
        }
        public String getNotificationText () {
            WebElement notificationElement = driver.findElement(By.cssSelector("div.success.show"));
            return notificationElement.getText();
        }

    }
}
