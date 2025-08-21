package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class ModuleAccessibility {
    /* xPath
    //android.widget.TextView[@content-desc="ModuleAccessibility Node Provider"]

    //android.widget.TextView[@content-desc="ModuleAccessibility Node Querying"]
    inside checkBox (7 checkboxes are present)
    (//android.widget.CheckBox[@resource-id="io.appium.android.apis:id/tasklist_finished"])[1-7]

    //android.widget.TextView[@content-desc="ModuleAccessibility Service"]
    //android.widget.TextView[@content-desc="Custom View"]

          public homePage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//*[@text='Argentina']")
    public WebElement country;

    */

 public ModuleAccessibility(AppiumDriver driver){
     PageFactory.initElements(new AppiumFieldDecorator(driver),this);
 }

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Accessibility Node Provider\"]")
    public WebElement Provider ;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Accessibility Node Querying\"]")
    public WebElement Querying;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Accessibility Service\"]")
    public WebElement Service;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Custom View\"]")
    public WebElement View;

    public void clickOnElement( AppiumDriver driver,int count){
        for(int i=1;i<=count;i++){
            try {
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                driver.findElement(new By.ByXPath("(//android.widget.CheckBox[@resource-id=\"io.appium.android.apis:id/tasklist_finished\"])["+i+"]")).click();

            }catch (NoSuchElementException e){
                System.out.println("CheckBox is on index: "+i);
            }
        }
    }

}
