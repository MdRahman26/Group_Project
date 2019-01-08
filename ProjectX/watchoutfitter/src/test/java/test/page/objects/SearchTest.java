package test.page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.SearchTextPage;

public class SearchTest  extends ApplicationPageBase {


    SearchTextPage objOfSearchPage=null;

    @BeforeMethod
    public void initializationOfElements() {
        objOfSearchPage = PageFactory.initElements(driver, SearchTextPage.class);
    }

    @Test
    public void searchBarTest(){
        objOfSearchPage.searchBar();
        Assert.assertTrue(objOfSearchPage.getVerifySearchPage().isDisplayed());



        }

    }


