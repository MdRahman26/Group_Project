package com.watchoutfitters.test;

import com.watchoutfitters.pages.SignUpPage;
import driverconnectivity.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpPageTest extends CommonAPI {

    SignUpPage objOfSignUpPage=null;

    @BeforeMethod
    public void initializationOfElements(){
        objOfSignUpPage= PageFactory.initElements(driver,SignUpPage.class);
        System.out.println("sueccesfully created Account");
    }

    @Test
    public void SignUpTest() throws InterruptedException {
        objOfSignUpPage.signUpPage();
    }
}


