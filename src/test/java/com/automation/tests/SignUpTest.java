package com.automation.tests;

import com.automation.screens.HomeScreen;
import com.automation.screens.LoginScreen;
import com.automation.screens.SignUpScreen;
import com.automation.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest {

    @Test
    public void createAccount() {
        HomeScreen homeScreen = new HomeScreen(driver);

        LoginScreen loginScreen = homeScreen.tapOnLoginButton();

        loginScreen.isLoginScreen();

        SignUpScreen signUpScreen = loginScreen.tapOnSignUpButton();
        signUpScreen.isSignUpScreen();

        signUpScreen.fillSignUpForm();
        Assert.assertTrue(signUpScreen.isSignedUpMessageDisplayed(), "Sign Up Message Not Displayed");
    }
}
