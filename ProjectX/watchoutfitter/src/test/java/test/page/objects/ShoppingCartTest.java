package test.page.objects;
import application.page.base.ApplicationPageBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.ShoppingCartPage;

public class ShoppingCartTest extends ApplicationPageBase {

    ShoppingCartPage objOfShoppingCartPage = null;

    @BeforeMethod
    public void initializationOfElements() {
        objOfShoppingCartPage = PageFactory.initElements(driver, ShoppingCartPage.class);
    }

    @Test(priority = 1)
    public void cartIsEmptyTest() throws InterruptedException {
        objOfShoppingCartPage.confirmingCartIsEmpty();
        Assert.assertTrue(objOfShoppingCartPage.getContinueToShopping().isDisplayed());
    }

    @Test(priority = 2)
    public void selectingAProductTest(){
        objOfShoppingCartPage.selectingAProduct();
        Assert.assertTrue(objOfShoppingCartPage.getQuartaWatchVerification().isDisplayed());
    }
    @Test(priority = 3)
    public void checkOutTest(){
        objOfShoppingCartPage.checkOut();
    }


    }

