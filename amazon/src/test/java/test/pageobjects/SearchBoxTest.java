package test.pageobjects;

import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.LogInManual;
import page.objects.SearchBox;

public class SearchBoxTest extends BrowserDriver {
    SearchBox objectOfSearchBox = null;
    LogInManual objectsOfLogin = null;
    @BeforeMethod
    public void initializationOfObjects(){
        objectOfSearchBox = PageFactory.initElements(driver,SearchBox.class);
        objectsOfLogin = PageFactory.initElements(driver, LogInManual.class);

    }

    @Test
    public void searchBoxTest(){
        objectOfSearchBox.dropdownselection();

    }

    @Test
    public void dropdownListTest(){
        objectOfSearchBox.listSearchBox();
    }

    @Test
    public void searchBoxTextTest(){
        objectOfSearchBox.searchTextBox("Whatever");
    }

    @Test (groups = "main")
    public void searchIconTest() throws InterruptedException {
        objectOfSearchBox.searchIcon("Something");
    }

}
