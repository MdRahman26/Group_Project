package com.watchoutfitters.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SearchTextPage {

    @FindBy(id = "search-toggle")
    private WebElement searchIcon;

    @FindBy(xpath = "//*[@id=\"search\"]/div/div/form/input[2]")
    private WebElement searchTextBox;

    @FindBy(xpath = "//*[@id=\"search\"]/div/div/form/span")
    private WebElement searchButton;


    public void searchBar() {
        searchIcon.click();
        searchTextBox.sendKeys("watches");
        searchButton.click();
       String actualtext="SEARCH";


    }

}