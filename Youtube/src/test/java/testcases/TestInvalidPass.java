package testcases;

import base.CommonAPI;
import com.gargoylesoftware.htmlunit.Page;
import org.omg.CORBA.DynAnyPackage.Invalid;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjectModel.InvalidPassword;

public class TestInvalidPass extends CommonAPI{

    @Test
    public void InvalisPassw() throws InterruptedException {
        InvalidPassword invpass = PageFactory.initElements(driver, InvalidPassword.class);
        invpass.invalidpass();
    }
}
