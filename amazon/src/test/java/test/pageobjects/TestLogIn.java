package test.pageobjects;

import driverconnectivity.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.home.LogIn;

public class TestLogIn extends CommonAPI {

    LogIn objectsOfLogin = null;

    @BeforeMethod
    public void initializationOfObject(){

        objectsOfLogin = PageFactory.initElements(driver,LogIn.class);
        driver.manage().window().maximize();
    }


    @Test
    public void loginTest(){
        objectsOfLogin.login();
    }


    @Test
    public void emailTest(){
        //passing email as a parameter
        try {
            objectsOfLogin.email("afsaegdsae@hotmail.com");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void passwordTest(){
        objectsOfLogin.password("3456789");

    }

    @Test
    public void signInButtonTest(){
        objectsOfLogin.pressSigninButton();
    }


    @Test (groups = "main")

    public void completeLoginTest() throws InterruptedException {
        objectsOfLogin.signInComplete("gafgbgrefw@hotmail.ocm","34567890fghjk");
    }



}
