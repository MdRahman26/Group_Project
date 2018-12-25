package pageobjects.home;

import driverconnectivity.CommonAPI;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;
import java.util.Iterator;
import java.util.List;

public class SearchBox extends CommonAPI {


    @FindBy(how = How.ID,id = "searchDropdownBox")
    private WebElement seachBoxDropDown;
    @FindBy (xpath = "//*[@value='search-alias=amazonfresh']")
    private WebElement confirmSearchBoxdrop;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchTextBox;

    @FindBy (how = How.XPATH,xpath= "//input[@value='Go']")
        private WebElement searchIcon;


    public void dropdownselection(){
        seachBoxDropDown.click();
        Assert.assertTrue(confirmSearchBoxdrop.isDisplayed());
        System.out.println("SearchBox Just clicked");
    }

    public void listSearchBox() {

        Select select = new Select(seachBoxDropDown);

        select.selectByVisibleText("Amazon Devices");
//        Assert.assertTrue(seachBoxDropDown.isDisplayed());
        System.out.println("Drop Down Test passed");

    }

    public void searchTextBox(String enterSearchWord){
        searchTextBox.sendKeys(enterSearchWord);
        searchTextBox.sendKeys(Keys.ENTER);

    }

    public void searchIcon() throws InterruptedException {
        searchTextBox("Something");
        Thread.sleep(2000);

        Actions mouse = new Actions(driver);
        mouse.moveToElement(searchIcon).build().perform();
        searchIcon.click();

        System.out.println("SearchIcon clicked");
    }

}
