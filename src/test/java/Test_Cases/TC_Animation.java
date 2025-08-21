package Test_Cases;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.Animation;
import pageObjects.HomePage;

import java.net.MalformedURLException;

import static Base.DriverSetup.APIDemoApp;

public class TC_Animation {
    HomePage homePage;
    AppiumDriver driver;
    Animation animation;


    @BeforeMethod
    public void LaunchHomePage() throws MalformedURLException {
        this.driver = APIDemoApp();
    }
    @Test
    public void TC_Sanity_Animation(){
        homePage = new HomePage(driver);
        homePage.Animation.click();
        animation = new Animation(driver);
        animation.Bouncing.click();
        homePage.backPage(driver);
        animation.Cloning.click();
        animation.Run.click();
        homePage.backPage(driver);
        animation.Custom_Evaluator.click();
        animation.Play.click();
        homePage.backPage(driver);
        animation.Default_Layout_Animations.click();
        homePage.clickMultipleTimes(3,animation.Add_Button);
        animation.Added_ButtonIsDisplayed(3,driver);
        homePage.backPage(driver);
        animation.Events.click();
        animation.Play.click();
        animation.End_Immediately.click();
        animation.End.click();
        animation.Cancel.click();
        homePage.backPage(driver);
        animation.Hide_Show_Animations.click();
        animation.Custom_Animations.click();
        animation.Hide.click();
        animation.HideButtonsOnClicking(driver);
        animation.Show_Buttons.click();
        animation.Show_ButtonIsDisplayed(driver);
        homePage.backPage(driver);
        animation.Layout_Animations.click();
        homePage.clickMultipleTimes(4,animation.Add_Button);
        animation.Added_ButtonIsDisplayed(4,driver);
        homePage.backPage(driver);
        animation.Loading.click();
        animation.Run.click();
        homePage.backPage(driver);
        animation.Multiple_Properties.click();
        animation.Run.click();
        homePage.backPage(driver);
        animation.Reversing.click();
        animation.Play.click();
        animation.Reverse.click();
        homePage.backPage(driver);
        animation.Seeking.click();
        animation.Run.click();
        homePage.backPage(driver);
        animation.View_Flip.click();
        animation.Flip.click();
        homePage.backPage(driver);
    }

    @AfterMethod
    public void quitDriver(){
        driver.quit();
    }

}
