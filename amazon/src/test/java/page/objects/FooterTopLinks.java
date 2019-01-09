package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FooterTopLinks extends ApplicationPageBase{

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

    @FindBy(partialLinkText = "Start selling")
    private WebElement startSelling;

    @FindBy(id = "home-search")
    private WebElement jobseaerch;


    String nameOfElement;

/*
* footer is same on everyPage so for verification
* i used mostly isdisplayed and isEnabled with assertTrue
* Used  getter methods for the element name
*  >>> Only for MakeMoneyWithUs i used getText() from APB for verification point
*  Getters are all placed at the end
*  */


    public void makeMoneyWithUs(){
        nameOfElement = "Make Money With US";
        beforeClickLog(nameOfElement);
        makeMoneyWithUs.click();
        afterClicking(nameOfElement);
        testPassed(nameOfElement);

    }

    /*
     * below method is for verification of makeMoneyWithUs();
     * calling method from ABP and passing element to get text
     * On Test we can this method for assertion
     * */

    public String verifyMakeMoneyWithUs(){

        String actualText= getText(startSelling,"Selling on Amazon Page is Displayed");// added for log

        return actualText;
    }

    public void amazonPaymentProducts(){
        nameOfElement = "Amazon Payment Product";
        beforeClickLog(nameOfElement);
        amazonPaymentProducts.click();
        afterClicking(nameOfElement);
    }

    //getter for amazon payment product
    public WebElement verifyAmazonpaymentProduct(){
        testPassed("Amazon Payment Product");
        return amazonPaymentProducts;
    }



    public void letUsHelpYou() {
        nameOfElement = "Let Us Help You.";
        beforeClickLog(nameOfElement);
        letUsHelpYou.click();
        afterClicking(nameOfElement);
    }

        /*
        Below Method;
        * Using getter method for varification,
        * In test we call this method with asserTrue using  isDisplayed to verify*/

        public WebElement getLetUsHelpYou(){
            // entering logs for when element is found
            testPassed("Let us help You");
            return letUsHelpYou;
        }


    public void laguageTab() throws InterruptedException {
        nameOfElement = "Language Tab";
        beforeClickLog(nameOfElement);
        laguageTab.click();
        afterClicking(nameOfElement);
        Thread.sleep(2000);
        beforeClickLog("to dismiss Tab");
        languagePopUpDismiss.click();
        afterClicking("");
        testPassed(nameOfElement);
    }


    public void countryTab() throws InterruptedException {
        nameOfElement = "Country Tab";

        beforeClickLog(nameOfElement);
        countryTab.click();
        afterClicking(nameOfElement);
        Assert.assertTrue(countryTab.isDisplayed());
        Thread.sleep(2000);
        Select select = new Select(countryWindowPopUp);
        beforeClickLog("dropdown for Australia");
        select.selectByValue("au");
        driver.findElement(By.xpath("//button[@class='a-button-text']")).click();
        afterClicking("Australia");
        testPassed(nameOfElement);
        }

    public void getToKnowUs(){
        nameOfElement = "Get to Know Us.";
        beforeClickLog(nameOfElement);
        getToKnowUs.click();
        afterClicking(nameOfElement);
        testPassed(nameOfElement);
    }


    //getter for amazon payment product
    public WebElement verifyGetToKnowUs(){
        testPassed("Find Job is displayed");
        return jobseaerch;
    }


}
