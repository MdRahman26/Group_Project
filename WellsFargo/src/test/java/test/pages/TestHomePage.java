package test.pages;


import driverconnectivity.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestHomePage extends CommonAPI {

    HomePage homePage =null;

    @BeforeMethod
    public void initializationOfElements(){
    homePage= PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void navigateToAbout(){
    homePage.clickOnAbout();
    }

    @Test
    public void navigateToCustomerService(){
        homePage.clickOnCS();
    }

    @Test
    public void navigateToEducation(){
        homePage.clickOnEducation();
    }

    @Test
    public void navigateToRates(){
        homePage.clickOnRates();
    }

}
