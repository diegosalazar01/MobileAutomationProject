package com.automation.screens;

import com.automation.utils.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomeScreen extends BaseScreen {

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc=\"Home-screen\"]/android.view.ViewGroup/android.widget.ImageView[1]")
    WebElement imgHomeScreen;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"WEBDRIVER\")")
    WebElement lblHomeTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Demo app for the appium-boilerplate\")")
    WebElement lblHomeDescription;

    @AndroidFindBy(id = "00000000-0000-005f-ffff-ffff0000001f")
    WebElement imgHomeAppleIcon;

    @AndroidFindBy(id = "00000000-0000-005f-ffff-ffff00000020")
    WebElement imgHomeAndroidIcon;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Support\")")
    WebElement lblHomeSupportText;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Webview\")")
    WebElement btnWebviewScreen;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Login\")")
    WebElement btnLoginScreen;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Forms\")")
    WebElement btnFormsScreen;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Swipe\")")
    WebElement btnSwipeScreen;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Drag\")")
    WebElement btnDragScreen;


    public HomeScreen(AppiumDriver driver) {
        super(driver);
    }

    public boolean isHomeScreen() {
        isElementDisplayed(imgHomeScreen);
        isElementDisplayed(lblHomeTitle);
        isElementDisplayed(lblHomeDescription);
        isElementDisplayed(lblHomeSupportText);

        return true;
    }

    public WebviewScreen tapOnWebviewButton() {
        click(btnWebviewScreen);
        return new WebviewScreen(driver);
    }

    public LoginScreen tapOnLoginButton() {
        click(btnLoginScreen);
        return new LoginScreen(driver);
    }

    public FormsScreen tapOnFormsButton() {
        click(btnFormsScreen);
        return new FormsScreen(driver);
    }

    public  SwipeScreen tapOnSwipeButton() {
        click(btnSwipeScreen);
        return new SwipeScreen(driver);
    }

    public  DragScreen tapOnDragButton() {
        click(btnDragScreen);
        return new DragScreen(driver);
    }

}
