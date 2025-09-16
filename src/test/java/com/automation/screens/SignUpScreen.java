package com.automation.screens;

import com.automation.utils.BaseScreen;
import com.automation.utils.TestData;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Email\")")
    WebElement txtSignUpEmail;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Password\")")
    WebElement txtSignUpPassword;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Confirm password\")")
    WebElement txtSignUpConfirmPassword;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(17)")
    WebElement btnSignUp;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/alertTitle\")")
    WebElement lblSignUpAlertTitle;

    public SignUpScreen(AppiumDriver driver) {
        super(driver);
    }

    public boolean isSignUpScreen() {
        return isElementDisplayed(txtSignUpEmail) &&
        isElementDisplayed(txtSignUpPassword) &&
        isElementDisplayed(txtSignUpConfirmPassword);
    }

    public void enterSignUpEmail(String email) {
        sendKeys(txtSignUpEmail, email);
    }

    public void enterSignUpPassword(String password) {
        sendKeys(txtSignUpPassword, password);
    }

    public void enterSignUpConfirmPassword(String confirmPassword) {
        sendKeys(txtSignUpConfirmPassword, confirmPassword);
    }

    public void tapOnSignUpButton() {
        click(btnSignUp);
    }

    public void fillSignUpForm() {
        TestData.generateSignUpData();
        enterSignUpEmail(TestData.getGeneratedEmail());
        enterSignUpPassword(TestData.getGeneratedPassword());
        enterSignUpConfirmPassword(TestData.getGeneratedPassword());
        tapOnSignUpButton();
    }

    public boolean isSignedUpMessageDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblSignUpAlertTitle));
        return lblSignUpAlertTitle.isDisplayed();
    }
}
