package test.pageobjects;

import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.LogInManual;
import page.objects.NavigationBarLink;

public class NavigationBarLinkTest extends BrowserDriver {

    NavigationBarLink objectOfNavBar = null;
    LogInManual objOfManualLogin = null;
    @BeforeMethod
    public void initilization(){
        objectOfNavBar = PageFactory.initElements(driver, NavigationBarLink.class);
        objOfManualLogin = PageFactory.initElements(driver,LogInManual.class);
    }

    @Test
    public void yourAmazonTest(){
        objectOfNavBar.yourAmazon();
/*

        initialize the objectofLoginManualPage for assertion because already there is a method
        which is verfying the login page that's why i am using here
*/

        Assert.assertTrue(objOfManualLogin.verifyLogin());
    }

    @Test
    public void todayDealTest(){

        objectOfNavBar.todayDeal();

        Assert.assertTrue(objectOfNavBar.getVerifyTodayDeals().isDisplayed());

    }


        @Test
        public void giftcards(){

            objectOfNavBar.giftcards();

            Assert.assertTrue(objectOfNavBar.getVerifyGiftCard().isDisplayed());
        }



        @Test
        public void wholeFoodsTest(){
            objectOfNavBar.wholeFoods();
            Assert.assertTrue(objectOfNavBar.getWholeFoods().isDisplayed());
        }

        @Test
        public void registryTest(){
            objectOfNavBar.registry();
            Assert.assertTrue(objectOfNavBar.getRegistry().isEnabled());
        }

        @Test
        public void sellTest(){

            objectOfNavBar.sell();
            // using assert equals
            Assert.assertEquals(objectOfNavBar.verifySell(),"Start selling");

        }

        @Test
        public void helpTest(){
            objectOfNavBar.help();
            Assert.assertTrue(objectOfNavBar.getVerifyHelp().isEnabled());
        }


}
