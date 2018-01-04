package pageObjectModel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn {

    @FindBy(id = "text")
    WebElement signIn;

    @FindBy(id = "identifierId")
    WebElement email;

    @FindBy(xpath = ".//*[@id='identifierNext']/content/span")
    WebElement nextButton;

    @FindBy(name = "password")
    WebElement password;


    public void login(){
        signIn.click();
        email.sendKeys("altonmendes8@gmail.com");
        nextButton.click();
        password.sendKeys("abcd1234");

    }
}
