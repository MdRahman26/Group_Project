package page.objects;

import application.page.base.ApplicationPageBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.util.List;


public class HomePage extends ApplicationPageBase {


    @FindBy(xpath = "//a[contains(@class,'top-link')][contains(text(),'Brand')]")
    private WebElement brandLink;

    @FindBy(className = "collection_title")
    private WebElement verifyBrandLink;

    @FindBy(className = "icon-account")
    private WebElement logInIcon;

    @FindBy(className = "collection_title")
    private WebElement verifyLogInIconPage;

    @FindBy(xpath = "//span[@class='arrow']")
    private WebElement shopHoverOverMenu;

    @FindBy(xpath = "//a[contains(@class,'top-link')][contains(text(),'Contact Us')]")
    private WebElement contactUsButton;

    @FindBy(className = "collection_title")
    private WebElement verifyContactUsLink;

    @FindBy(xpath = "//span[@class='js-social-icons']//li[@class='email']")
    private WebElement emailIcon;

    @FindBy(xpath = "//a[@id='search-toggle']")
    private WebElement searchIcon;

    @FindBy(xpath = "//a[@class='icon-cart cart-button']//span[contains(text(),'Cart')]")
    private WebElement shoppingCartIcon;

    @FindBy(xpath = "//a[@class='mm-subclose continue']")
    private WebElement verifyShoppingCartLink;

    @FindBy(xpath = "//a[contains(text(),'Shop now')]")
    private WebElement shopNowActionButton;

    @FindBy(xpath = "//h1[contains(text(),'Best sellers')]")
    private WebElement verifyShopNowButton;

    @FindBy(xpath = "//span[contains(text(),'Quarta')]")
    private WebElement quartaWatch;

    @FindBy(xpath = "//div[contains(@class,'twelve columns nav mobile_hidden')]//li[1]//li[1]")
    private WebElement shopMenu;

    @FindBy(partialLinkText = "Gift Cards")
    private WebElement giftCardsLink;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/ul/li[1]")
    private List <WebElement> dm;

    @FindBy(xpath = "//span[@class='arrow']")
    private WebElement hovover;

    public void clickingBrandLink() {
        click(brandLink, "brandLink");

    }

    public void clickingContactUsLink() {

        click(contactUsButton, "contactUsButton");

    }

    public void emailIconLink() {
        click(emailIcon, "emailIcon");


    }

    public void searchLink() {

        click(searchIcon, "searchIcon");

    }

    public void logInIcon() {
        click(logInIcon, "logInIcon");


    }

    public void shoppingCartLink() {

        click(shoppingCartIcon, "shoppingCartIcon");

    }

    public void shopHoverOverMenu() throws InterruptedException {
        Actions actions = new Actions(driver);
        Thread.sleep(4000);
        actions.moveToElement(hovover).build().perform();

        for (int i = 0; i < dm.size(); i++) {
            String tittles = dm.get(i).getText();
            System.out.println(tittles);
        }
        for (WebElement titles : dm) {
            System.out.println(titles.getText());
        }
    }


    public WebElement getVerifyBrandLink() {
        TestLogger.log("About us page displayed ");

        return verifyBrandLink;
    }

    public WebElement getVerifyContactUsLink() {
        TestLogger.log("Submit button is displayed");

        return verifyContactUsLink;
    }

    public WebElement getVerifyLogInIconPage() {
        TestLogger.log("Customer logIn page is displayed");

        return verifyLogInIconPage;
    }

    public WebElement getEmailIcon() {
        TestLogger.log("email icon is enabled");

        return emailIcon;
    }

    public WebElement getVerifyShopNowButton() {
        TestLogger.log("watch tool and accessories page displayed");

        return verifyShopNowButton;
    }

}
