package test.page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;


public class HomePageTest extends ApplicationPageBase {

    HomePage objOfHomePage = null;

    @BeforeMethod
    public void initializationOfElements() {
        objOfHomePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void brandLinkTest() {
        objOfHomePage.clickingBrandLink();
        Assert.assertTrue(objOfHomePage.getVerifyBrandLink().isDisplayed());
    }

    @Test
    public void contactUsLinkTest() {
        objOfHomePage.clickingContactUsLink();
        Assert.assertTrue(objOfHomePage.getVerifyContactUsLink().isDisplayed());

    }

    @Test
    public void emailLinkTest() {
        objOfHomePage.emailIconLink();
        Assert.assertTrue(objOfHomePage.getEmailIcon().isEnabled());

    }

    @Test
    public void loginIconTest() {
        objOfHomePage.logInIcon();
        Assert.assertTrue(objOfHomePage.getVerifyLogInIconPage().isDisplayed());
    }

    @Test
    public void searchLinkTest() {
        objOfHomePage.searchLink();
    }

    @Test
    public void shoppingCartLinkTest() {
        objOfHomePage.shoppingCartLink();

    }

    @Test
    public void shopHoverOverMenuTest() throws InterruptedException {
        objOfHomePage.shopHoverOverMenu();
    }


}
