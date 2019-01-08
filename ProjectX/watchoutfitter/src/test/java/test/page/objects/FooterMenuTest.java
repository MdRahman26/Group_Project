package test.page.objects;


import application.page.base.ApplicationPageBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.FooterMenu;

public class FooterMenuTest extends ApplicationPageBase {

    FooterMenu objOfFooterMenu = null;

    @BeforeMethod
    public void initializationOfElements() {
        objOfFooterMenu = PageFactory.initElements(driver, FooterMenu.class);
    }

    @Test
    public void newsAndUpdatesTest() throws InterruptedException {
        objOfFooterMenu.newAndUpdatesSection();
        Assert.assertTrue(objOfFooterMenu.getSignUpbuttonVerification().isEnabled());
    }

    @Test
    public void faqLinkTest() {
        objOfFooterMenu.faqLink();
        Assert.assertTrue(objOfFooterMenu.getFaqPageVerification().isDisplayed());

    }

    @Test
    public void giftCardLinkTest() {
        objOfFooterMenu.giftCardLink();
    }

    @Test
    public void searchLinkTest() {
        objOfFooterMenu.searchLink();
        Assert.assertTrue(objOfFooterMenu.getVerifySearchLink().isDisplayed());
    }

    @Test
    public void aboutUsLinkTest() {
        objOfFooterMenu.aboutUsLink();
        Assert.assertTrue(objOfFooterMenu.getAboutUsLink().isDisplayed());
    }

    @Test
    public void contactUsLinkTest() {
        objOfFooterMenu.contactUsLink();
        Assert.assertTrue(objOfFooterMenu.getContactUsLink().isDisplayed());
    }

    @Test
    public void privacyPolicyLinkTest() {
        objOfFooterMenu.privacyPolicyLink();
        Assert.assertTrue(objOfFooterMenu.getPrivacyPolicyLink().isDisplayed());
    }

    @Test
    public void refundPolicyLinkTest() {
        objOfFooterMenu.refundPolicyLink();
        Assert.assertTrue(objOfFooterMenu.getRefundPolicyLink().isDisplayed());
    }

}