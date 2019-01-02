package test.page.objects;

import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.SearchTextPage;

public class SearchTest  extends BrowserDriver {


    SearchTextPage objOfSearchPage=null;

    @BeforeMethod
    public void initializationOfElements() {
        objOfSearchPage = PageFactory.initElements(driver, SearchTextPage.class);
    }

    @Test
    public void searchBarTest(){
        objOfSearchPage.searchBar();


        }

    }


