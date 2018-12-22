import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

    protected WebDriver driver = null;

    @Parameters({/*"useCloudEnv","cloudEnvName", */"os",  "browserName", "browserVersion", "url"})
    @BeforeTest
    public void setUp(@Optional("chrome") String browserName, @Optional("windows") String os, @Optional("http://www.amazon.com") String url, @Optional("74") String browserVersion)throws IOException {

        getLocalDriver(browserName,os);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get(url);

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }



    public WebDriver getLocalDriver(String browserName, String os) {
        if (browserName.equalsIgnoreCase("chrome")) {
            /*ChromeOptions options =new ChromeOptions();
            options.setHeadless(true);
            options.addArguments("--start-maximized");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--incognito");

            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            */if (os.equalsIgnoreCase("windows")) {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saeed\\Desktop\\amazon_testCase\\Group_Project\\generics\\drivers\\chromedriver.exe");
                driver = new ChromeDriver();
            } else if (os.equalsIgnoreCase("mac")) {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saeed\\Desktop\\amazon_testCase\\Group_Project\\generics\\drivers\\chromedriver");
                driver = new ChromeDriver();
            }
        } else if (browserName.equalsIgnoreCase("firefox")) {
            if (os.equalsIgnoreCase("windows")) {
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\Saeed\\Desktop\\amazon_testCase\\Group_Project\\generics\\drivers\\geckodriver.exe");
                driver = new ChromeDriver();
            } else if (os.equalsIgnoreCase("mac")) {
                System.setProperty("webdriver.gecko.driver", "NOT USING MAC ;(");
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
