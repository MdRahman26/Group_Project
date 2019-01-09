package test.pageobjects;

import application.page.base.ApplicationPageBase;
import base.BrowserDriver;
import google.sheet.api.GoogleSheetReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.SeachBoxElementsForExcel;
import page.objects.SearchBox;
import reporting.TestLogger;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import static application.page.base.ApplicationPageBase.loadProperties;

public class SearchBoxGoogleApiTest extends BrowserDriver {

    SearchBox objOfSearchBox = null;
    SeachBoxElementsForExcel elmOfSearchBox =null;

    @BeforeMethod
    public void initializationOfObject() {
        objOfSearchBox = PageFactory.initElements(driver, SearchBox.class);
        elmOfSearchBox = PageFactory.initElements(driver, SeachBoxElementsForExcel.class);
    }

    @Test
    public void invalidSigninByGoogleSheetApi() throws IOException {

        Properties properties = loadProperties();
        String spreadsheetId = properties.getProperty("GOOGLE.spreadsheetId2");
        String range = properties.getProperty("GOOGLE.range2");
        TestLogger.log("Using Sheet Number " + range.charAt(5) + " and fields range  " + range.substring(6));
        List<List<Object>> getRecords = GoogleSheetReader.getSpreadSheetRecords(spreadsheetId, range);

            for (List cell : getRecords) {
                //objOfSearchBox.home();
            objOfSearchBox.searchIcon(cell.get(0).toString());
                WebElement productMatch = elmOfSearchBox.matchElement(cell.get(0).toString());
                String returnText =  ApplicationPageBase.getDepartmentName(productMatch);
                Assert.assertEquals(returnText,cell.get(1).toString());

        }
    }
}
