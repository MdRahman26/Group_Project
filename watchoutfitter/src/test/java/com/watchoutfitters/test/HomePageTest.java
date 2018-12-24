package com.watchoutfitters.test;

import driverconnectivity.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class HomePageTest extends CommonAPI {
@Test
    public void SearchTest(){
    driver.findElement(By.id("search-toggle")).sendKeys("Watch");


}



}
