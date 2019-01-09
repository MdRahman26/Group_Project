package test.pageobjects;

import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.LogInManual;

public class LogInManualTest extends BrowserDriver {
    LogInManual objectsOfLogin = null;

        @BeforeMethod
        public void initializationOfObject(){

        objectsOfLogin = PageFactory.initElements(driver, LogInManual.class);

        }

        @Test
        public void loginTest(){
            objectsOfLogin.login();
            Assert.assertTrue(objectsOfLogin.verifyLogin());
        }

        @Test
        public void emailTest(){
            //passing email as a parameter
            objectsOfLogin.email("afsaegdsae@hotmail.com");
            Assert.assertTrue(objectsOfLogin.verifyLogin());
        }

        @Test
        public void passwordTest(){
            objectsOfLogin.password("NYEEEE");
            Assert.assertTrue(objectsOfLogin.verifyLogin());

        }

        @Test
        public void signInButtonTest(){
            objectsOfLogin.pressSigninButton();
            Assert.assertTrue(objectsOfLogin.verifyLogin());
        }

        @Test (groups = "main")
        public void completeLoginTest() throws InterruptedException {
            objectsOfLogin.signInComplete("gafgbgrefw@hotmail.ocm","34567890fghjk");
            Assert.assertTrue(objectsOfLogin.signInFailure());
        }


}
