package test.page.objects;


import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.FooterMenu;

public class FooterMenuTest extends CommonAPI {

    FooterMenu objOfFooterMenu = null;

    @BeforeMethod
    public void initializationOfElements() {
        objOfFooterMenu = PageFactory.initElements(driver, FooterMenu.class);
    }
    @Test
    public void newsAndUpdatesTest() throws InterruptedException {
        objOfFooterMenu.newAndUpdatesSection();
    }
    @Test
    public void faqLinkTest(){
        objOfFooterMenu.faqLink();
    }
    @Test
    public void giftCardLinkTest(){
        objOfFooterMenu.giftCardLink();
    }
    @Test
    public void searchLinkTest(){
        objOfFooterMenu.searchLink();
    }
    @Test
    public void aboutUsLinkTest(){
        objOfFooterMenu.aboutUsLink();
    }
    @Test
    public void contactUsLinkTest(){
        objOfFooterMenu.contactUsLink();
    }
    @Test
    public void privacyPolicyLinkTest(){
        objOfFooterMenu.privacyPolicyLink();
    }
    @Test
    public void refundPolicyLinkTest(){
        objOfFooterMenu.privacyPolicyLink();
    }

}