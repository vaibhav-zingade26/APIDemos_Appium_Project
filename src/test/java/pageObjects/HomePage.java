package pageObjects;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage {
    /*
    xPath:
       Access'ibility: //android.widget.TextView[@content-desc="Access'ibility"]
       ModuleAccessibility: //android.widget.TextView[@content-desc="ModuleAccessibility"]
       //android.widget.TextView[@content-desc="Animation"]
       //android.widget.TextView[@content-desc="App"]
       //android.widget.TextView[@content-desc="Content"]
       //android.widget.TextView[@content-desc="Graphics"]
       //android.widget.TextView[@content-desc="Media"]
       //android.widget.TextView[@content-desc="NFC"]
       //android.widget.TextView[@content-desc="OS"]
       //android.widget.TextView[@content-desc="Preference"]
       //android.widget.TextView[@content-desc="Text"]
       //android.widget.TextView[@content-desc="Views"]

        public homePage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//*[@text='Argentina']")
    public WebElement country;
*/
    public HomePage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Access'ibility\"]")
    public WebElement Access;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Accessibility\"]")
    public WebElement Accessibility;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Animation\"]")
    public WebElement Animation;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"App\"]")
    public WebElement App;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Content\"]")
    public WebElement Content;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Graphics\"]")
    public WebElement Graphics;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Media\"]")
    public WebElement Media;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"NFC\"]")
    public WebElement NFC;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"OS\"]")
    public WebElement OS;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Preference\"]")
    public WebElement Preference;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Text\"]")
    public WebElement Text;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Views\"]")
    public WebElement Views;

    public void backPage(AppiumDriver driver) {
        driver.navigate().back();
    }

    public void quitDriver(AppiumDriver driver){
        driver.quit();
    }

    public void clickMultipleTimes(int count, WebElement ele) {
        for (int i = 1; i <= count; i++) {
            ele.click();
        }
    }

    public void scrollUptoString(AppiumDriver driver,String a){
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" +a+ "\").instance(0))"));
    }

    public void clickOnTextView(AppiumDriver driver, String b){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//android.widget.TextView[@content-desc=\""+b+"\"]")).click();
    }

    public void clickOnTextViewText(AppiumDriver driver, String b){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//android.widget.TextView[@text=\""+b+"\"]")).click();
    }

    public void clickOnButton(AppiumDriver driver, String c){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//android.widget.Button[@content-desc=\""+c+"\"]")).click();
    }

    //android.widget.TextView[@content-desc="Animation"]


    public String getTextfromUI(WebElement ele){
        return ele.getText();
    }

    public void sendKeyToUI(WebElement ele,String keys){
        ele.sendKeys(keys);
    }
}
