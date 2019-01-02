package page.objects;

import application.page.base.ApplicationPageBase;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

import static application.page.base.ApplicationPageBase.click;
import static application.page.base.ApplicationPageBase.getText;
import static application.page.base.ApplicationPageBase.sendKeys;


public class LogInPage extends CommonAPI {


    @FindBy(className = "icon-account")
    private WebElement logInIcon;

    @FindBy(id = "customer_email")
    private WebElement email;

    @FindBy(id = "customer_password")
    private WebElement password;

    @FindBy(css = "#customer_login > input.btn.action_button")
    private WebElement signInButton;

    @FindBy(css = "#customer_login > div > ul > li")
    private WebElement errorMessage;


    public void InvalidLogIn() {
        ApplicationPageBase.click(logInIcon, "logInIcon");
        ApplicationPageBase.sendKeys(email, "email", "hussain.ziyad@gmail.com");
        sendKeys(password, "password", "khan12");
        click(signInButton, "signInButton");
        String errorText = getText(errorMessage, "errorMessage");
        Assert.assertEquals(errorText, "INVALID LOGIN CREDENTIALS.");

    }

    public void ValidLogIn() {
        click(logInIcon,"logInIcon");
        sendKeys(email,"email","hussain.ziyad90@gmail.com");
        sendKeys(password,"password","Allah1212");
        click(signInButton,"signInButton");
    }


    public LogInPage login(String em, String pass) {
        click(logInIcon,"logInIcon");
        sendKeys(email, "emailBox", em);
        sendKeys(password, "passwordBox", pass);
        click(signInButton, "submitButton");

        return new LogInPage();

    }

    public LogInPage getLogInPage() {

        signInButton.click();
        return new LogInPage();
    }

    public String getErrorMessage(){

        String actualText = getText(errorMessage,"errorMessage");

        return actualText;
    }



}

