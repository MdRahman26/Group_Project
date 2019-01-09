package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class LogInManual extends ApplicationPageBase{

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

    String nameOfElemenet = null;


    public void login(){
         nameOfElemenet = "Log In";
        beforeClickLog(nameOfElemenet);
        login.click();
        afterClicking(nameOfElemenet);
    }


    public void email(String emailinput)  {
        nameOfElemenet = "Email";
        beforeClickLog(nameOfElemenet);
        login.click();
        afterClicking(nameOfElemenet);
        email.sendKeys(emailinput);

    }

    public void password(String enterpassword){
       nameOfElemenet = "Password";
        beforeClickLog(nameOfElemenet);
        login.click();
        afterClicking(nameOfElemenet);
        password.sendKeys(enterpassword);
    }

    public void pressSigninButton(){
        nameOfElemenet = "Sign In Button";
        beforeClickLog(nameOfElemenet);
        login.click();
        afterClicking(nameOfElemenet);
        signInButton.submit();
    }


    public void signInComplete(String emailaddress, String enterpassword) {

        //beforeClickLog(nameOfElemenet);
        login.click();
        //afterClicking(nameOfElemenet);
        email.sendKeys(emailaddress);
        password.sendKeys(enterpassword);
        signInButton.submit();
    }


    //verification for login
    public boolean verifyLogin(){
        testPassed(" ");
        return email.isDisplayed();

    }

    public boolean signInFailure(){
        testPassed("Sign In Failure Test Passed");
        return siginFailureAlert.isDisplayed();
    }

}
