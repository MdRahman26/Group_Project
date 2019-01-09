package test.pageobjects;

import application.page.base.ApplicationPageBase;
import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.FooterTopLinks;


public class FooterTopLinksTest extends BrowserDriver{

    FooterTopLinks objectOfFooterTopLinks = null;

        @BeforeMethod
        public void initializationOfObjects(){
        objectOfFooterTopLinks = PageFactory.initElements(driver,FooterTopLinks.class);
        driver.manage().window().maximize();
        }

        @Test
        public void amazonPaymentProductsTest(){
            objectOfFooterTopLinks.amazonPaymentProducts();
            //using isEnabled for verification
            Assert.assertTrue(objectOfFooterTopLinks.verifyAmazonpaymentProduct().isEnabled());
        }

        @Test
        public void getToKnowUsTest(){
            objectOfFooterTopLinks.getToKnowUs();
            //used is displayed for verification
            Assert.assertTrue(objectOfFooterTopLinks.verifyGetToKnowUs().isDisplayed());

        }

        @Test
        public void makeMoneyWithUsTest(){
        objectOfFooterTopLinks.makeMoneyWithUs();
        Assert.assertEquals(objectOfFooterTopLinks.verifyMakeMoneyWithUs(),"Start selling");

        }

        @Test
        public void letUsHelpYouTest(){
            objectOfFooterTopLinks.letUsHelpYou();
            // Assert True used cause same element is present on the click page
            Assert.assertTrue(objectOfFooterTopLinks.getLetUsHelpYou().isDisplayed());

        }
        /*
        @Test
        public void laguageTabTest() throws InterruptedException {
            objectOfFooterTopLinks.laguageTab();
            //Assert.assertTrue(laguageTab.isDisplayed());
        }


        @Test (priority = 5)
        public void countryTabTest() throws InterruptedException {
        objectOfFooterTopLinks.countryTab();
        }

*/

}
