package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;


public class LogInPage extends ApplicationPageBase {


    @FindBy(className = "icon-account")
    private WebElement logInIcon;

    @FindBy(id = "customer_email")
    private WebElement email;

    @FindBy(id = "customer_password")
    private WebElement password;

    @FindBy(css = "#customer_login > input.btn.action_button")
    private WebElement signInButton;

    @FindBy(css = "#customer_login > div > ul > li")
    private WebElement verfiyInvalidLogin;

    @FindBy(className = "collection_title")
    private WebElement verifyValidLogin;


    public void InvalidLogIn() {
        click(logInIcon, "logInIcon");
        sendKeys(email, "email", "hussain.ziyad@gmail.com");
        sendKeys(password, "password", "khan12");
        click(signInButton, "signInButton");

    }

    public void ValidLogIn() {
        click(logInIcon, "logInIcon");
        sendKeys(email, "email", "hussain.ziyad90@gmail.com");
        sendKeys(password, "password", "Allah1212");
        click(signInButton, "signInButton");
    }


    public LogInPage login(String em, String pass) {
        click(logInIcon, "logInIcon");
        sendKeys(email, "emailBox", em);
        sendKeys(password, "passwordBox", pass);
        click(signInButton, "submitButton");

        return new LogInPage();

    }

    public LogInPage getLogInPage() {

        signInButton.click();
        return new LogInPage();
    }

    public String getErrorMessage() {

        String actualText = getText(verfiyInvalidLogin, "errorMessage");

        return actualText;
    }

    public WebElement getVerifyInvalidLogIn(){
        TestLogger.log("Invalid LogIn");

        return verfiyInvalidLogin;
    }
    public WebElement getVerifyValidLogin(){
        TestLogger.log("Successful Login");

        return verifyValidLogin;
    }



}

