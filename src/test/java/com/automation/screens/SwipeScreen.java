package com.automation.screens;

import com.automation.utils.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SwipeScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Swipe horizontal\")")
    WebElement lblSwipeTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Or swipe vertical to find what I'm hiding.\")")
    WebElement lblSwipeDescription;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"card\").instance(0)")
    WebElement crdSwipeScreen;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"slideTextContainer\").instance(0)")
    WebElement crdTextContainer;

    public SwipeScreen(AppiumDriver driver) {
        super(driver);
    }

    public boolean isSwipeScreen() {
        isElementDisplayed(lblSwipeTitle);
        isElementDisplayed(lblSwipeDescription);
        isElementDisplayed(crdSwipeScreen);
        isElementDisplayed(crdTextContainer);
        return true;
    }
}
