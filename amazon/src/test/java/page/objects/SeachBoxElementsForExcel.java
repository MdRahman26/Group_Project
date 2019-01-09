package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeachBoxElementsForExcel extends ApplicationPageBase {

    @FindBy(partialLinkText = "Computers & Accessories")
    private WebElement macBook;

    @FindBy(id = "pdagDesktopSparkleHeadline")
    private WebElement aeronChair;

    @FindBy(partialLinkText = "Breakfast & Cereal Bars")
    private WebElement kashi;

    @FindBy(partialLinkText = "Krishna Rungta")
    private WebElement learnSelenium;

    @FindBy(partialLinkText= "Movies & TV")
    private WebElement godFather;


    public WebElement getAeronChair() {
        return aeronChair;
    }

    public WebElement getMacBook() {
        return macBook;
    }

    public WebElement getGodFather() {
        return godFather;
    }

    public WebElement getKashi() {
        return kashi;
    }

    public WebElement getLearnSelenium() {
        return learnSelenium;
    }


    public WebElement matchElement(String elementToCheck) {
        WebElement nameOfElement = null;

        switch (elementToCheck) {

            case "macbook":
                nameOfElement =getMacBook();
                break;
            case "aeron chair":
                nameOfElement =getAeronChair();
                break;
            case "Kashi Golean":
                nameOfElement =getKashi();
                break;
            case "learn selenium":
                nameOfElement =getLearnSelenium();
                break;
            case "god father":
                nameOfElement =getGodFather();
                break;
        }
        return nameOfElement;
    }
}