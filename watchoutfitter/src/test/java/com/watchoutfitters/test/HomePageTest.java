package com.watchoutfitters.test;

import com.watchoutfitters.pages.HomePage;
import driverconnectivity.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomePageTest extends CommonAPI {

    HomePage objOfHomePage=null;

    @BeforeMethod
    public void initializationOfElements() {
        objOfHomePage = PageFactory.initElements(driver, HomePage.class);
    }
//    @Test
//    public void contactUsLinkTest(){
//        objOfHomePage.clickingContactUsLink();
//    }
//    @Test
//    public void logoAndEmailTest(){
//        objOfHomePage.outfitterAndEmailLinks();
//     }
//     @Test
//     public void searchLinkTest(){
//        objOfHomePage.searchLink();
//     }
//     @Test
//    public void shoppingCartLinkTest(){
//        objOfHomePage.shoppingCartLink();
//     }
     @Test
    public void shopHoverOverMenuTest() throws InterruptedException {
        objOfHomePage.shopHoverOverMenu();
     }






}
