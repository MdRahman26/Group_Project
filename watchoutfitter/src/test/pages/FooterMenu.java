package com.watchoutfitters.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FooterMenu {
    @FindBy(className = "contact_email")
    private WebElement emailTextBox;

    @FindBy(xpath = "//*[@id=\"contact_form\"]/input[6]")
    private WebElement signUpButton;
    @FindBy(xpath = "//*[@id=\"contact_form\"]/p/em")
    private WebElement thankYouMessage;

    @FindBy(css = "#shopify-section-footer > div.sub-footer > div > div:nth-child(2) > ul > li:nth-child(1) > a")
    private WebElement faqLink;

    @FindBy(xpath = "//*[@id=\"shopify-section-footer\"]/div[1]/div/div[2]/ul/li[2]/a")
    private WebElement giftCardLink;

    @FindBy(xpath = "//*[@id=\"shopify-section-footer\"]/div[1]/div/div[2]/ul/li[3]/a")
    private WebElement searchLink;

    @FindBy(xpath = "//*[@id=\"shopify-section-footer\"]/div[1]/div/div[2]/ul/li[4]/a")
    private WebElement aboutUsLink;

    @FindBy(xpath = "//*[@id=\"shopify-section-footer\"]/div[1]/div/div[2]/ul/li[5]/a")
    private WebElement contactUsLink;

    @FindBy(xpath = "//*[@id=\"shopify-section-footer\"]/div[1]/div/div[2]/ul/li[6]/a")
    private WebElement privacyPolicyLink;

    @FindBy(xpath = "//*[@id=\"shopify-section-footer\"]/div[1]/div/div[2]/ul/li[7]/a")
    private WebElement refundPolicyLink;


    public void newAndUpdatesSection() throws InterruptedException {
        emailTextBox.sendKeys("khan12@gmail.com");
        signUpButton.click();
        String text=thankYouMessage.getText();
        Assert.assertEquals(text,"THANK YOU FOR JOINING OUR MAILING LIST!");

    }

    public void footerMenuLinks(){
        faqLink.click();
        Assert.assertEquals(true,faqLink.isEnabled());
        giftCardLink.click();
        Assert.assertEquals(true,giftCardLink.isEnabled());
        searchLink.click();
        Assert.assertEquals(true,searchLink.isEnabled());
        aboutUsLink.click();
        Assert.assertEquals(true,aboutUsLink.isEnabled());
        contactUsLink.click();
        Assert.assertEquals(true,contactUsLink.isEnabled());
        privacyPolicyLink.click();
        Assert.assertEquals(true,privacyPolicyLink.isEnabled());
        refundPolicyLink.click();
        Assert.assertEquals(true,refundPolicyLink.isEnabled());
    }
}
