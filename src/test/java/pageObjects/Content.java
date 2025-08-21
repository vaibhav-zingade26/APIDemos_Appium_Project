package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Content {

    public Content(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"io.appium.android.apis:id/text\"]")
    public WebElement read_assert;

    @AndroidFindBy(xpath = "//android.widget.Spinner[@resource-id=\"io.appium.android.apis:id/clip_type\"]")
    public WebElement spinner;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Text clip\"]")
    public WebElement Text_clip;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/text1\"]")
    public WebElement Data_Type_Selected;
}
