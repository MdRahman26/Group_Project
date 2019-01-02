package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import reporting.TestLogger;
import application.pagebase.ApplicationPageBase;


public class HomePage extends ApplicationPageBase {


    @FindBy(how = How.PARTIAL_LINK_TEXT, partialLinkText = "Education")
    private WebElement financialEducation;

    @FindBy(how = How.PARTIAL_LINK_TEXT, partialLinkText = "Customer Service")
    private WebElement customerService;

    @FindBy(how = How.PARTIAL_LINK_TEXT, partialLinkText = "About Wells")
    private WebElement aboutWellsFargo;

    @FindBy(how =How.CSS, css= "#userid" )
    private WebElement userid;

    @FindBy(how =How.ID, id= "password" )
    private WebElement password;

    @FindBy(how = How.ID, id = "btnSignon")
    private WebElement signOnBtn;

   /* @FindBy(how = How.XPATH, xpath = "//div[@id='mainContent']//ul//li[5]//div[1]//div[1]//div[1]")
    WebDriverWait wait = new WebDriverWait(driver, 20);
    private WebElement todaysRates=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='mainContent']//ul//li[5]//div[1]//div[1]//div[1]']")));
*/
/*    public void clickOnHomePage();*/
private WebElement element=null;

    public void clickOnCS() {
        click(customerService, "Customer Service");
    }

    public void clickOnAbout() {
        click(aboutWellsFargo, "About Wells Fargo");
    }

/*  public void clickOnRates() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        todaysRates.click();
    }*/
    public void clickFinancialEducation(){
        click(financialEducation, "Financial Education");
       /* Actions builder = new Actions(driver);
        Action action=builder.click().build();*/

    }

    public void signInIDAndPw(String userId, String passWord){
        sendKeys(userid, "userid",userId);
        sendKeys(password, "password", passWord );
        click(signOnBtn, "sign-in button");

    }


}