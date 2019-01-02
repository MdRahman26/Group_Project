package page.objects;

import application.page.base.ApplicationPageBase;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class SignUpPage extends CommonAPI {


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
        ApplicationPageBase.click(myAccountIcon,"myAccountIcon");
        ApplicationPageBase.click(signUpLink,"signUpLink");
        ApplicationPageBase.sendKeys(fName,"FirstName","Ziyad");
        ApplicationPageBase.sendKeys(lName,"LastName","Hussain");
        ApplicationPageBase.sendKeys(email,"Email","hussain.ziyad90@gmail.com");
        ApplicationPageBase.sendKeys(pass,"Password","Allah1212");
        ApplicationPageBase.click(signUpButton,"signUpButton");

    }
}
