package Test_Cases;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.ModuleAccessibility;

import java.net.MalformedURLException;

import static Base.DriverSetup.APIDemoApp;

public class TC_Accesibility {
    AppiumDriver driver;
    HomePage homePage;
    ModuleAccessibility moduleAccessibility;

    @BeforeMethod
    public void LaunchHomePage() throws MalformedURLException {
        this.driver = APIDemoApp();
    }
    @Test
    public void Sanity_Accessibility(){
        homePage = new HomePage(driver);
        homePage.Accessibility.click();
        moduleAccessibility = new ModuleAccessibility(driver);
        moduleAccessibility.Provider.click();
        homePage.backPage(driver);
        moduleAccessibility.Querying.click();
        moduleAccessibility.clickOnElement(driver, 6);
        homePage.backPage(driver);
        moduleAccessibility.Service.click();
        homePage.backPage(driver);
        moduleAccessibility.View.click();
        homePage.backPage(driver);
    }
    @AfterMethod
    public void quitDriver(){
        driver.quit();
    }
}
