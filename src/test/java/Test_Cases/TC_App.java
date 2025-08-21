package Test_Cases;

import Base.String_Button;
import Base.String_TextView;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.Animation;
import pageObjects.App;
import pageObjects.HomePage;

import java.net.MalformedURLException;
import static Base.DriverSetup.APIDemoApp;


public class TC_App implements String_TextView, String_Button {
    AppiumDriver driver;
    HomePage homePage;
    App app;



    @BeforeMethod
    public void LaunchHomePage() throws MalformedURLException {
        this.driver = APIDemoApp();
        homePage = new HomePage(driver);
        homePage.App.click();
        app=new App(driver);
    }

   /* @AfterMethod
    public void quitDriver(){
        driver.quit();
    }*/

    @Test
    public void TC_Sanity_App() throws MalformedURLException {
        app.Action_Bar.click();
        homePage.backPage(driver);
        app.Activity.click();
        homePage.backPage(driver);
        app.Alarm.click();
        homePage.backPage(driver);
        app.Alert_Dialogs.click();
        homePage.backPage(driver);
        app.Device_Admin.click();
        homePage.backPage(driver);
        app.Fragment.click();
        homePage.backPage(driver);
        app.Launcher_Shortcuts.click();
        homePage.backPage(driver);
        app.Loader.click();
        homePage.backPage(driver);
        app.Menu.click();
        homePage.backPage(driver);
        app.Notification.click();
        homePage.backPage(driver);
        app.Search.click();
        homePage.backPage(driver);
        app.Service.click();
        homePage.backPage(driver);
        homePage.scrollUptoString(driver,"Voice Recognition");
        app.Text_To_Speech.click();
        homePage.backPage(driver);
        app.Voice_Recognition.click();
        homePage.backPage(driver);

    }

    @Test
    public void TC_ActionBar(){
        app.Action_Bar.click();
        app.Action_Bar_Mechanics.click();
        homePage.backPage(driver);
        app.Action_Bar_Tabs.click();
        app.Add_new_tab.click();
        app.Remove_all_tabs.click();
        app.Toggle_tab_mode.click();
        app.Remove_last_tab.click();
        homePage.backPage(driver);
        app.Action_Bar_Usage.click();
        homePage.backPage(driver);
        app.Action_Provider.click();
        app.Settings_Action_Provider.click();
        homePage.backPage(driver);
        app.Share_Action_Provider.click();
        app.Display_Options.click();
        app.DISPLAY_HOME_AS_UP.click();
        app.DISPLAY_SHOW_HOME.click();
        app.DISPLAY_USE_LOGO.click();
        app.DISPLAY_SHOW_TITLE.click();
        app.DISPLAY_SHOW_CUSTOM.click();
        app.Navigation.click();
        app.Cycle_Custom_View_Gravity.click();
        homePage.backPage(driver);
    }

    @Test
    public void TC_Activity_animation(){
        app.Activity.click();
        homePage.clickOnTextView(driver,animation);
        homePage.clickOnButton(driver,Fade_In);
        homePage.clickOnButton(driver,long_Msg);
        Assert.assertEquals(homePage.getTextfromUI(app.msgOnApp),Expected_Msg);
        app.OK.click();
        homePage.clickOnButton(driver,Text_Entry_Dialog);
        homePage.sendKeyToUI(app.Name,"Tom");
        homePage.sendKeyToUI(app.Password,"1234");
        app.OK.click();
    }





}
