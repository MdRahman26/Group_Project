package pageobjects.home;

import driverconnectivity.CommonAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

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

    @FindBy (id = "icp-btn-close-announce")
    private WebElement languagePopUpDismiss;

    @FindBy(id = "icp-selected-country")
    private WebElement countryWindowPopUp;


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


    public void laguageTab() throws InterruptedException {


        laguageTab.click();
        Thread.sleep(2000);
        languagePopUpDismiss.click();
        Assert.assertTrue(laguageTab.isDisplayed());
        System.out.println("Test:  laguageTab passed");
    }


    public void countryTab() throws InterruptedException {

        countryTab.click();
        Assert.assertTrue(countryTab.isDisplayed());
        Thread.sleep(2000);
        Select select = new Select(countryWindowPopUp);

        select.selectByValue("au");
        driver.findElement(By.xpath("//button[@class='a-button-text']")).click();
        System.out.println("Test:  countryTab passed");
    }













}
