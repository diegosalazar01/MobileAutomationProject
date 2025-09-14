package com.automation.tests;

import com.automation.screens.HomeScreen;
import com.automation.screens.LoginScreen;
import com.automation.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void SuccessfulLoginTest() {
        HomeScreen homeScreen = new HomeScreen(driver);

        LoginScreen loginScreen = homeScreen.tapOnLoginButton();
        Assert.assertTrue(loginScreen.isLoginScreen(), "Login Screen Not Displayed");

        loginScreen.enterLoginEmail("Diego2@gmail.com");
        loginScreen.enterLoginPassword("Diego1223");
        loginScreen.tapOnLoginButton();
        Assert.assertTrue(loginScreen.isLoggedInMessageDisplayed(), "Login Message Not Displayed");
    }
}
