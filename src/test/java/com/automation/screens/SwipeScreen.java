package com.automation.screens;

import com.automation.utils.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SwipeScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Swipe horizontal\")")
    WebElement lblSwipeTitle;

    public SwipeScreen(AppiumDriver driver) {
        super(driver);
    }

    public boolean isSwipeScreen() {
        return lblSwipeTitle.isDisplayed();
    }
}
