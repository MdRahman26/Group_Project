package test.regular;

import driverconnectivity.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {

@BeforeMethod
    public void titleTest(){
    driver.get("http://www.amazon.com");
}

@Test //(groups = {"titlebar"})
    public void checkIconTest(){

    String iconText = driver.findElement(By.linkText("Orders")).getText();
    String expectedText ="Orders";

    Assert.assertEquals(iconText,expectedText);
    System.out.println("The Icon named 'Order' passed Successfully");



 }

@Test (priority = 2)//groups = {"titlebar"})
    public void checkIcon2Test(){

    driver.findElement(By.partialLinkText("Account & Lists")).click();
    boolean showingLoginPage = driver.findElement(By.id("createAccountSubmit")).isDisplayed();
    Assert.assertEquals(true,showingLoginPage);
    System.out.println("The Account & List displaying properly");
}

@Test //(groups = {"titlebar"})
    public void cartTest(){
    Assert.assertTrue(driver.findElement(By.partialLinkText("Cart")).isDisplayed());

}
@Test(priority = 3)
    public void primeTryTest(){

    driver.findElement(By.id("nav-link-prime")).click();
    String tryPrime = driver.findElement(By.id("prime-header-CTA-announce")).getText();
    Assert.assertEquals("TRY PRIME",tryPrime);
    System.out.println("The Test passed of Try Prime button");
}

@Test

    public void generalLinksTest(){
    Assert.assertEquals(true,
            driver.findElement(By.partialLinkText("Whole Foods")).isEnabled());
    driver.findElement(By.partialLinkText("Whole Foods")).click();
    System.out.println("The link of Whole Food is working Properly");

}

@Test
    public void addressTest() throws InterruptedException {

    String deliverCheck =driver.findElement(By.id("glow-ingress-line1")).getText();
    System.out.println(deliverCheck);

    Assert.assertEquals("Deliver to",deliverCheck);



}





































}

