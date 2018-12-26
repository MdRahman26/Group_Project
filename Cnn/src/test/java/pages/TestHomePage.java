package pages;

import driverconnectivity.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {
 Homepage homepage = null;

 @BeforeMethod
    public void initializeElements(){
     homepage = PageFactory.initElements(driver, Homepage.class);
 }

 @Test
 public void navigatetoEntertainment(){
    homepage.clickonEntertainment();
 }

}