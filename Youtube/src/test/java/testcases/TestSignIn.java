package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjectModel.SignIn;

public class TestSignIn extends CommonAPI {

    @Test
    public void login(){
        SignIn sn = PageFactory.initElements(driver, SignIn.class);
        sn.login();
    }

}
