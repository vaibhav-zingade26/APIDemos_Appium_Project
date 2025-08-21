package Test_Cases;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.View;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static Base.DriverSetup.APIDemoApp;
import static Base.String_TextView.*;

public class TC_ComplexCases {
    AppiumDriver driver;
    HomePage homePage;
    View view;

    @BeforeMethod
    public void LaunchHomePage() throws MalformedURLException {
        this.driver = APIDemoApp();
    }

    @Test
    public void verifyExpandableLists() {
        homePage = new HomePage(driver);
        homePage.clickOnTextView(driver, Views);
        homePage.clickOnTextView(driver, Expandable_Lists);
        homePage.clickOnTextView(driver, Custom_Adaptor);
        //view = new View(driver);
        List<WebElement> list = driver.findElements(new By.ByXPath(TextView));
        List<String> Names = new ArrayList<>();
        for (WebElement l : list) {
            System.out.println(l.getText());
            Names.add(l.getText());
        }
        System.out.println("Names in list:");
        System.out.println("Now click on each and every Names");

        for (int i = 1; i < Names.size(); i++) {
            System.out.println(Names.get(i));
            homePage.clickOnTextViewText(driver, Names.get(i));
        }
        System.out.println("After clicking all names,store and print each and every names");
        List<WebElement> all_names = driver.findElements(new By.ByXPath(TextView));
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        //List<WebElement> all_names=driver.findElements(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text"));
        List<String> eachNames = new ArrayList<>();

        for (WebElement a : all_names) {
            //System.out.println(a.getText());
            eachNames.add(a.getText());
        }
        eachNames.removeAll(Names);
        for(String name:eachNames){
            System.out.println(name);
        }
    }


}
