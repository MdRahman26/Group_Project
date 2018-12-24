package com.watchoutfitters.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {


    @FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/ul/li[2]/a")
    private WebElement brandLink;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/ul/li[3]/a")
    private WebElement contactUsButton;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[1]/a/img[2]")
    private WebElement watchOutfittersLogo;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/ul/span/li[3]/a")
    private WebElement emailIcon;

    @FindBy(id = "search-toggle")
    private WebElement searchIcon;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/ul/li[6]/a")
    private WebElement shoppingCartIcon;

    @FindBy(xpath = "//*[@id=\"shopify-section-1482527966363\"]/section/ul[1]/li[2]/div/div/div/a")
    private WebElement shopNowActionButton;

    @FindBy(xpath = "//*[@id=\"shopify-section-1482527966363\"]/section/ul[2]/li[2]/a/span")
    private WebElement rightIconArrow;

    @FindBy(xpath = "//*[@id=\"shopify-section-1482527966363\"]/section/ul[2]/li[1]/a/span")
    private WebElement leftIconArrow;

    @FindBy(xpath = "//*[@id=\"shopify-section-1482527966363\"]/section/ul[1]/li[1]/a/img")
    private WebElement mensWatchesImage;

    @FindBy(xpath = "//*[@id=\"shopify-section-1482528454151\"]/div/div/div/h2")
    private WebElement featuredWatchesSection;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/ul/li[1]/a")
    private WebElement shopHoverMenu;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/ul/li[1]/div/ul/li[1]/a")
    private WebElement mensWatchesLink;

    @FindBy(partialLinkText = "Women's Watches")
    private WebElement womensWatchesLink;

    @FindBy(partialLinkText = "Gift Cards")
    private WebElement giftCardsLink;

    public void homePageElements(){
        brandLink.click();
        Assert.assertEquals(true,brandLink.isEnabled());
        System.out.println("Brand Link Clicked");
        contactUsButton.click();
        Assert.assertEquals(true,contactUsButton.isEnabled());
        System.out.println("Brand Link Clicked");
        watchOutfittersLogo.isDisplayed();
        emailIcon.click();
        Assert.assertEquals(true,emailIcon.isEnabled());
        searchIcon.click();
        Assert.assertEquals(true,searchIcon.isSelected());
        shoppingCartIcon.click();


    }


}
