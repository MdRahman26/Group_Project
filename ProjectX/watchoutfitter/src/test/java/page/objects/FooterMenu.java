package page.objects;

import application.page.base.ApplicationPageBase;
import base.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

import static application.page.base.ApplicationPageBase.click;
import static application.page.base.ApplicationPageBase.sendKeys;

public class FooterMenu extends ApplicationPageBase {
    @FindBy(xpath = "//input[@placeholder='Enter your email address...']")
    private WebElement emailTextBox;

    @FindBy(xpath = "//input[@value='Sign Up']")
    private WebElement signUpButton;
    @FindBy(xpath = "//p[@class='message']")
    private WebElement verifyThankYoutText;

    @FindBy(xpath = "//a[@title='FAQs']")
    private WebElement faqLink;

    @FindBy(xpath = "//h1[contains(text(),'Help Center')]")
    private WebElement faqPageVerification;

    @FindBy(xpath = "//a[contains(text(),'Search')]")
    private WebElement searchLink;

    @FindBy(className = "quote")
    private WebElement verifySearchLink;

    @FindBy(xpath = "//a[@title='Gift Cards']")
    private WebElement giftCardLink;

    @FindBy(xpath = "//p[@class='quote']")
    private WebElement verifyGiftCardLink;


    @FindBy(xpath = "//a[@title='About us']")
    private WebElement aboutUsLink;

    @FindBy(className = "collection_title")
    private WebElement verifyAboutUsLink;

    @FindBy(xpath = "//a[@title='Contact us']")
    private WebElement contactUsLink;

    @FindBy(className = "collection_title")
    private WebElement verifyContactUsLink;

    @FindBy(xpath = "//a[@title='Privacy policy']")
    private WebElement privacyPolicyLink;

    @FindBy(className = "collection_title")
    private WebElement verifyPrivacyPolicyLink;

    @FindBy(xpath = "//a[@title='Refund Policy']")
    private WebElement refundPolicyLink;

    @FindBy(className = "collection_title")
    private WebElement verifyRefundPolicyLink;


    public void newAndUpdatesSection() throws InterruptedException {
        sendKeys(emailTextBox, "emailTextBox", "tester@gmail.com");
        click(signUpButton, "signUpButton");

    }

    public void faqLink() {
        click(faqLink, "helpCenterLink");
    }

    public void giftCardLink() {
        click(giftCardLink, "giftCardLink");

    }

    public void searchLink() {
        click(searchLink, "searchLink");

    }

    public void aboutUsLink() {
        click(aboutUsLink, "aboutUsLink");

    }

    public void contactUsLink() {
        click(contactUsLink, "contactUsLink");

    }

    public void privacyPolicyLink() {
        click(privacyPolicyLink, "privacyPolicyLink");

    }

    public void refundPolicyLink() {
        click(refundPolicyLink, "refundPolicyLink");

    }

    public WebElement getSignUpbuttonVerification() {
        TestLogger.log("User succesfully signed up for news and updates");

        return signUpButton;
    }

    public WebElement getFaqPageVerification() {

        return faqPageVerification;
    }

    public WebElement getVerifySearchLink() {
        TestLogger.log("search anything in our shop text displayed ");

        return verifySearchLink;
    }

    public WebElement getAboutUsLink() {
        TestLogger.log("about us page displayed");

        return verifyAboutUsLink;
    }

    public WebElement getContactUsLink() {
        TestLogger.log("contact us page is displayed");

        return verifyContactUsLink;
    }

    public WebElement getPrivacyPolicyLink() {
        TestLogger.log("privacy policy page is displayed");

        return verifyPrivacyPolicyLink;
    }

    public WebElement getRefundPolicyLink() {
        TestLogger.log("Refund policy page is displayed");

        return refundPolicyLink;
    }


}

