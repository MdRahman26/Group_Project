package test.page.objects;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.SearchTextPage;

public class SearchTest  extends CommonAPI {


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


