package page.objects;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class HomePage extends CommonAPI {


    @FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/ul/li[2]/a")
    private WebElement brandLink;

    @FindBy(className = "icon-account")
    private WebElement logInIcon;

    @FindBy(className ="arrow")
    private WebElement shopHoverOverMenu;

    @FindBy(xpath = "//*[contains(text(),'Conta')]")
    private WebElement contactUsButton;

    @FindBy(className = "primary_logo")
    private WebElement watchOutfittersLogo;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/ul/span/li[3]/a")
    private WebElement emailIcon;

    @FindBy(id = "search-toggle")
    private WebElement searchIcon;

    @FindBy(className = "icon-cart cart-button")
    private WebElement shoppingCartIcon;

    @FindBy(xpath = "//*[@id=\"shopify-section-1482527966363\"]/section/ul[1]/li[1]/a/img")
    private WebElement homePage;

    @FindBy(xpath = "//*[@id=\"mm-2\"]/ul/li[1]/a")
    private WebElement title;

    @FindBy(xpath = "//*[@id=\"shopify-section-1482527966363\"]/section/ul[1]/li[2]/div/div/div/a")
    private WebElement shopNowActionButton;

    @FindBy(xpath = "//*[@id=\"shopify-section-collection-template\"]/div[2]/h1")
    private WebElement text1;

    @FindBy(xpath = "//*[@id=\"shopify-section-1482527966363\"]/section/ul[2]/li[2]/a/span")
    private WebElement rightIconArrow;

    @FindBy(xpath = "//*[@id=\"shopify-section-1482527966363\"]/section/ul[2]/li[1]/a/span")
    private WebElement leftIconArrow;

    @FindBy(xpath = "//*[@id=\"shopify-section-1482528454151\"]/div/div/div/h2")
    private WebElement featuredWatchesSection;

    @FindBy(className = "shopify-section featured-collection-section")
    private WebElement quartaWatch;

    @FindBy(className = "sub-menu  ")
    private WebElement shopMenu;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/ul/li[1]/div/ul/li[1]/a")
    private WebElement mensWatchesLink;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/ul/li[1]/div/ul/li[2]/a")
    private WebElement womensWatchesLink;

    @FindBy(partialLinkText = "Gift Cards")
    private WebElement giftCardsLink;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/ul/li[1]/div/ul")
    private List<WebElement> dm;

    @FindBy(xpath = "//span[@class='arrow']")
    private WebElement hovover;

    public void clickingBrandLink() {
        brandLink.click();
        Assert.assertEquals(true, brandLink.isEnabled());
        System.out.println("Brand Link Clicked");
    }

    public void clickingContactUsLink(){

        contactUsButton.click();
        Assert.assertEquals(true, contactUsButton.isEnabled());
        System.out.println("Brand Link Clicked");
    }

    public void outfitterAndEmailLinks(){

        watchOutfittersLogo.isDisplayed();
        emailIcon.isDisplayed();
        Assert.assertEquals(true, emailIcon.isDisplayed());
    }

    public void searchLink(){

        searchIcon.click();
        searchIcon.isEnabled();
    }

    public LogInPage getLogInPage() {
        logInIcon.click();
        return new LogInPage();
    }

    public void shoppingCartLink(){

        shoppingCartIcon.click();
        String text = title.getText();
        Assert.assertEquals(text, "CONTINUE SHOPPING");
    }

    public void shopNowLinkAndLeftRightArrows(){

        shopNowActionButton.click();
        String s = text1.getText();
        Assert.assertEquals(s, "BEST SELLERS");
        rightIconArrow.click();
        Assert.assertEquals(true, rightIconArrow.isEnabled());
        leftIconArrow.click();
        Assert.assertEquals(true, leftIconArrow.isEnabled());
        featuredWatchesSection.isDisplayed();
        quartaWatch.click();
        Assert.assertEquals(true, quartaWatch.isEnabled());
        System.out.println("link is clickable");
    }

    public void shopHoverOverMenu() throws InterruptedException {

        Actions actions = new Actions(driver);
        Thread.sleep(4000);
        actions.moveToElement(hovover).build().perform();

        for (int i = 0; i <dm.size() ; i++) {
            String tittles = dm.get(i).getText();
            System.out.println(tittles);
        }
        for (WebElement titles:dm){
            System.out.println(titles.getText());
        }
    }


}
