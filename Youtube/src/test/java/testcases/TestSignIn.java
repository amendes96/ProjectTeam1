package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjectModel.ValidSignIn;

public class TestSignIn extends CommonAPI {

    @Test
    public void login() throws InterruptedException {
        ValidSignIn sn = PageFactory.initElements(driver, ValidSignIn.class);
        sn.login();
    }

}
