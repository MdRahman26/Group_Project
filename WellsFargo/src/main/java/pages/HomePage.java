package pages;
import driverconnectivity.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends CommonAPI {


    @FindBy(how = How.PARTIAL_LINK_TEXT, partialLinkText = "Education")
    private WebElement financialEducation;

    @FindBy(how = How.PARTIAL_LINK_TEXT, partialLinkText = "Customer Service")
    private WebElement customerService;

    @FindBy(how = How.PARTIAL_LINK_TEXT, partialLinkText = "About Wells")
    private WebElement aboutWellsFargo;

    @FindBy(how = How.XPATH, xpath = "//div[@aria-controls=\'checkTodaysRates\']")
    private WebElement todaysRates;

    public void clickOnEducation() {
        financialEducation.click();
    }

    public void clickOnCS() {
        customerService.click();
    }

    public void clickOnAbout() {
        aboutWellsFargo.click();
    }

    public void clickOnRates() {
        todaysRates.click();
    }

}