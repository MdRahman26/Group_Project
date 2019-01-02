package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InvalidLoginPage {

    @FindBy(how = How.XPATH, xpath = "//*[@id=\"pageerrors\"]/div/strong/strong")
    private WebElement errorMessage;


}
