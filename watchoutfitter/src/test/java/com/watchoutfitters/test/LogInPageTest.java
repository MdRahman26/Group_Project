package com.watchoutfitters.test;

import com.watchoutfitters.pages.LogInPage;
import driverconnectivity.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LogInPageTest extends CommonAPI {
    LogInPage objOfLoginPage = null;

    @BeforeMethod
    public void initializationOfElements() {
        objOfLoginPage = PageFactory.initElements(driver, LogInPage.class);
    }
        @Test
    public void logInTest(){
        objOfLoginPage.invalidCredentialstologInPage();

    }
    @Test
    public void successfulLogInTest(){
        objOfLoginPage.validCredentialsLogInPage();

    }

}











