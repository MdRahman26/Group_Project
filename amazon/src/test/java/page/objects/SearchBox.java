package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import reporting.TestLogger;

public class SearchBox extends ApplicationPageBase {


    @FindBy(how = How.ID,id = "searchDropdownBox")
    private WebElement seachBoxDropDown;

    @FindBy (xpath = "//*[@value='search-alias=amazonfresh']")
    private WebElement confirmSearchBoxdrop;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchTextBox;

    @FindBy (how = How.XPATH,xpath= "//input[@value='Go']")
    private WebElement searchIcon;

    String nameOfElement = null;

    public void dropdownselection(){
        nameOfElement= "Drop Down Selecton";
        beforeClickLog(nameOfElement);
        seachBoxDropDown.click();
        afterClicking(nameOfElement);
        Assert.assertTrue(confirmSearchBoxdrop.isDisplayed());
        testPassed(nameOfElement);
    }

    public void listSearchBox() {
        nameOfElement="Amazon Device";
        Select select = new Select(seachBoxDropDown);
        beforeClickLog(nameOfElement);
        select.selectByVisibleText("Amazon Devices");
//        Assert.assertTrue(seachBoxDropDown.isDisplayed());
        testPassed(nameOfElement);
    }

    public void searchTextBox(String enterSearchWord){
        TestLogger.log("Sending :"+enterSearchWord);

        searchTextBox.clear();
        searchTextBox.sendKeys(enterSearchWord);
        TestLogger.log(enterSearchWord+" :arrived");
        searchTextBox.sendKeys(Keys.ENTER);
        TestLogger.log("Enter Pressed");

    }

    public void searchIcon(String enterSearchWord){
        nameOfElement ="Search Icon";
        searchTextBox(enterSearchWord);

        Actions mouse = new Actions(driver);
        mouse.moveToElement(searchIcon).build().perform();
        testPassed(nameOfElement);
        searchIcon.click();
        afterClicking(nameOfElement);
        testPassed(nameOfElement);

        }

    public WebElement getSearchTextBox(){
        testPassed("");
        return searchTextBox;
    }
    public WebElement getSearchIcon() {
        testPassed("");
        return searchIcon;
    }

    public WebElement getConfirmSearchBoxdrop() {
        testPassed("");
        return confirmSearchBoxdrop;
    }
}
