package pageobjects.home;

import driverconnectivity.CommonAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterTopLinks extends CommonAPI {

    @FindBy(partialLinkText = "Careers")
    private WebElement getToKnowUs;

    @FindBy(partialLinkText = "Sell on Amazon")
    private WebElement makeMoneyWithUs;

    @FindBy(partialLinkText = "Shop with Points")
    private WebElement amazonPaymentProducts;

    @FindBy(partialLinkText = "Amazon Prime")
    private WebElement letUsHelpYou;

    @FindBy(id= "icp-touch-link-language")
    private WebElement laguageTab;


    @FindBy(id="icp-touch-link-country")
    private WebElement countryTab;


    public void getToKnowUs(){

        getToKnowUs.click();
        Assert.assertTrue(getToKnowUs.isDisplayed());
    }


    public void makeMoneyWithUs(){

        makeMoneyWithUs.click();
        Assert.assertTrue( makeMoneyWithUs.isDisplayed());
        System.out.println("Test: makeMoneyWithUs  passed");
    }

    public void amazonPaymentProducts(){

        amazonPaymentProducts.click();
        Assert.assertTrue(amazonPaymentProducts.isEnabled());
        System.out.println("Test:  amazonPaymentProducts passed");
    }


    public void letUsHelpYou(){

        letUsHelpYou.click();
        Assert.assertTrue(letUsHelpYou.isDisplayed());
        System.out.println("Test:  letUsHelpYou passed");
    }


    public void laguageTab(){

        laguageTab.click();
        Assert.assertTrue(laguageTab.isDisplayed());
        System.out.println("Test:  laguageTab passed");
    }


    public void countryTab(){

        countryTab.click();
        Assert.assertTrue(countryTab.isDisplayed());
        System.out.println("Test:  countryTab passed");
    }













}
