package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Animation {
    /*xpath
    //android.widget.TextView[@content-desc="Bouncing Balls"]
    click on screen ball will create
    //android.view.View

    //android.widget.TextView[@content-desc="Cloning"]
    click on run button
    //android.widget.Button[@content-desc="Run"]

    //android.widget.TextView[@content-desc="Custom Evaluator"]
    click on run button
    //android.widget.Button[@content-desc="Play"]

    //android.widget.TextView[@content-desc="Default Layout Animations"]
    first click on add button
    //android.widget.Button[@content-desc="Add Button"]
    then check wheather the button are created or not
    //android.widget.Button[@text="1"]

    //android.widget.TextView[@content-desc="Events"]
    play ://android.widget.Button[@content-desc="Play"]
    cancel://android.widget.Button[@content-desc="Cancel"]
    end : //android.widget.Button[@content-desc="End"]
    end check box: //android.widget.CheckBox[@content-desc="End Immediately"]

    //android.widget.TextView[@content-desc="Hide-Show Animations"]
    first click on both check boxes
    1)//android.widget.CheckBox[@content-desc="Custom Animations"]
    2)//android.widget.CheckBox[@content-desc="Hide (GONE)"]
    then click on all text boxes using there indidual xpathes
    //android.widget.Button[@text="0"]
    //android.widget.Button[@text="1"]
    //android.widget.Button[@text="2"]
    //android.widget.Button[@text="3"]
     then click on show buttons
     //android.widget.Button[@content-desc="Show Buttons"]
     then by using clickable check whether those box are visible or not


    //android.widget.TextView[@content-desc="Layout Animations"]
    click on add button: //android.widget.Button[@content-desc="Add Button"]
    checek whertr button is added : //android.widget.Button[@text="1"]



    //android.widget.TextView[@content-desc="Loading"]
    click on run button

    //android.widget.TextView[@content-desc="Multiple Properties"]
    click on run button

    //android.widget.TextView[@content-desc="Reversing"]
    click on play and reverse button
    //android.widget.Button[@content-desc="Play"]
    //android.widget.Button[@content-desc="Reverse"]


    //android.widget.TextView[@content-desc="Seeking"]
    click on run button

    //android.widget.TextView[@content-desc="View Flip"]
click on flip button //android.widget.Button[@content-desc="Flip"]
check whether the flipping is done or not

    */

    public Animation(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Bouncing Balls\"]")
    public WebElement Bouncing;
    @AndroidFindBy(xpath = "//android.view.View")
    public WebElement onScreen;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Cloning\"]")
    public WebElement Cloning;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Run\"]")
    public WebElement Run;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Custom Evaluator\"]")
    public WebElement Custom_Evaluator;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Play\"]")
    public WebElement Play;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Default Layout Animations\"]")
    public WebElement Default_Layout_Animations;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Add Button\"]")
    public WebElement Add_Button;
    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"1\"]")
    public WebElement added_Button;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Events\"]")
    public WebElement Events;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Cancel\"]")
    public WebElement Cancel;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"End\"]")
    public WebElement End;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc=\"End Immediately\"]")
    public WebElement End_Immediately;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Hide-Show Animations\"]")
    public WebElement Hide_Show_Animations;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc=\"Custom Animations\"]")
    public WebElement Custom_Animations;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc=\"Hide (GONE)\"]")
    public WebElement Hide;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Show Buttons\"]")
    public WebElement Show_Buttons;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Layout Animations\"]")
    public WebElement Layout_Animations;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Loading\"]")
    public WebElement Loading;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Multiple Properties\"]")
    public WebElement Multiple_Properties;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Reversing\"]")
    public WebElement Reversing;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Reverse\"]")
    public WebElement Reverse;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Seeking\"]")
    public WebElement Seeking;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"View Flip\"]")
    public WebElement View_Flip;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Flip\"]")
    public WebElement Flip;


    public void Added_ButtonIsDisplayed(int cout, AppiumDriver driver) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        for (int i = 1; i <= cout; i++) {
            driver.findElement(By.xpath("//android.widget.Button[@text=" + i + "]")).isDisplayed();
            System.out.println(i + ": Button is added");
        }
    }

    public void HideButtonsOnClicking(AppiumDriver driver) {
        for (int i = 0; i <= 3; i++) {
            driver.findElement(new By.ByXPath("//android.widget.Button[@text=" + i + "]")).click();
        }
    }

    public void Show_ButtonIsDisplayed(AppiumDriver driver) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        for (int i = 0; i <= 3; i++) {
            driver.findElement(By.xpath("//android.widget.Button[@text=" + i + "]")).isDisplayed();

        }
        System.out.println("All buttons are visible");
    }

}
