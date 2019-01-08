package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class ShoppingCartPage extends ApplicationPageBase {


    @FindBy(xpath = "//a[@class='icon-cart cart-button']//span[contains(text(),'Cart')]")
    private WebElement shoppingCartIcon;

    @FindBy(xpath = "//a[@class='mm-subclose continue']")
    private WebElement continueToShopping;

    @FindBy(xpath = "//span[contains(text(),'Quarta')]")
    private WebElement quartaWatch;

    @FindBy(xpath = "//h1[@class='product_name']")
    private WebElement quartaWatchVerification;

    @FindBy(xpath = "//select[@class='single-option-selector']")
    private WebElement colordropDownMenu;

    @FindBy(xpath = "//button[@name='add']")
    private WebElement addToCartButton;


    @FindBy(className = "action_button right")
    private WebElement checkOutButton;

    @FindBy(xpath = "//*[@id=\"checkout\"]")
    private WebElement checkoutButton;

    @FindBy(xpath = "//input[@id='checkout_email_or_phone']")
    private WebElement phoneAndEmailAddressTextBox;

    @FindBy(xpath = "//input[@id='checkout_shipping_address_first_name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='checkout_shipping_address_last_name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='checkout_shipping_address_address1']")
    private WebElement address;

    @FindBy(xpath = "//input[@id='checkout_shipping_address_address2']")
    private WebElement apartment;

    @FindBy(xpath = "//input[@id='checkout_shipping_address_city']")
    private WebElement city;

    @FindBy(css = "#checkout_shipping_address_zip")
    private WebElement zipCode;

    @FindBy(xpath = "//div[@class='field field--required field--third field--show-floating-label']")
    private WebElement country;

    @FindBy(xpath = "//div[@class='field field--required field--show-floating-label field--third']")
    private WebElement state;

    @FindBy(xpath = "//input[@id='checkout_shipping_address_phone']")
    private WebElement phoneNo;

    @FindBy(xpath = "//input[@id='checkout_remember_me']")
    private WebElement rememberMeCheckBox;

    @FindBy(xpath = "//div[@class='step__footer']//button[@name='button']")
    private WebElement continueToShoppingButton;

    @FindBy(xpath = "//div[@class='step__footer']//button[@name='button']")
    private WebElement continuePaymentButton;

    @FindBy(xpath = "//div[@class='shown-if-js']//button[@name='button']")
    private WebElement completeOrderButton;




    @FindBy(xpath = "//*[@id=\"main-header\"]")
    private WebElement verifyCheckoutPage;

    public void confirmingCartIsEmpty() throws InterruptedException {
        click(shoppingCartIcon, "shoppingCartIcon");
        Thread.sleep(3000);
        click(continueToShopping, "continueToShopping");

    }

    public void selectingAProduct() {
        click(quartaWatch, "quartaWatch");
        Select drpDown = new Select(colordropDownMenu);
        drpDown.selectByVisibleText("Gold/Black");
    }

    public void checkOut() {
        click(quartaWatch, "quartaWatch");
        Select drpDown = new Select(colordropDownMenu);
        drpDown.selectByVisibleText("Gold/Black");
        addToCartButton.submit();
        sendKeys(phoneAndEmailAddressTextBox, "phoneAndEmailAddressTextBox", "hussain.ziyad90@gmail.com");
        sendKeys(firstName, "firstName", "Ziyad");
        sendKeys(lastName, "lastName", "Hussain");
        sendKeys(address, "address", "123 test street");
        sendKeys(apartment, "apartment", "2f");
        sendKeys(city, "city", "Flushing");
        sendKeys(zipCode, "zipCode", "11233");
        sendKeys(phoneNo, "phoneNo", "1236759898");
        click(rememberMeCheckBox,"rememberMeCheckBox");
        click(continueToShoppingButton, "continueToShoppingButton");
        click(continuePaymentButton, "continuePaymentButton");
        click(completeOrderButton, "completeOrderButton");

    }

    public WebElement getContinueToShopping() {
        TestLogger.log("cart is empty,continue to shopping text is displayed");

        return continueToShopping;
    }

    public WebElement getQuartaWatchVerification() {
        TestLogger.log("Quarta watch is selected");

        return quartaWatchVerification;
    }


}











