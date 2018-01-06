package pageObjectModel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchClass {


    @FindBy(id = "search")
    WebElement searchBar;

    @FindBy(id = "search-icon-legacy")
    WebElement clcksearch;

    public void searching() throws InterruptedException {
        searchBar.sendKeys("Music",Keys.ENTER);
        Thread.sleep(3000);
        searchBar.sendKeys("Movies", Keys.ENTER);
        Thread.sleep(3000);
//        clcksearch.click();
    }
}
