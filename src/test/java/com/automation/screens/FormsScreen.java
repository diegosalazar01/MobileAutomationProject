package com.automation.screens;

import com.automation.utils.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class FormsScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Form components\")")
    WebElement lblFormTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(8)")
    WebElement frmFormScreen;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"RNE__Input__text-input\")")
    WebElement frmInputText;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"input-text-result\")")
    WebElement frmInputValue;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"switch\")")
    WebElement frmSwitch;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"text_input\")")
    WebElement frmDropDown;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(17)")
    WebElement frmActiveButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(19)")
    WebElement frmInactiveButton;
    public FormsScreen(AppiumDriver driver) {
        super(driver);
    }

    public boolean isFormScreen() {
        isElementDisplayed(lblFormTitle);
        isElementDisplayed(frmFormScreen);
        isElementDisplayed(frmInputText);
        isElementDisplayed(frmInputValue);
        isElementDisplayed(frmSwitch);
        isElementDisplayed(frmDropDown);
        isElementDisplayed(frmActiveButton);
        isElementDisplayed(frmInactiveButton);

        return true;
    }

}
