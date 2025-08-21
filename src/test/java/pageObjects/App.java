package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class App {

    /*xpath
 //android.widget.TextView[@content-desc="Action Bar"]
 //android.widget.TextView[@content-desc="Activity"]
 //android.widget.TextView[@content-desc="Alarm"]
 //android.widget.TextView[@content-desc="Alert Dialogs"]
 //android.widget.TextView[@content-desc="Device Admin"]
 //android.widget.TextView[@content-desc="Fragment"]
 //android.widget.TextView[@content-desc="Launcher Shortcuts"]
 //android.widget.TextView[@content-desc="Loader"]
 //android.widget.TextView[@content-desc="Menu"]
 //android.widget.TextView[@content-desc="Notification"]
 //android.widget.TextView[@content-desc="Search"]
 //android.widget.TextView[@content-desc="Service"]
 //android.widget.TextView[@content-desc="Text-To-Speech"]
 //android.widget.TextView[@content-desc="Voice Recognition"]
*/
    public App(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Action Bar\"]")
    public WebElement Action_Bar;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Activity\"]")
    public WebElement Activity;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Alarm\"]")
    public WebElement Alarm;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Alert Dialogs\"]")
    public WebElement Alert_Dialogs;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Device Admin\"]")
    public WebElement Device_Admin;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Fragment\"]")
    public WebElement Fragment;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Launcher Shortcuts\"]")
    public WebElement Launcher_Shortcuts;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Loader\"]")
    public WebElement Loader;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Menu\"]")
    public WebElement Menu;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Notification\"]")
    public WebElement Notification;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Search\"]")
    public WebElement Search;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Service\"]")
    public WebElement Service;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Text-To-Speech\"]")
    public WebElement Text_To_Speech;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Voice Recognition\"]")
    public WebElement Voice_Recognition;

    /// App Bar
    /*
    //android.widget.TextView[@content-desc="Action Bar Mechanics"] click and back

    //android.widget.TextView[@content-desc="Action Bar Tabs"]
     click on buttons
    //android.widget.Button[@content-desc="Remove all tabs"]
    //android.widget.Button[@content-desc="Add new tab"]
    //android.widget.Button[@content-desc="Toggle tab mode"]
    //android.widget.Button[@content-desc="Remove all tabs"]

    //android.widget.TextView[@content-desc="Action Bar Usage"] click and back

    //android.widget.TextView[@content-desc="Action Provider"]

        //android.widget.TextView[@content-desc="Settings Action Provider"] click and back
        //android.widget.TextView[@content-desc="Share Action Provider"] it will coem autoamtaicaly on display

    //android.widget.TextView[@content-desc="Display Options"]
      //android.widget.Button[@content-desc="DISPLAY_HOME_AS_UP"] click
     //android.widget.Button[@content-desc="DISPLAY_SHOW_HOME"] click
     //android.widget.Button[@content-desc="DISPLAY_USE_LOGO"]
     //android.widget.Button[@content-desc="DISPLAY_SHOW_TITLE"]
     //android.widget.Button[@content-desc="DISPLAY_SHOW_CUSTOM"]
     //android.widget.Button[@content-desc="Navigation"]
     //android.widget.Button[@content-desc="Cycle Custom View Gravity"]

     */

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Action Bar Mechanics\"]")
    public WebElement Action_Bar_Mechanics;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Action Bar Tabs\"]")
    public WebElement Action_Bar_Tabs;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Remove all tabs\"]")
    public WebElement Remove_all_tabs;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Remove last tab\"]")
    public WebElement Remove_last_tab;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Add new tab\"]")
    public WebElement Add_new_tab;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Toggle tab mode\"]")
    public WebElement Toggle_tab_mode;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Action Bar Usage\"]")
    public WebElement Action_Bar_Usage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Action Provider\"]")
    public WebElement Action_Provider;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Settings Action Provider\"]")
    public WebElement Settings_Action_Provider;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Share Action Provider\"]")
    public WebElement Share_Action_Provider;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Display Options\"]")
    public WebElement Display_Options;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"DISPLAY_HOME_AS_UP\"]")
    public WebElement DISPLAY_HOME_AS_UP;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"DISPLAY_SHOW_HOME\"]")
    public WebElement DISPLAY_SHOW_HOME;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"DISPLAY_USE_LOGO\"]")
    public WebElement DISPLAY_USE_LOGO;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"DISPLAY_SHOW_TITLE\"]")
    public WebElement DISPLAY_SHOW_TITLE;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"DISPLAY_SHOW_CUSTOM\"]")
    public WebElement DISPLAY_SHOW_CUSTOM;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Navigation\"]")
    public WebElement Navigation;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Cycle Custom View Gravity\"]")
    public WebElement Cycle_Custom_View_Gravity;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"android:id/button1\"]")
    public WebElement OK;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/message\"]")
    public WebElement msgOnApp;

    @AndroidFindBy(id = "io.appium.android.apis:id/username_edit")
    public WebElement Name;

    @AndroidFindBy(id = "io.appium.android.apis:id/password_edit")
    public WebElement Password;


}
