package test.page.objects;
import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.ContactUsPage;

public class ContactsUsTest  extends BrowserDriver {

    ContactUsPage objOfContactUsPage=null;
    @BeforeMethod
    public void initializationOfElements(){
        objOfContactUsPage= PageFactory.initElements(driver,ContactUsPage.class);
    }

    @Test
    public void contactUsLinkTest() {
        objOfContactUsPage.ContactusLink();
    }
    @Test
    public void enteringDataTest(){
        objOfContactUsPage.enteringData();
    }
    @Test
    public void helpCenterLinkTest(){
        objOfContactUsPage.helpCenter();
    }
}
