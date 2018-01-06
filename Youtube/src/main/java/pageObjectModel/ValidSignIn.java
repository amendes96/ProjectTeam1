package pageObjectModel;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.security.Key;

public class ValidSignIn {

    @FindBy(id = "text")
    WebElement signIn;

    @FindBy(id = "identifierId")
    WebElement email;

    @FindBy(xpath = ".//*[@id='identifierNext']/content/span")
    WebElement nextButton;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(id = "passwordNext")
    WebElement passnextButtom;


    public void login() throws InterruptedException {
        signIn.click();
        email.sendKeys("ytest1278");
        nextButton.click();
        password.sendKeys("youtubeTestRunner");
        Thread.sleep(2000);
        passnextButtom.click();
        //System.out.println(driver.getPageSource());
    }
}

//http://www.tubereplay.com/replay.php?tqr=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3D-puiI2d_yL4&Submit=Replay
