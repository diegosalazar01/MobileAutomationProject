package com.automation.screens;

import com.automation.utils.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DragScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Drag and Drop\")")
    WebElement lblDragTitle;

    @AndroidFindBy(className = "android.view.ViewGroup")
    List<WebElement> squareImagePlaceHolders;

    @AndroidFindBy(className = "android.widget.ImageView")
    List<WebElement> squareImages;

    public DragScreen(AppiumDriver driver) {
        super(driver);
    }

    public boolean isDragScreen() {
        isElementDisplayed(lblDragTitle);
        for (int i = 0; i < squareImagePlaceHolders.size(); i++) {
            isElementDisplayed(squareImagePlaceHolders.get(i));
        }
        for (int j = 0; j < squareImages.size(); j++) {
            isElementDisplayed(squareImages.get(j));
        }
        return true;
    }
}
