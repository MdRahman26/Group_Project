package test.page.objects;

import com.util.xlsx.reader.MyDataReader;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.LogInPage;

import java.io.File;

import static application.page.base.ApplicationPageBase.sendKeys;


public class LogInPageTest extends CommonAPI {
    LogInPage objOfLoginPage = null;
    HomePage objOfHomePage=null;

    @BeforeMethod
    public void initializationOfElements() {
        objOfLoginPage = PageFactory.initElements(driver, LogInPage.class);
    }

    @Test
    public void LogInTest() {
        objOfLoginPage.InvalidLogIn();

    }

    @Test
    public void ValidLogInTest() {
        objOfLoginPage.ValidLogIn();

    }
    @Test
    public void logInTest(){
        objOfLoginPage.login("hussain.ziyad90@gmail.com","khan1212");
    }


//    @DataProvider(name="DP")
//    public Object[][] getTestData() throws Exception{
//        File filepath = new File(System.getProperty(("user.dir") +  "/testData/TestData.xlsx"));
//        MyDataReader dr = new MyDataReader();//
//        //Show me where is data file
//        dr.setExcelFile(filepath.getAbsolutePath());
//        String[][] data = dr.getExcelSheetData("Sheet3");
//        return data;
//    }
//
//    @Test(dataProvider = "DP")
//    public  void invalidSignIn(String email, String password, String expectedErrorMessage){
//        objOfHomePage.getLogInPage();
//        objOfLoginPage.login(email, password);
//        String expectedText = expectedErrorMessage;
//        String actualText = objOfLoginPage.getErrorMessage();
//        Assert.assertEquals(actualText, expectedText);
//
//    }

}























