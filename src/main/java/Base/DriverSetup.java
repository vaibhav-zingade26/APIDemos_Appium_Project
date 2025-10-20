package Base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
//import io.appium.java_client.remote.options.Setting;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverSetup {


    public static AndroidDriver APIDemoApp() throws MalformedURLException {
        AndroidDriver driver;
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("autoGrantPermissions", true);
        cap.setCapability("deviceName", "Vaibhav Zingade");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "16");
        cap.setCapability("automationName", "uiAutomator2");
        cap.setCapability("newCommandTimeout", 60);
        cap.setCapability("chromedriverAutodownload", true);
        cap.setCapability("appPackage", "io.appium.android.apis");
        cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
        cap.setCapability("enforceXPath1", true);
        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AndroidDriver(url,cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }


}
