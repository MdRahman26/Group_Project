package pageobjects.home;

import driverconnectivity.CommonAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Wait;

public class NavigationBarLink1 extends CommonAPI {

    // used different locator to find elements
    // realtive xpath used
    @FindBy(xpath = "//*[@id='nav-your-amazon']")
    private WebElement yourAmazon;

    @FindBy(xpath = "//a[@tabindex='48']")
    private WebElement yearEndDeals;
    //used how with FindBy, we can use both ways

    @FindBy(how = How.PARTIAL_LINK_TEXT,partialLinkText = "Gift Cards")
    private WebElement giftCards;

    @FindBy(xpath = "//*[@tabindex='50']")
    private WebElement wholeFoods;

    //using css selector
    @FindBy(how= How.CSS,css = "a.nav-a:nth-child(6)")
    private WebElement registry;

    //using text() in xpath : difference in contains() and text() is of , and =
    @FindBy(how= How.ID,xpath = "//*[text()='Sell']")
    private WebElement sell;

    @FindBy(linkText = "Help")
    private WebElement help;


    @FindBy (xpath = "//a[@tabindex = '66']")
    private WebElement yearEndconfirmation;
    Wait wait = null;

    @FindBy (xpath = "//*[@alt='Register with Amazon']")
    WebElement confirmationForRegistry;


    public void yourAmazon(){

        Assert.assertTrue(yourAmazon.isEnabled());
        System.out.println("your Amazon link is working");
        yourAmazon.click();
        System.out.println("Checked with clicked");

    }

    public void yearEndDeals(){

        yearEndDeals.click();


        Assert.assertEquals(true,yearEndconfirmation.isEnabled());

        System.out.println("Confirmed Year Link work on title bar home Page");

    }

    public void giftcards(){
        String testOfGiftCard = giftCards.getText();
        giftCards.click();

        Assert.assertEquals("Gift Cards",testOfGiftCard);
        System.out.println("Result passed we expected: "+testOfGiftCard);

    }


    public void wholeFoods(){

        wholeFoods.click();

        Assert.assertTrue(yourAmazon.isDisplayed());
        System.out.println("Test whole food linked passed");

    }

    public void registry(){
        registry.click();

        Assert.assertTrue(confirmationForRegistry.isDisplayed());
        System.out.println("Registry Link is Working");
    }


    public void sell(){
        sell.click();
        Assert.assertTrue(sell.isEnabled());
        System.out.println("Sell Link is good");
    }

    public void help(){
        help.click();
        System.out.println("Help is Passed");

    }





}
