package com.automation.screens;

import com.automation.utils.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomeScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Home\")")
    WebElement btnHome;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"WEBDRIVER\")")
    WebElement lblHomeTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Webview\")")
    WebElement btnWebview;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Login\")")
    WebElement btnLogin;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Forms\")")
    WebElement btnForms;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Swipe\")")
    WebElement btnSwipe;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Drag\")")
    WebElement btnDrag;


    public HomeScreen(AppiumDriver driver) {
        super(driver);
    }

    public boolean isHomeScreen() {
        return lblHomeTitle.isDisplayed();
    }

    public WebviewScreen tapOnWebviewButton() {
        click(btnWebview);
        return new WebviewScreen(driver);
    }

    public LoginScreen tapOnLoginButton() {
        click(btnLogin);
        return new LoginScreen(driver);
    }

    public FormsScreen tapOnFormsButton() {
        click(btnForms);
        return new FormsScreen(driver);
    }

    public  SwipeScreen tapOnSwipeButton() {
        click(btnSwipe);
        return new SwipeScreen(driver);
    }

    public  DragScreen tapOnDragButton() {
        click(btnDrag);
        return new DragScreen(driver);
    }

}
