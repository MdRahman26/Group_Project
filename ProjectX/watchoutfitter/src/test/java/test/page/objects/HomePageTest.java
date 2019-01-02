package test.page.objects;

import application.page.base.ApplicationPageBase;
import base.CommonAPI;
import junit.framework.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;


public class HomePageTest extends CommonAPI {

    HomePage objOfHomePage = null;

    @BeforeMethod
    public void initializationOfElements() {
        objOfHomePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void contactUsLinkTest() {
        objOfHomePage.clickingContactUsLink();

    }

    @Test
    public void logoAndEmailTest() {
        objOfHomePage.outfitterAndEmailLinks();
    }
    @Test
    public void shopMenuTest(){
        objOfHomePage.shopNowLinkAndLeftRightArrows();
    }
    @Test
    public void logoIconTest(){
        objOfHomePage.logInIon();
    }
     @Test
     public void searchLinkTest(){
        objOfHomePage.searchLink();
     }
     @Test
    public void shoppingCartLinkTest(){
        objOfHomePage.shoppingCartLink();
     }
     @Test
    public void shopHoverOverMenuTest() throws InterruptedException {
        objOfHomePage.shopHoverOverMenu();
     }






}
