package com.automation.screens;

import com.automation.utils.BaseScreen;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Login / Sign up Form\")")
    WebElement lblLoginTitle;

    public LoginScreen(AppiumDriver driver) {
        super(driver);
    }

    public boolean isLoginScreen() {
        return lblLoginTitle.isDisplayed();
    }


}
