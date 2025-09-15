package com.automation.screens;

import com.automation.utils.BaseScreen;
import com.automation.utils.TestData;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Login / Sign up Form\")")
    WebElement lblLoginTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Sign up\")")
    WebElement btnSignUp;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Email\")")
    WebElement txtLoginEmail;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Password\")")
    WebElement txtLoginPassword;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(16)")
    WebElement btnLogin;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/alertTitle\")")
    WebElement lblLoginAlertTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/message\")")
    WebElement lblLoginAlertMessage;

    public LoginScreen(AppiumDriver driver) {
        super(driver);
    }

    public boolean isLoginScreen() {
        return lblLoginTitle.isDisplayed();
    }

    public SignUpScreen tapOnSignUpButton() {
        click(btnSignUp);
        return new SignUpScreen(driver);
    }

    public void enterLoginEmail(String email) {
        sendKeys(txtLoginEmail, email);
    }

    public void enterLoginPassword(String password) {
        sendKeys(txtLoginPassword, password);
    }

    public void tapOnLoginButton() {
        click(btnLogin);
    }

    public void fillLoginForm() {
        enterLoginEmail(TestData.getGeneratedEmail());
        enterLoginPassword(TestData.getGeneratedPassword());
        tapOnLoginButton();
    }

    public boolean isLoggedInMessageDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblLoginAlertTitle));
        WebElement element1 = wait.until(ExpectedConditions.visibilityOf(lblLoginAlertMessage));
        return true;
    }

}
