package test.pageobjects;

import base.BrowserDriver;
import google.sheet.api.GoogleSheetReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.LogInPage;
import reporting.TestLogger;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import static application.page.base.ApplicationPageBase.loadProperties;

public class LogInUsingGoogleApiTest extends BrowserDriver {



    LogInPage objOfLogInPage = null;

    @BeforeMethod
    public void initializationOfObject() {
        objOfLogInPage = PageFactory.initElements(driver, LogInPage.class);
    }

    @Test
    public void invalidSigninByGoogleSheetApi() throws IOException {

        Properties properties = loadProperties();
        String spreadsheetId = properties.getProperty("GOOGLE.spreadsheetId");
        String range = properties.getProperty("GOOGLE.range");
        TestLogger.log("Using Sheet Number " + range.charAt(5) + " and fields range  " + range.substring(6));
        List<List<Object>> getRecords = GoogleSheetReader.getSpreadSheetRecords(spreadsheetId, range);

        objOfLogInPage.getlogin();

        for (List cell : getRecords) {

            objOfLogInPage.login(cell.get(0).toString(), cell.get(1).toString());

            Assert.assertTrue(objOfLogInPage.getErrorMeassage());


            //String expectedText = cell.get(2).toString();

 //           String actulText = objOfLogInPage.getErrorMeassage();




        }


}


}
