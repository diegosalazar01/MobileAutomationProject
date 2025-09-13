package com.automation.screens;

import com.automation.utils.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class DragScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Drag and Drop\")")
    WebElement lblDragTitle;

    public DragScreen(AppiumDriver driver) {
        super(driver);
    }

    public boolean isDragScreen() {
        return lblDragTitle.isDisplayed();
    }
}
