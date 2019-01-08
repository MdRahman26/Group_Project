package page.objects;

import application.page.base.ApplicationPageBase;
import base.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static application.page.base.ApplicationPageBase.click;
import static application.page.base.ApplicationPageBase.sendKeys;

public class SignUpPage extends ApplicationPageBase {


    @FindBy(className = "icon-account")
    private WebElement myAccountIcon;

    @FindBy(xpath = "//*[@id=\"customer_register_link\"]")
    private WebElement signUpLink;

    @FindBy(name = "customer[first_name]")
    private WebElement fName;

    @FindBy(xpath = "//*[contains(@name,'las')]")
    private WebElement lName;

    @FindBy(name= "customer[email]")
    private WebElement email;

    @FindBy(name = "customer[password]")
    private WebElement pass;

    @FindBy(xpath = "//*[@id=\"create_customer\"]/div[5]/input")
    private WebElement signUpButton;

    public void signUpPage() throws InterruptedException {
        click(myAccountIcon,"myAccountIcon");
        click(signUpLink,"signUpLink");
        sendKeys(fName,"FirstName","john");
        sendKeys(lName,"LastName","carlos");
        sendKeys(email,"Email","carlos@gmail.com");
        sendKeys(pass,"Password","carlos12");
        click(signUpButton,"signUpButton");

    }
}
