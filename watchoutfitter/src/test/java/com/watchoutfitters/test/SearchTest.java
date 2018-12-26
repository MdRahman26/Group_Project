package com.watchoutfitters.test;

import driverconnectivity.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchTest extends CommonAPI {

    @Test
    public void SearchTest() {
        driver.get("https://www.watchoutfitters.com");
        driver.findElement(By.id("search-toggle")).click();
        driver.findElement(By.cssSelector("div#search")).sendKeys("watch");
        driver.findElement(By.xpath("//*[@id=\"search\"]/div/div/form/span")).click();






    }
}