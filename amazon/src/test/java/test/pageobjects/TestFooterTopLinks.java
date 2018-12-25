package test.pageobjects;

import driverconnectivity.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.home.FooterTopLinks;

public class TestFooterTopLinks extends CommonAPI {

    FooterTopLinks objectOfFooterTopLinks = null;

    @BeforeMethod
    public void initializationOfOnjects(){
        objectOfFooterTopLinks = PageFactory.initElements(driver,FooterTopLinks.class);
        driver.manage().window().maximize();
    }

    @Test
    public void amazonPaymentProductsTest(){
        objectOfFooterTopLinks.amazonPaymentProducts();
    }



    @Test (priority = 5)
    public void countryTabTest(){
        objectOfFooterTopLinks.countryTab();
    }


    @Test
    public void getToKnowUsTest(){
        objectOfFooterTopLinks.getToKnowUs();
    }


    @Test
    public void letUsHelpYouTest(){
        objectOfFooterTopLinks.letUsHelpYou();
    }

    @Test
    public void makeMoneyWithUsTest(){
        objectOfFooterTopLinks.makeMoneyWithUs();
    }


    @Test
    public void laguageTabTest(){
        objectOfFooterTopLinks.laguageTab();
    }











}

