package test.page.objects;

import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;


public class HomePageTest extends BrowserDriver {

    HomePage objOfHomePage=null;

    @BeforeMethod
    public void initializationOfElements() {
        objOfHomePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void contactUsLinkTest()
    {
        objOfHomePage.clickingContactUsLink();
    }
    @Test
    public void logoAndEmailTest(){
        objOfHomePage.outfitterAndEmailLinks();
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
