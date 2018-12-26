package test.pageobjects;

import driverconnectivity.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.home.NavigationBarLink1;

public class TestNavigationBar1 extends CommonAPI {

    NavigationBarLink1 objectOfNavBar = null;
    @BeforeMethod
    public void initilization(){
        objectOfNavBar = PageFactory.initElements(driver, NavigationBarLink1.class);
        driver.manage().window().maximize();
    }

    @Test
    public void yourAmazonTest(){
    objectOfNavBar.yourAmazon();
    }
    @Test //invalid selector
    public void yearEndDealsTest(){
        objectOfNavBar.yearEndDeals();
    }

    @Test
    public void giftcards(){
        objectOfNavBar.giftcards();

    }
    @Test
    public void wholeFoodsTest(){
        objectOfNavBar.wholeFoods();
    }
    @Test
    public void registryTest(){
        objectOfNavBar.registry();
    }

    @Test
    public void sellTest(){

        objectOfNavBar.sell();



    }
    @Test
    public void helpTest(){
        objectOfNavBar.help();
    }



}
