package page.objects;

import application.page.base.ApplicationPageBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class ContactUsPage extends ApplicationPageBase {

    @FindBy(xpath = "//a[contains(@class,'top-link')][contains(text(),'Contact Us')]")
    private WebElement contactUsLink;

    @FindBy(xpath = "//input[@placeholder='Type your name']")
    private WebElement fullname;

    @FindBy(xpath = "//input[@placeholder='Type your email']")
    private WebElement email;

    @FindBy(xpath = "//textarea[@name='field[2]']")
    private WebElement message;

    @FindBy(xpath = "//*[@id=\"_form_1_\"]/div[3]/a")
    private WebElement activeCampaignLink;

    @FindBy(xpath = "//a[@title='Watch Outfitters FAQs']")
    private WebElement helpCenterLink;

    @FindBy(xpath = "//h1[contains(text(),'Help Center')]")
    private WebElement verifyHelpCenterPage;


    @FindBy(id = "_form_1_submit")
    private WebElement submitButton;

    @FindBy(id = "_form_1_submit")
    private WebElement verifysubmitButton;

    public void contactusLink() {
        click(contactUsLink, "contactUsLink");

    }

    public void enteringData() {
        click(contactUsLink, "contactUsLink");
        sendKeys(fullname, "FullName", "Ziyad");
        sendKeys(email, "email", "hussain.ziyad90@gmail.com");
        sendKeys(message, "messageBox", "This is a test case");
        click(submitButton, "submitButton");

    }

    public void helpCenter() {
        click(contactUsLink, "contactUsLink");
        click(helpCenterLink, "helpCenterLink");

    }

    public WebElement getVerifysubmitButton() {
        TestLogger.log("submit button is displayed");
        return verifysubmitButton;

    }

    public WebElement getVerifyHelpCenterPage() {
        TestLogger.log("Help Center Header is displayed");
        return verifyHelpCenterPage;
    }
}