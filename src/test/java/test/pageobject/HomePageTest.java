package test.pageobject;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePageObjects;

public class HomePageTest extends CommonAPI {

    HomePageObjects objectOfHomePage = null;

    @BeforeMethod
    public void initializationOfElement(){

        objectOfHomePage = PageFactory.initElements(driver,HomePageObjects.class);
    }

    @Test
    public void newsButtonTest(){
        objectOfHomePage.clickNewsButton();
    }

    @Test
    public void sportButtonTest(){
        objectOfHomePage.clickSportButton();

    }
    @Test
    public void weatherButtonTest(){
        objectOfHomePage.clickWeatherButton();
    }
    @Test
    public void shopButtonTest() {
        objectOfHomePage.clickShopButton();
    }
    @Test
    public void reelButtonTest() {
        objectOfHomePage.clickReelButton();
    }


    }
