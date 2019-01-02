package page.objects;

import application.page.base.ApplicationPageBase;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ContactUsPage extends CommonAPI {

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/ul/li[3]/a")
    private WebElement contactUsLink;

    @FindBy(xpath = "//h1[@class='collection_title']")
    private WebElement title;

    @FindBy(xpath = "//*[@id=\"_form_1_\"]/div[1]/div[1]/div/input")
    private WebElement funame;

    @FindBy(xpath = "//*[@id=\"_form_1_\"]/div[1]/div[2]/div/input")
    private WebElement email;

    @FindBy(xpath = "//*[@id=\"_form_1_\"]/div[1]/div[3]/div/textarea")
    private WebElement message;

    @FindBy(xpath = "//*[@id=\"_form_1_\"]/div[3]/a")
    private WebElement activeCampaignLink;

    @FindBy(xpath = "//*[contains(text(),'help-c')]")
    private WebElement helpCenterLink;



    @FindBy(id = "_form_1_submit")
    private WebElement submitButton;

    public void ContactusLink() {
        ApplicationPageBase.click(contactUsLink,"contactUsLink");
       String text= ApplicationPageBase.getText(title,"title");
        Assert.assertEquals(text, "CONTACT US");

    }
    public void enteringData() {
        ApplicationPageBase.click(contactUsLink,"contactUsLink");
        ApplicationPageBase.sendKeys(funame,"Firstname","Ziyad");
        ApplicationPageBase.sendKeys(email,"email","hussain.ziyad90@gmail.com");
        ApplicationPageBase.sendKeys(message,"messageBox","This is a test case");
        ApplicationPageBase.click(submitButton,"submitButton");

    }
    public void helpCenter(){
        ApplicationPageBase.click(contactUsLink,"contactUsLink");
        ApplicationPageBase.click(helpCenterLink,"helpCenterLink");
        Assert.assertEquals(true,helpCenterLink.isEnabled());




    }



}


