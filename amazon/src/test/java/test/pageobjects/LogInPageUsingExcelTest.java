package test.pageobjects;

import base.BrowserDriver;
import com.xlsx.api.MyDataReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.objects.LogInPage;
import java.io.File;

public class LogInPageUsingExcelTest extends BrowserDriver {

    LogInPage objOfLogInPage = null;

    @BeforeMethod
    public void initializationOfObject() {
        objOfLogInPage = PageFactory.initElements(driver, LogInPage.class);
    }

    @Test
    public void logInTest(){

        objOfLogInPage.login("aaafnan@hjkl.com","765432");
        //Assert.
    }

    @DataProvider(name="DP")
    public Object[][] getTestData() throws Exception{
        File filepath = new File(System.getProperty("user.dir") +  "/src/test/testData/TestData.xlsx");
        com.xlsx.api.MyDataReader dr = new MyDataReader();
        //Show me where is data file
        dr.setExcelFile(filepath.getAbsolutePath());
        String[][] data = dr.getExcelSheetData("Sheet1");
        return data;
    }

    @Test (dataProvider ="DP" )
    public void invalidSignInReadingExcelFile(String emailaddress,String enterpassword){
        objOfLogInPage.getlogin();
        objOfLogInPage.login(emailaddress,enterpassword);
        Assert.assertTrue(objOfLogInPage.getErrorMeassage());
    }

}