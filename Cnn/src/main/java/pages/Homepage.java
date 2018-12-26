package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage {


@FindBy  ( how = How.PARTIAL_LINK_TEXT, partialLinkText = "Entertainment")
private WebElement newsentertainment;

public void clickonEntertainment(){
    newsentertainment.click();

}}