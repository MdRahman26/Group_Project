package test.page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.ContactUsPage;

public class ContactsUsTest extends ApplicationPageBase {

    ContactUsPage objOfContactUsPage = null;

    @BeforeMethod
    public void initializationOfElements() {
        objOfContactUsPage = PageFactory.initElements(driver, ContactUsPage.class);
    }

    @Test(priority = 1)
    public void contactUsLinkTest() {
        objOfContactUsPage.contactusLink();
        Assert.assertTrue(objOfContactUsPage.getVerifysubmitButton().isDisplayed());

    }


    @Test(priority = 3)

    public void enteringDataTest() {
        objOfContactUsPage.enteringData();
        Assert.assertTrue(objOfContactUsPage.getVerifysubmitButton().isDisplayed());


    }

    @Test(priority = 2)

    public void helpCenterLinkTest() {
        objOfContactUsPage.helpCenter();
        Assert.assertTrue(objOfContactUsPage.getVerifyHelpCenterPage().isDisplayed());
    }

}
