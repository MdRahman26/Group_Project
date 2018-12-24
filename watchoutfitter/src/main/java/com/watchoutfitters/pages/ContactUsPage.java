package com.watchoutfitters.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ContactUsPage {

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/ul/li[3]/a")
    private WebElement contactUsLink;

    @FindBy(name = "fullname")
    private WebElement funame;

    @FindBy(xpath = "//*[@id=\"_form_1_\"]/div[1]/div[2]/div/input")
    private WebElement email;

    @FindBy(xpath = "//*[@id=\"_form_1_\"]/div[1]/div[3]/div/textarea")
    private WebElement message;

    @FindBy(id = "_form_1_submit")
    private WebElement submitButton;

    public void ContactusPage(){
        contactUsLink.click();
        String actualText="IF YOU HAVE A GENERAL ENQUIRY ABOUT OUR WATCHES, DELIVERY OR GUARANTEES THEN YOU MAY FIND YOUR ANSWER ON OUR FAQS PAGE HERE.";
        Assert.assertEquals(actualText,"IF YOU HAVE A GENERAL ENQUIRY ABOUT OUR WATCHES, DELIVERY OR GUARANTEES THEN YOU MAY FIND YOUR ANSWER ON OUR FAQS PAGE HERE.");
        funame.sendKeys("Ziyad","Hussain");
        email.sendKeys("hussain.ziyad90@gmail.com");
        message.sendKeys("Hi this is a test case");
        submitButton.click();
        Assert.assertEquals(false,submitButton.isEnabled());
        System.out.println("Submit button is not clickable");

    }



}


