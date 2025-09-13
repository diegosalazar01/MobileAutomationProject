package com.automation.screens;

import com.automation.utils.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class FormsScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Form components\")")
    WebElement lblFormTitle;

    public FormsScreen(AppiumDriver driver) {
        super(driver);
    }

    public boolean isFormScreen() {
        return lblFormTitle.isDisplayed();
    }

}
