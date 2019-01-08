package page.objects;

import application.page.base.ApplicationPageBase;
import base.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

import static application.page.base.ApplicationPageBase.click;
import static application.page.base.ApplicationPageBase.isEnableStatus;
import static application.page.base.ApplicationPageBase.sendKeys;


public class SearchTextPage extends ApplicationPageBase{

    @FindBy(id = "search-toggle")
    private WebElement searchIcon;

    @FindBy(xpath = "//input[contains(@placeholder,'Search Watch Outfitters...')]")
    private WebElement searchTextBox;

    @FindBy(xpath = "//span[contains(@class,'icon-search search-submit')]")
    private WebElement searchButton;

    @FindBy(xpath = "//a[contains(text(),'Next »')]")
    private WebElement nextButton;

    @FindBy(className = "collection_title ")
    private WebElement verifySearchPage;


    public void searchBar() {
        click(searchIcon, "searchIcon");
        isEnableStatus(driver, searchIcon);
        sendKeys(searchTextBox, "searchTextBox", "watches");
        click(searchButton, "searchButton");
        click(nextButton,"nextButton");
    }
    public WebElement getVerifySearchPage(){
        TestLogger.log("37 Search results displayed");

        return verifySearchPage;







    }

}