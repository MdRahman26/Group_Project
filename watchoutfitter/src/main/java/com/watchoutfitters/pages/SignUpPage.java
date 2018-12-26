package com.watchoutfitters.pages;

import driverconnectivity.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SignUpPage extends CommonAPI {


    @FindBy(className = "icon-account")
    private WebElement myAccountIcon;

    @FindBy(xpath = "//*[@id=\"customer_register_link\"]")
    private WebElement signUpLink;

    @FindBy(name = "customer[first_name]")
    private WebElement fName;

    @FindBy(xpath = "//*[contains(@name,'las')]")
    private WebElement lName;

    @FindBy(name= "customer[email]")
    private WebElement email;

    @FindBy(name = "customer[password]")
    private WebElement pass;

    @FindBy(xpath = "//*[@id=\"create_customer\"]/div[5]/input")
    private WebElement signUpButton;

    public void signUpPage() throws InterruptedException {
        myAccountIcon.click();
        signUpLink.click();
        fName.sendKeys("hamad");
        lName.sendKeys("hussain");
        email.sendKeys("hamad@yahoo.com");
        pass.sendKeys("khan12");
        signUpButton.click();
        Thread.sleep(2000);
        Assert.assertTrue(true,"//*[@id=\"shopify-section-1482527966363\"]/section/ul[1]/li[1]/a/img");
        System.out.println("User will land on HomePage");


    }
}
