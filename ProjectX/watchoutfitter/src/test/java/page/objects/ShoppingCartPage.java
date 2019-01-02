package page.objects;

import application.page.base.ApplicationPageBase;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCartPage extends CommonAPI {


 @FindBy(className = "icon-cart cart-button")
 private WebElement shoppingCartIcon;

 @FindBy(xpath = "//*[@id=\"shopify-section-1482528454151\"]/div/div/div/div[2]/div[1]/a/div[1]/img[1]")
 private WebElement quartaWatch;

 @FindBy(xpath = "//select[@class='single-option-selector']")
 private WebElement colordropDownMenu;

 @FindBy(xpath = "//*[@id=\"shopify-section-product-template\"]/div[2]/div[1]/div/div[2]/div/ol/li[1]/img")
 private WebElement firstWatchImg;

 @FindBy(xpath = "//*[@id=\"shopify-section-product-template\"]/div[2]/div[1]/div/div[2]/div/ol/li[1]/img")
 private WebElement Watch;

 @FindBy(xpath = "//*[@id=\"//*[@id=\"shopify-section-product-template\"]/div[2]/div[1]/div/div[2]/div/ol/li[2]/img")
 private WebElement secondWatchImg;

 @FindBy(xpath = "//*[@id=\"shopify-section-product-template\"]/div[2]/div[1]/div/div[2]/div/ol/li[3]/img")
 private WebElement thirdWatchImg;

 @FindBy(xpath = "//*[@id=\"shopify-section-product-template\"]/div[2]/div[1]/div/div[2]/div/ol/li[4]/img")
 private WebElement fourthWatchImg;

 @FindBy(name = "return_to")
 private WebElement addToCartButton;

 @FindBy(xpath = "//*[@id=\"checkout_shipping_address_first_name\"]")
 private WebElement firstName;

 @FindBy(xpath = "//*[@id=\"checkout_shipping_address_last_name\"]")
 private WebElement lastName;

 @FindBy(xpath = "//*[@id=\"checkout_shipping_address_address1\"]")
 private WebElement address;

 @FindBy(xpath = "//*[@id=\"checkout_shipping_address_address2\"]")
 private WebElement apartment;

 @FindBy(xpath = "//*[@id=\"checkout_shipping_address_city\"]")
 private WebElement city;

 @FindBy(xpath = "//*[@id=\"checkout_shipping_address_zip\"]")
 private WebElement zipCode;

 @FindBy(xpath = "//*[@id=\"checkout_shipping_address_phone\"]")
 private WebElement phoneNo;

 @FindBy(id = "continue_to_shipping_method_button")
 private WebElement continueToShoppingButton;

 @FindBy(className = "step__footer__continue-btn btn ")
 private WebElement continuePaymentButton;

 @FindBy(xpath = "/html/body/div[3]/div/div[1]/div[2]/div[3]/div/form/div[3]/div[1]/button")
 private WebElement completeOrderButton;

 @FindBy(css = "body > div:nth-child(5) > div > div.main > div.main__content > div.step > form > div.step__sections " +
         "> div.section.section--contact-information > div.section__content > div.fieldset")
 private WebElement phoneAndEmailAddressTextBox;

 public void selectingAWatch() {
  ApplicationPageBase.click(quartaWatch,"quartaWatch");
  ApplicationPageBase.isEnableStatus(driver,quartaWatch);
  Select drpDown = new Select(colordropDownMenu);
  drpDown.selectByVisibleText("Gold/Black");
  addToCartButton.submit();
 }

 public void enteringInfoToCheckOut() {
  String winHandleBefore = driver.getWindowHandle();
  for(String winHandle : driver.getWindowHandles()){
   driver.switchTo().window(winHandle);
  }

  phoneAndEmailAddressTextBox.sendKeys("hussain@gmail.com");
   ApplicationPageBase.sendKeys(firstName,"firstName","Ziyad");
   ApplicationPageBase.sendKeys(lastName,"lastName","Hussain");
   ApplicationPageBase.sendKeys(address,"address","123 test street");
   ApplicationPageBase.sendKeys(apartment,"apartment","2f");
   ApplicationPageBase.sendKeys(city,"city","Flushing");
   ApplicationPageBase.sendKeys(zipCode,"zipCode","11233");
   ApplicationPageBase.sendKeys(phoneNo,"phoneNo","1236759898");
   ApplicationPageBase.click(continueToShoppingButton,"continueToShoppingButton");
   ApplicationPageBase.click(continuePaymentButton,"continuePaymentButton");
   ApplicationPageBase.click(completeOrderButton,"completeOrderButton");

  }


 }











