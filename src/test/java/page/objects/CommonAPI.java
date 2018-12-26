package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CommonAPI {
    protected WebDriver driver = null;

    @Parameters({/*"useCloudEnv","cloudEnvName", */"os",  "browserName", "browserVersion", "url"})
    @BeforeTest
    public void setUp(@Optional("chrome") String browserName, @Optional("windows") String os, @Optional("http://automationpractice.com/index") String url, @Optional("74") String browserVersion)throws IOException {

        getLocalDriver(browserName,os);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        driver.get(url);

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }



    public WebDriver getLocalDriver(String browserName, String os) {
        if (browserName.equalsIgnoreCase("chrome")) {
            if (os.equalsIgnoreCase("windows")) {
                System.setProperty("webdriver.chrome.driver", "../generic/drivers/chromedriver");
                driver = new ChromeDriver();
            } else if (os.equalsIgnoreCase("mac")) {
                System.setProperty("webdriver.chrome.driver", "../generic/drivers/chromedriver");
                driver = new ChromeDriver();
            }
        } else if (browserName.equalsIgnoreCase("firefox")) {
            if (os.equalsIgnoreCase("windows")) {
                System.setProperty("webdriver.gecko.driver", "../generic/drivers/chromedriver");
                driver = new ChromeDriver();
            } else if (os.equalsIgnoreCase("mac")) {
                System.setProperty("webdriver.gecko.driver", "../generic/drivers/chromedriver");
                driver = new ChromeDriver();
            }
        }
        return driver;
    }

    @AfterTest
    public void closeOut(){
        driver.manage().deleteAllCookies();
        driver.quit();
    }

}
