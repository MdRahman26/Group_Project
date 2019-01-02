package page.objects;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
        logInIcon.click();
        email.sendKeys("hussain.ziyad90@gmail.com");
        password.sendKeys("Allah12");
        signInButton.click();
        TestLogger.log("Invalid Credentials");
    }

    public void ValidLogIn() {
        logInIcon.click();
        email.sendKeys("hussain.ziyad90@gmail.com");
        password.sendKeys("Allah1212");
        signInButton.click();
        TestLogger.log("Succesful Log in");
    }

    public String getErrorMessage() {

        String actualText = getText(errorMessage, "errorMessage");

        return actualText;
    }

    public LogInPage login(String em, String pass) {

        sendKeys(email, "emailBox", em);
        sendKeys(password, "passwordBox", pass);
        click(signInButton, "submitButton");


        return new LogInPage();

    }

}

