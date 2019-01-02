package test.page.objects;

import sheet.google.api.GoogleSheetReader;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.LogInPage;
import reporting.TestLogger;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import static application.page.base.ApplicationPageBase.loadProperties;

public class LogInUsingGoogleApiTest extends CommonAPI {

    LogInPage objLoginPage = null;
    HomePage objHomePage = null;


    @BeforeMethod
    public void initializationOfElements() {

        objLoginPage= PageFactory.initElements(driver, LogInPage.class);
        objHomePage = PageFactory.initElements(driver, HomePage.class);
    }


    @DataProvider(name = "googleSheet")
    public Object[][] getTestDataFromGoogleSheet() throws IOException {

        Properties properties = loadProperties();
        String spreadsheetId = properties.getProperty("GOOGLE.spreadsheetId");
        String range = properties.getProperty("GOOGLE.range");

        //  String[][] data = GoogleSheetReader.getSpreadSheetRecordsToSupplyDataProvider(spreadsheetId, range);
        String[][] data = GoogleSheetReader.getSpreadSheetRecordsToSupplyDataProviderAlternativeWay(spreadsheetId,range);
        return data;

    }

    @Test(dataProvider = "googleSheet")
    public  void invalidSignIn(String email, String password, String expectedErrorMessage){

        objHomePage.getLogInPage();
        objLoginPage.login(email, password);
        String expectedText = expectedErrorMessage;
        String actualText = objLoginPage.getErrorMessage();
        Assert.assertEquals(actualText, expectedText);
    }


    @Test(enabled = false)
    public  void invalidSignInByGoogleSheetApi() throws IOException {

        Properties properties = loadProperties();
        String spreadsheetId = properties.getProperty("GOOGLE.spreadsheetId");
        String range = properties.getProperty("GOOGLE.range");
        TestLogger.log("Using Sheet Number " + range.charAt(5)+ " and fields range  " + range.substring(6));
        List<List<Object>> getRecords = GoogleSheetReader.getSpreadSheetRecords(spreadsheetId,range);

        objHomePage.getLogInPage();

        for (List cell: getRecords) {

            objLoginPage.login(cell.get(0).toString(), cell.get(1).toString());

            String expectedText = cell.get(2).toString();

            String actualText = objLoginPage.getErrorMessage();
            Assert.assertEquals(actualText, expectedText);

        }
    }
}
