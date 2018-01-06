package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjectModel.SearchClass;

public class TestSearch extends CommonAPI{

    @Test
    public void tesingSearh() throws InterruptedException{
        SearchClass srch = PageFactory.initElements(driver, SearchClass.class);
        srch.searching();
    }
}
