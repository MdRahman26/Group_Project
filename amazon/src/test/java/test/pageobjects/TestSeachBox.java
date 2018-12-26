package test.pageobjects;

import driverconnectivity.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.home.LogIn;
import pageobjects.home.SearchBox;


public class TestSeachBox extends CommonAPI {

    SearchBox objectOfSearchBox = null;
    LogIn objectsOfLogin = null;
    @BeforeMethod
    public void initializationOfObjects(){
        objectOfSearchBox = PageFactory.initElements(driver,SearchBox.class);
        objectsOfLogin = PageFactory.initElements(driver,LogIn.class);

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

            objectOfSearchBox.searchIcon();

    }



}
