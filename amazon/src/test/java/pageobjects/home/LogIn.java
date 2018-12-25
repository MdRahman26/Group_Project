package pageobjects.home;

import driverconnectivity.CommonAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn extends CommonAPI {


    @FindBy(xpath = "//*[@id='nav-link-accountList']/span")
    private WebElement login;

    @FindBy (xpath = "//*[@tabindex='1']")
    WebElement email;

    @FindBy (id="ap_password")
    private WebElement password;

    @FindBy(xpath="//input[@class='a-button-input']")
    private WebElement signInButton;

    @FindBy(className = "a-alert-heading")
    private WebElement siginFailureAlert;

    public void login(){

        String forTest =  login.getText();

        login.click();
        Assert.assertEquals("Hello. Sign in",forTest);

        System.out.println("Test passed");
    }


    public void email(String emailinput) throws InterruptedException {

        login.click();
        email.sendKeys(emailinput);
//        Thread.sleep(2000);

        String adreesConfirm = email.getText();
//        email.clear();
        Assert.assertTrue(email.isDisplayed());

        System.out.println("The desired email passed");

    }

    public void password(String enterpassword){
        login.click();
        password.sendKeys(enterpassword);
        boolean passwordenter = password.isDisplayed();
        Assert.assertTrue(passwordenter);
        System.out.println("Password Enter");


    }

    public void pressSigninButton(){
        login.click();
        Assert.assertTrue(signInButton.isEnabled());
        signInButton.submit();


    }


    public void signInComplete(String emailaddress, String enterpassword) throws InterruptedException {

        login.click();
        email.sendKeys(emailaddress);
        password.sendKeys(enterpassword);
        signInButton.submit();
        Thread.sleep(3000);
        Assert.assertTrue(siginFailureAlert.isDisplayed());

        System.out.println("Sign in Failure Test passed");


    }




}