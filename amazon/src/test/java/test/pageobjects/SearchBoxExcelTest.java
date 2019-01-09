package test.pageobjects;

import application.page.base.ApplicationPageBase;
import base.BrowserDriver;
import com.xlsx.api.MyDataReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.objects.SeachBoxElementsForExcel;
import page.objects.SearchBox;

import java.io.File;

public class SearchBoxExcelTest extends BrowserDriver {
    SearchBox objOfSearchBox = null;
    SeachBoxElementsForExcel elmOfSearchBox= null;
    @BeforeMethod
    public void initializationOfObj(){
        objOfSearchBox = PageFactory.initElements(driver,SearchBox.class);
        elmOfSearchBox = PageFactory.initElements(driver,SeachBoxElementsForExcel.class);

    }

    //reading data from excel file
   @DataProvider(name = "Diff_Section")
   public Object[][] getDifferentSectionTestData() throws Exception{
       File filepath = new File(System.getProperty("user.dir") +  "/src/test/testData/diff_section.xlsx");
       com.xlsx.api.MyDataReader dr = new MyDataReader();
       //Show me where is data file
       dr.setExcelFile(filepath.getAbsolutePath());
       String[][] data = dr.getExcelSheetData("Sheet1");
       return data;
   }

    @Test(dataProvider = "Diff_Section")
    public void differentSectionTest(String product_search, String confirm_message) {
    objOfSearchBox.searchTextBox(product_search);
    WebElement productMatch = elmOfSearchBox.matchElement(product_search);
    String returnText =  ApplicationPageBase.getDepartmentName(productMatch);
    Assert.assertEquals(returnText,confirm_message);

    }

}
