package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class NavigationBarLink extends ApplicationPageBase {

    // used different locator to find elements
    // realtive xpath used
    @FindBy(xpath = "//*[@id='nav-your-amazon']")
    private WebElement yourAmazon;

    @FindBy(partialLinkText = "Today's Deals")
    private WebElement todayDeal;
    //used how with FindBy, we can use both ways

    @FindBy(how = How.PARTIAL_LINK_TEXT,partialLinkText = "Gift Cards")
    private WebElement giftCards;

    @FindBy(xpath = "//*[@tabindex='50']")
    private WebElement wholeFoods;

    //using css selector
    @FindBy(how= How.CSS,css = "a.nav-a:nth-child(6)")
    private WebElement registry;

    //using text() in xpath : difference in contains() and text() is of , and =
    @FindBy(how= How.ID,xpath = "//*[text()='Sell']")
    private WebElement sell;

    @FindBy(linkText = "Help")
    private WebElement help;

    @FindBy (xpath = "//a[@tabindex = '66']")
    private WebElement yearEndconfirmation;

    @FindBy (xpath = "//*[@alt='Register with Amazon']")
    private WebElement confirmationForRegistry;

    @FindBy (className = "gbh1-bold")
    private WebElement verifyTodayDeals;

    @FindBy (partialLinkText = "Reload your balance")
    private WebElement verifyGiftCard;

    @FindBy (xpath = "//*[@alt='Explore savings in-store & on Amazon']")
    private WebElement verifyWholeFood;

    @FindBy (partialLinkText = "Start selling")
    private WebElement verifySell;

    @FindBy (partialLinkText = "Your Orders")
    private WebElement verifyHelp;




    String nameOfElement = null;


    public void giftcards(){
        nameOfElement= "Gift Card";
        beforeClickLog(nameOfElement);
        giftCards.click();
        afterClicking(nameOfElement);
    }

    public void wholeFoods(){
        nameOfElement= "Whole Foods";
        beforeClickLog(nameOfElement);
        wholeFoods.click();
        afterClicking(nameOfElement);

    }

    public void yourAmazon(){
        nameOfElement= "Your Amazon";
        beforeClickLog(nameOfElement);
        yourAmazon.click();
        afterClicking(nameOfElement);
    }

    public void registry(){
         nameOfElement= "Registry";
        beforeClickLog(nameOfElement);
        registry.click();
        afterClicking(nameOfElement);
    }


    public void sell(){
        nameOfElement= "Sell";
        beforeClickLog(nameOfElement);
        sell.click();
        afterClicking(nameOfElement);
        }

    public void help(){
        nameOfElement= "Help";
        beforeClickLog(nameOfElement);
        help.click();
        afterClicking(nameOfElement);
    }

    public void todayDeal(){
        nameOfElement= "Today's Deal";
        beforeClickLog(nameOfElement);
        todayDeal.click();
        afterClicking(nameOfElement);
    }

    public WebElement getVerifyTodayDeals(){
        testPassed("Todays Deals");
        return verifyTodayDeals;
    }

    public WebElement getVerifyGiftCard(){

        testPassed("Gift Card");
        return verifyGiftCard;
    }

    public WebElement getWholeFoods(){
        testPassed("Whole Food");
        return verifyWholeFood;
    }

    // here verifying from the registry element itself

    public WebElement getRegistry(){
        testPassed("Registry");
        return registry;
    }

    public String verifySell(){
      String text =   getText(verifySell);
      return text;
    }

    public WebElement getVerifyHelp(){
        testPassed("Help Link");
        return verifyHelp;
    }

}
