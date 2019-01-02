package test.pages;


import base.BrowserDriver;
import com.xlsx.api.MyDataReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;

import java.io.File;

public class TestHomePage extends BrowserDriver {

    HomePage homePage =null;

    @BeforeMethod
    public void initializationOfElements(){
    homePage= PageFactory.initElements(driver, HomePage.class);
    }


    @Test
    public void navigateToAbout(){
        homePage.clickOnAbout();
    }

    @Test
    public void navigateToCustomerService(){
        homePage.clickOnCS();
    }


    @Test
    public void test(){
        homePage.clickFinancialEducation();

    }

/*

    @Test
    public void navigateToRates(){
        homePage.clickOnRates();
    }*/

    @DataProvider(name="DPExcel")
    public Object[][] getTestData() throws Exception{
        File filepath = new File(System.getProperty("user.dir") +  "/src/testData/TestData.xlsx");
        MyDataReader dr = new MyDataReader();

        dr.setExcelFile(filepath.getAbsolutePath());

        String[][] data = dr.getExcelSheetData("Sheet1");
        return data;
    }



    @Test(dataProvider = "DPExcel")
    public  void invalidSignin(String userID, String passWord){

        homePage.signInIDAndPw(userID, passWord);
       /* String expected = expectedErroMessage;
        String actulText = objLoginPage.getErroMessage();
        Assert.assertEquals(actulText, expectedText);*/

    }


}
