package page.objects;

import application.page.base.ApplicationPageBase;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FooterMenu extends CommonAPI {
    @FindBy(className = "contact_email")
    private WebElement emailTextBox;

    @FindBy(xpath = "//*[@id=\"contact_form\"]/input[6]")
    private WebElement signUpButton;
    @FindBy(xpath = "//*[@id=\"contact_form\"]/p/em")
    private WebElement thankYouMessage;

    @FindBy(css = "#shopify-section-footer > div.sub-footer > div > div:nth-child(2) > ul > li:nth-child(1) > a")
    private WebElement faqLink;

    @FindBy(xpath = "//*[@id=\"shopify-section-footer\"]/div[1]/div/div[2]/ul/li[2]/a")
    private WebElement giftCardLink;

    @FindBy(xpath = "//*[@id=\"shopify-section-footer\"]/div[1]/div/div[2]/ul/li[3]/a")
    private WebElement searchLink;

    @FindBy(xpath = "//*[@id=\"shopify-section-footer\"]/div[1]/div/div[2]/ul/li[4]/a")
    private WebElement aboutUsLink;

    @FindBy(xpath = "//*[@id=\"shopify-section-footer\"]/div[1]/div/div[2]/ul/li[5]/a")
    private WebElement contactUsLink;

    @FindBy(xpath = "//*[@id=\"shopify-section-footer\"]/div[1]/div/div[2]/ul/li[6]/a")
    private WebElement privacyPolicyLink;

    @FindBy(xpath = "//*[@id=\"shopify-section-footer\"]/div[1]/div/div[2]/ul/li[7]/a")
    private WebElement refundPolicyLink;


    public void newAndUpdatesSection() throws InterruptedException {
        emailTextBox.sendKeys("khan12@gmail.com");
        signUpButton.click();
        Assert.assertEquals(true,signUpButton.isEnabled());

    }

    public void faqLink() {
        ApplicationPageBase.click(faqLink,"helpCenterLink");
    }

    public void giftCardLink() {
       ApplicationPageBase.click(giftCardLink,"giftCardLink");

    }
    public void searchLink() {
        ApplicationPageBase.click(searchLink,"searchLink");

    }
    public void aboutUsLink() {
        ApplicationPageBase.click(aboutUsLink,"aboutUsLink");

    }
    public void contactUsLink() {
        ApplicationPageBase.click(contactUsLink,"contactUsLink");

    }
    public void privacyPolicyLink() {
        ApplicationPageBase.click(privacyPolicyLink,"privacyPolicyLink");

    }
    public void refundPolicyLink(){
        ApplicationPageBase.click(refundPolicyLink,"refundPolicyLink");

    }
}
