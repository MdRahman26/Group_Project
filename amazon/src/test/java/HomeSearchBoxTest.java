import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeSearchBoxTest extends  CommonAPI{


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




}
