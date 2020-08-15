package base;

import com.sponzer.automation.page.tipapp.MainPage;
import com.sponzer.automation.page.tipapp.SettingsPage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class TestSuiteBase {
    public AndroidDriver driver;
    public MainPage main;
    public SettingsPage settings;

    @Parameters({ "PLATFORM_NAME","VERSION","NODEURL", "UDID", "SYSTEMPORT" })
    @BeforeClass(alwaysRun=true)
    public void setup(String platform, String version, String nodeUrl, String udid, String systemport) throws MalformedURLException
    {
        driver = getDriverAndroidInstance(platform, version , nodeUrl, udid, systemport);
        main = PageFactory.initElements(driver, MainPage.class);
        settings = PageFactory.initElements(driver,SettingsPage.class);



    }

    public static AndroidDriver getDriverAndroidInstance(String platform, String version , String nodeUrl, String UDID,
                                                         String SYSTEMPORT)
            throws MalformedURLException {
        String nodeURL = nodeUrl;
        AndroidDriver driver = null;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        File app = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\apk\\", "FasTip.apk");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "org.traeg.fastip");
        capabilities.setCapability("appActivity","org.traeg.fastip.MainActivity");
        capabilities.setCapability("version", version);
        capabilities.setCapability("systemPort",SYSTEMPORT);
        capabilities.setCapability("udid",UDID);
        driver = new AndroidDriver<>(new URL(nodeURL), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        return driver;
    }

    @AfterClass
    public void afterTest() {
        driver.quit();
    }
}