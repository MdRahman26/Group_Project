package com.watchoutfitters.test;

import com.watchoutfitters.pages.ContactUsPage;
import driverconnectivity.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactsUsTest extends CommonAPI {

    ContactUsPage objOfContactUsPage=null;
    @BeforeMethod
    public void initializationOfElements(){
        objOfContactUsPage= PageFactory.initElements(driver,ContactUsPage.class);
    }

    @Test
    public void ContactUsTest() {
        objOfContactUsPage.ContactusPage();
    }

}
