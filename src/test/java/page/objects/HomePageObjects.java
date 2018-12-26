package page.objects;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePageObjects extends CommonAPI {

    @FindBy(how = How.PARTIAL_LINK_TEXT,partialLinkText = "News")
    WebElement newsButton;

    @FindBy(how = How.PARTIAL_LINK_TEXT,partialLinkText = "Sport")
    public WebElement buttonSport;

    @FindBy(how = How.PARTIAL_LINK_TEXT,partialLinkText = "Weather")
    public WebElement buttonWeather;

    @FindBy(how = How.PARTIAL_LINK_TEXT,partialLinkText = "Shop")
    private WebElement buttonShop;

    @FindBy(how = How.PARTIAL_LINK_TEXT,partialLinkText = "Reel")
    private WebElement buttonReel;

    public HomePageObjects() {
    }

    public void clickNewsButton(){

        newsButton.click();
        Assert.assertEquals(true, newsButton.isEnabled());
        System.out.println("News Button just click");


    }


    public void clickSportButton(){

        buttonSport.click();
        Assert.assertEquals(true, buttonSport.isEnabled());
        System.out.println("Sports Button just click");

    }


    public void clickWeatherButton(){

        buttonWeather.click();

    }
    public void clickReelButton(){

        buttonReel.click();
        Assert.assertEquals(true, buttonReel.isEnabled());
        System.out.println("Reel Button just click");
    }

    public void clickShopButton(){

        buttonShop.click();
        Assert.assertEquals(true, buttonShop.isEnabled());
        System.out.println("Reel Button just click");
    }













}
