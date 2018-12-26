package com.watchoutfitters.test;

import com.watchoutfitters.pages.ShoppingCartPage;
import driverconnectivity.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShoppingCartTest extends CommonAPI {

    ShoppingCartPage objOfShoppingCartPage=null;

    @BeforeMethod
    public void initializationOfElements(){
        objOfShoppingCartPage= PageFactory.initElements(driver,ShoppingCartPage.class);
    }

    @Test
    public void selectingAWatch() {

        objOfShoppingCartPage.selectingAWatch();
    }
    @Test
    public void checkOutTest(){
        objOfShoppingCartPage.enteringInfoToCheckOut();
    }

    }

