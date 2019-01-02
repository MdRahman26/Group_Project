package page.objects;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SearchTextPage extends CommonAPI {

    @FindBy(id = "search-toggle")
    private WebElement searchIcon;

    @FindBy(xpath = "//*[@id=\"search\"]/div/div/form/input[2]")
    private WebElement searchTextBox;

    @FindBy(xpath = "//*[@id=\"search\"]/div/div/form/span")
    private WebElement searchButton;

    @FindBy(css = "#shopify-section-search-template > div:nth-child(2) " +
            "> div > div:nth-child(1) > a > div.info > span.title")
    private WebElement text;


    public void searchBar() {
        searchIcon.click();
        searchTextBox.sendKeys("watches");
        searchButton.click();
        String actualtext =text.getText();
        Assert.assertEquals(actualtext,"PERFECT SKULL WATCH AND FREE HAND-MADE EMBROIDERY PURSE BUNDLE");
        TestLogger.log("Textmathes for verification");






    }

}