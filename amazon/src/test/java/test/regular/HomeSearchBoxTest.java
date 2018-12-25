package test.regular;

import driverconnectivity.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomeSearchBoxTest extends CommonAPI {

    @BeforeMethod

    public void titleTest(){
        driver.get("http://www.amazon.com");
        String title = driver.getTitle();
        String actualText = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        Assert.assertEquals(actualText,title);
    }

    @Test
    public void searchBoxTest()
    {
        Assert.assertEquals(true,
                driver.findElement(By.id("twotabsearchtextbox")).isEnabled());
        System.out.println("Search box is working");


    }


    @Test
    public void searchButtonTest() throws InterruptedException {

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macbook air 15 inch");
//        Thread.sleep(3000);
        driver.findElement(By.className("nav-input")).click();

        System.out.println("Text-box searching working with search button");

        Assert.assertEquals("Computers & Accessories",driver.findElement(By.partialLinkText("Computers & Accessories")).getText());

        driver.navigate().back();


    }

    @Test (priority = 3)
    public void dropDownBoxTest(){

        Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));

        dropdown.selectByVisibleText("Computers");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macbook air 15 inch");
//        Thread.sleep(3000);
        driver.findElement(By.className("nav-input")).click();
        Assert.assertEquals("Computers & Accessories",driver.findElement(By.partialLinkText("Computers & Accessories")).getText());

        driver.navigate().back();
        Select dropDownReselect = new Select(driver.findElement(By.id("searchDropdownBox")));
        System.out.println("Dropdown back to All Department option");

        dropDownReselect.selectByVisibleText("All Departments");



    }


    @Test
    public void searchBoxEnterTest(){
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
                searchBox.sendKeys("Aeron Chair");
                searchBox.sendKeys(Keys.ENTER);



        Assert.assertEquals("Managerial Chairs & Executive Chairs",driver.findElement(By.partialLinkText("Managerial Chairs & Executive Chairs")).getText());
        driver.navigate().back();
    }


    @Test (priority = 5)
    public void mainMenuTest() throws InterruptedException {

        driver.findElement(By.id("nav-hamburger-menu")).click();
        Thread.sleep(2000);

        boolean signInLink =driver.findElement(By.id("hmenu-customer-name")).isEnabled();
        Assert.assertEquals(true,signInLink);
        System.out.println("Main Menu button on HomePage passed");
    }


    @Test(priority = 1)
    public void accountListDropDownTest() throws InterruptedException {

        WebElement dropdown = driver.findElement(By.partialLinkText("Account & Lists"));

        Actions action = new Actions(driver);

        action.moveToElement(dropdown).perform();
        Thread.sleep(3000);

        String confirmDropDown = driver.findElement(By.partialLinkText("Create a List")).getText();

        Assert.assertEquals("Create a List",confirmDropDown);

        System.out.println("Test passed Account & List dropdown is Working ");

        driver.navigate().back();


    }


    @Test (priority = 8)
    public void radioDropDownTest() throws InterruptedException {

        WebElement radiodropdown = driver.findElement(By.className("icp-nav-globe-img-2"));

        Actions action = new Actions(driver);

        action.moveToElement(radiodropdown).perform();
//        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[1]/span/i")).click();
                        Thread.sleep(3000);

//        driver.switchTo().alert().dismiss();

        String spanishWord= driver.findElement(By.id("nav-your-amazon")).getText();
        System.out.println(spanishWord);
        Assert.assertEquals("Tu amazon.com",spanishWord);

        System.out.println("Test passsed of Selecting radio Button on home page to Spanish language");




    }







}
