package com.watchoutfitters.test;

import com.watchoutfitters.pages.ContactUsPage;
import com.watchoutfitters.pages.FooterMenu;
import driverconnectivity.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
    public void footerMenuLinksTest(){
        objOfFooterMenu.footerMenuLinks();


    }

}