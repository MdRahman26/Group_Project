package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingCart extends ApplicationPageBase {

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchTextBox;

    @FindBy (how = How.XPATH,xpath= "//input[@value='Go']")
    private WebElement searchIcon;

    @FindBy (partialLinkText = "Computers & Accessories")
    private WebElement verifyComputers;

    @FindBy (className= "a-badge-text")
    private WebElement amazonChoice;

    @FindBy(className = "ac-badge-text-primary")
    private WebElement verifyAmazonChoice;

    @FindBy (id ="add-to-cart-button")
    private WebElement addToCart;

    @FindBy (id="hlb-next-steps")
    private WebElement verifyAddToCart;

    public void productsearch(String productName){

        searchProduct(searchTextBox,productName);
        clickButton(searchIcon,"searchIcon");

    }


    public void clickamazonChoice(){
        testPassed("selectLaptopTest");
        clickButton(amazonChoice,"amazonChoice");
    }

    public String getVerifyComputers(){
        testPassed("searchBox");
        return getText(verifyComputers);
    }


    public String checkAmazonChoice(){
        return getText(verifyAmazonChoice);
    }


    public boolean checkAddToCartButton(){
        testPassed("addToCart");
        return verifyAddToCart.isDisplayed();
    }

    public void clickAddToCart(){
        clickButton(addToCart,"addToCart");
    }

}
