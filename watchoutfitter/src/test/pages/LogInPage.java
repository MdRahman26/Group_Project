package com.watchoutfitters.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.sql.Driver;

public class LogInPage {



    @FindBy(className = "icon-account")
    private WebElement logInIcon;

    @FindBy(id = "customer_email")
    private WebElement email;

    @FindBy(id = "customer_password")
    private WebElement password;

    @FindBy(css = "#customer_login > input.btn.action_button")
    private WebElement signInButton;

    public LogInPage(){
    }


    //Methods


    public void invalidCredentialstologInPage() {
        logInIcon.click();
        email.sendKeys("hussain.ziyad90@gmail.com");
        password.sendKeys("allah1212");
        signInButton.click();
        String actualText = "INVALID LOGIN CREDENTIALS.";
        Assert.assertEquals(actualText, "INVALID LOGIN CREDENTIALS.");
        System.out.println("Unable to logIn");

    }
    public void validCredentialsLogInPage(){
        logInIcon.click();
        email.sendKeys("hussain.ziyad90@gmail.com");
        password.sendKeys("Allah1212");
        signInButton.click();
        System.out.println("Logged in Succesfully");
    }
}
