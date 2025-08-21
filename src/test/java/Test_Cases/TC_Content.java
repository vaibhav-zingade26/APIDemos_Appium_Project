package Test_Cases;

import Base.String_TextView;
import Base.UI_String;
import io.appium.java_client.AppiumDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.Content;
import pageObjects.HomePage;

import java.net.MalformedURLException;

import static Base.DriverSetup.APIDemoApp;

public class TC_Content implements String_TextView, UI_String {
    AppiumDriver driver;
    HomePage homePage;
    Content content;

    @BeforeClass
    public void gotoContentTab() throws MalformedURLException {
        this.driver = APIDemoApp();
        homePage=new HomePage(driver);
        homePage.Content.click();
    }

    @Test
    public void TC_Assets(){
        homePage.clickOnTextView(driver,Assets);
        homePage.clickOnTextView(driver,Read_Asset);
        content=new Content(driver);
        String UIValue=content.read_assert.getText();
        System.out.println(UIValue);
        homePage.backPage(driver);
        homePage.backPage(driver);
    }

    @Test
    public void TC_Clipboard(){
        homePage.clickOnTextView(driver,Clipboard);
        homePage.clickOnTextView(driver,Data_Types);
        content=new Content(driver);
        content.spinner.click();
        content.Text_clip.click();
        String expectedString="Text clip";
        Assert.assertEquals(content.Data_Type_Selected.getText(),expectedString,"Value is not matching");
        homePage.backPage(driver);
        homePage.backPage(driver);
    }

    @Test
    public void regression(){
        System.out.println("Vaibhav Zingade");
    }

      @Test
    public void regression_1(){
        System.out.println("Kishor Gavali");
    }

    @Test
    public void regression_2(){
        System.out.println("    ");
    }

    @AfterClass
    public void closeApp(){
        homePage.quitDriver(driver);
    }
}
