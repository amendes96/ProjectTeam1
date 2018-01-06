package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjectModel.InvalidEmail;

public class TestInvalidEmail extends CommonAPI {

    @Test
    public void invalidLogin() throws InterruptedException {
        InvalidEmail invEmail = PageFactory.initElements(driver, InvalidEmail.class);
        invEmail.invalidlogin();
    }
}
